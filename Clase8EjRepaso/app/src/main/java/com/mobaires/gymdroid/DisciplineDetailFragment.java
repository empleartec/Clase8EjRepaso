package com.mobaires.gymdroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobaires.gymdroid.data.Discipline;

/**
 * Created by cduarte on 1/14/16.
 */
public class DisciplineDetailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discipline_detail, container, false);
        return view;
    }

    public void setDiscipline(Discipline discipline) {
        ((TextView)getView().findViewById(R.id.detalle)).setText(discipline.getDescription());
        ((TextView)getView().findViewById(R.id.horariodetail)).setText(discipline.getSchedule());
        ((TextView)getView().findViewById(R.id.precio)).setText(""+discipline.getPrice());
        ((TextView)getView().findViewById(R.id.leveldetail)).setText(""+discipline.getLevel());
        ((TextView)getView().findViewById(R.id.titulodetail)).setText(discipline.getName());
        ((ImageView)getView().findViewById(R.id.imagendedeportedetalle)).setImageResource(discipline.getLogoResId());
    }

}
