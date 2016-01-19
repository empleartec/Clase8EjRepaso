package com.mobaires.gymdroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.mobaires.gymdroid.data.Discipline;
import com.mobaires.gymdroid.data.DisciplineStore;

import java.util.List;

public class MainActivity extends AppCompatActivity
        implements DisciplinesListFragment.OnDisciplineSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public void onDisciplineSelected(Discipline discipline) {
        // TODO - if a discipline is selected, we should do something with it (show it maybe?)
        /* TODO - Si una disciplina se selecciona, debemos hacer algo con ella, como mostrarla en
                  otro fragment o abrir un nuevo activity.. */
        boolean dual_pane = getResources().getBoolean(R.bool.dual_pane);
        if(dual_pane){
            DisciplineDetailFragment fragment = (DisciplineDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailFragment);
            fragment.setDiscipline(discipline);

        } else {
            Intent intent = new Intent (this,DetailActivity.class);
            intent.putExtra("disciplina",discipline);
            startActivity(intent);}
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(
                R.menu.menu_main, menu);

        // TODO - 1. Setup the search bar to filter disciplines by name
        // TODO - 2. Setup the share provider to share the data of the selected discipline
        // TODO - 3. The share button should be disabled until a discipline is selected
        // TODO - 4.

        // TODO - 1. Configurar la barra de búsqueda para que filtre disciplinas por nombre
        // TODO - 2. Configurar el Share Provider para que comparta los datos de la disciplina seleccionada
        // TODO - 3. El botón de compartir debería estar deshabilitado mientras no hay una disciplina selecionada



        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchview = (SearchView) MenuItemCompat.getActionView(searchItem);
        final List<Discipline> disciplinas = DisciplineStore.getAll(this);
        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener(){

            @Override
            public boolean onQueryTextSubmit(String query) {
                if(query.length()==0){((DisciplinesListFragment) getSupportFragmentManager().findFragmentById(R.id.listFragment)).armarLista(disciplinas);}
                else{
                    List<Discipline> filtradas = DisciplineStore.filtrar(disciplinas, query);
                    ((DisciplinesListFragment) getSupportFragmentManager().findFragmentById(R.id.listFragment)).armarLista(filtradas);}
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                List<Discipline> filtradas = DisciplineStore.filtrar(disciplinas, newText);
                ((DisciplinesListFragment) getSupportFragmentManager().findFragmentById(R.id.listFragment)).armarLista(filtradas);
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
