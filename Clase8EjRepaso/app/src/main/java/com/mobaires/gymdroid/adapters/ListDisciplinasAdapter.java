package com.mobaires.gymdroid.adapters;


import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobaires.gymdroid.DisciplinesListFragment;
import com.mobaires.gymdroid.R;
import com.mobaires.gymdroid.data.Discipline;

import java.util.List;

/**
 * Created by sebastian on 15/01/16.
 */
public class ListDisciplinasAdapter extends BaseAdapter {

    private final Fragment context;
    private List<Discipline> disciplinas;
    private DisciplinesListFragment listener;

    public ListDisciplinasAdapter(Fragment context, List<Discipline> disciplinas){

        this.context = context;
        this.disciplinas = disciplinas;
        this.listener =(DisciplinesListFragment) context;

    }

    public void setDisciplinas(List<Discipline> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public int getCount() {
        return disciplinas.size();
    }

    @Override
    public Discipline getItem(int position) {
        return disciplinas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.getItem(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context.getContext()).inflate(R.layout.itemdelista, parent, false);
        final Discipline disciplina = getItem(position);
        setContenido(view, disciplina);
        setOnClick(view, disciplina);
        return view;
    }

    private void setOnClick(View view, final Discipline disciplina) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.tellTheListenerThatADisciplineWasSelected(disciplina);
            }
        });
    }

    private void setContenido(View view, Discipline disciplina) {
        TextView disciplinaNombreView = (TextView) view.findViewById(R.id.list_item_title);
        disciplinaNombreView.setText(disciplina.getName());
        TextView disciplinalevelView = (TextView) view.findViewById(R.id.list_item_subtitle);
        disciplinalevelView.setText("Level: " + disciplina.getLevel());
        TextView disciplinaSchemaView = (TextView) view.findViewById(R.id.list_item_right_text);
        disciplinaSchemaView.setText(disciplina.getSchedule());
        ImageView disciplinaImagenView = (ImageView) view.findViewById(R.id.imagendedeporte);
        disciplinaImagenView.setImageResource(disciplina.getLogoResId());
    }

}

