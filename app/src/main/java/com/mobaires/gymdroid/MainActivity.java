package com.mobaires.gymdroid;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.mobaires.gymdroid.data.Discipline;

public class MainActivity extends FragmentActivity
        implements DisciplinesListFragment.OnDisciplineSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onDisciplineSelected(Discipline discipline) {
        // TODO - if a discipline is selected, we should do something with it (show it maybe?)
        /* TODO - Si una disciplina se selecciona, debemos hacer algo con ella, como mostrarla en
                  otro fragment o abrir un nuevo activity.. */
    }
}
