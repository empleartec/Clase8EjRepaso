package com.mobaires.gymdroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mobaires.gymdroid.adapters.ListDisciplinasAdapter;
import com.mobaires.gymdroid.data.Discipline;
import com.mobaires.gymdroid.data.DisciplineStore;

import java.util.List;

/**
 * Created by cduarte on 1/14/16.
 */
public class DisciplinesListFragment extends Fragment {

    private OnDisciplineSelectedListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_disciplines_list,
                container, false);

        ListView lista = (ListView) view.findViewById(R.id.disciplinasLista);
        ListDisciplinasAdapter listaAdaptada = new ListDisciplinasAdapter(this, DisciplineStore.getAll(this.getContext()));
        lista.setAdapter(listaAdaptada);
        return view;
    }

    public void armarLista(List<Discipline> disciplinas) {

        ListView lista = (ListView) getView().findViewById(R.id.disciplinasLista);
        ListDisciplinasAdapter listaAdaptada = new ListDisciplinasAdapter(this, disciplinas);
        lista.setAdapter(listaAdaptada);
    }

    public interface OnDisciplineSelectedListener {
        void onDisciplineSelected(Discipline discipline);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnDisciplineSelectedListener) {
            listener = (OnDisciplineSelectedListener) context;
        } else {
            throw new ClassCastException(context.toString()
                    + " must implement DisciplinesListFragment.OnDisciplineSelectedListener");
        }
    }

    public void tellTheListenerThatADisciplineWasSelected(Discipline discipline) {
        listener.onDisciplineSelected(discipline);
    }

}
