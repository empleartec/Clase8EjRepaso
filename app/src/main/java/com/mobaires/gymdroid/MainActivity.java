package com.mobaires.gymdroid;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.mobaires.gymdroid.data.Discipline;

public class MainActivity extends FragmentActivity
        implements DisciplinesListFragment.OnDisciplineSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
    }

    @Override
    public void onDisciplineSelected(Discipline discipline) {
        // TODO - if a discipline is selected, we should do something with it (show it maybe?)
        /* TODO - Si una disciplina se selecciona, debemos hacer algo con ella, como mostrarla en
                  otro fragment o abrir un nuevo activity.. */
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

        return true;
    }
}
