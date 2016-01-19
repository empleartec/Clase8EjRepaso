package com.mobaires.gymdroid;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.mobaires.gymdroid.data.Discipline;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_URL = "url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getBoolean(R.bool.dual_pane)){
            finish();
            return;
        }



        Discipline disciplina = (Discipline) getIntent().getParcelableExtra("disciplina");

        setContentView(R.layout.activity_detail);
        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            String url = extras.getString(EXTRA_URL);

            DisciplineDetailFragment detailFragment = (DisciplineDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailFragment);
            detailFragment.setDiscipline(disciplina);
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
