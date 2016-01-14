package com.mobaires.gymdroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobaires.gymdroid.data.Discipline;

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

        view.findViewById(R.id.go_to_row_example).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), DisciplineRowExampleActivity.class));
            }
        });

        return view;
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
