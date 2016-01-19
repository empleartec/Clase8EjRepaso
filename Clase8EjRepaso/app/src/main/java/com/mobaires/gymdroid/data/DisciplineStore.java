package com.mobaires.gymdroid.data;

import android.content.Context;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.mobaires.gymdroid.R;

/**
 * Created by cduarte on 1/14/16.
 */
public class DisciplineStore {

    public static List<Discipline> getAll(Context ctx) {

        List<Discipline> disciplines = new ArrayList<>();
        disciplines.add(new Discipline(ctx, R.string.disc_fencing, R.string.schedule_1, 1, 100, R.drawable.ic_fencing, R.string.disc_fencing_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_fire, R.string.schedule_2, 1, 100, R.drawable.ic_fire, R.string.disc_fire_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_gaming, R.string.schedule_3, 1, 100, R.drawable.ic_gaming, R.string.disc_gaming_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_racing, R.string.schedule_4, 1, 100, R.drawable.ic_racing, R.string.disc_racing_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_reading, R.string.schedule_1, 1, 100, R.drawable.ic_reading, R.string.disc_reading_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_relay_race, R.string.schedule_2, 1, 100, R.drawable.ic_relay_race, R.string.disc_relay_race_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_shooting, R.string.schedule_3, 1, 100, R.drawable.ic_shooting, R.string.disc_shooting_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_speed_running, R.string.schedule_4, 1, 100, R.drawable.ic_speed, R.string.disc_speed_running_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_typing, R.string.schedule_1, 1, 100, R.drawable.ic_typing, R.string.disc_typing_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_walking, R.string.schedule_2, 1, 100, R.drawable.ic_walking, R.string.disc_walking_desc));

        disciplines.add(new Discipline(ctx, R.string.disc_fencing, R.string.schedule_1, 2, 100, R.drawable.ic_fencing, R.string.disc_fencing_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_fire, R.string.schedule_2, 2, 100, R.drawable.ic_fire, R.string.disc_fire_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_gaming, R.string.schedule_3, 2, 100, R.drawable.ic_gaming, R.string.disc_gaming_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_racing, R.string.schedule_4, 2, 100, R.drawable.ic_racing, R.string.disc_racing_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_reading, R.string.schedule_1, 2, 100, R.drawable.ic_reading, R.string.disc_reading_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_relay_race, R.string.schedule_2, 2, 100, R.drawable.ic_relay_race, R.string.disc_relay_race_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_shooting, R.string.schedule_3, 2, 100, R.drawable.ic_shooting, R.string.disc_shooting_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_speed_running, R.string.schedule_4, 2, 100, R.drawable.ic_speed, R.string.disc_speed_running_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_typing, R.string.schedule_1, 2, 100, R.drawable.ic_typing, R.string.disc_typing_desc));
        disciplines.add(new Discipline(ctx, R.string.disc_walking, R.string.schedule_2, 2, 100, R.drawable.ic_walking, R.string.disc_walking_desc));

        return disciplines;
    }

    public static List<Discipline> filtrar(List<Discipline> disciplinas,String nombre) {
       List<Discipline> disciplinasADevolver = new ArrayList<Discipline>();

        for (Discipline disciplina : disciplinas) {
            if(disciplina.equals(nombre)){
                disciplinasADevolver.add(disciplina);
            }
        }
        return disciplinasADevolver;
    }
}
