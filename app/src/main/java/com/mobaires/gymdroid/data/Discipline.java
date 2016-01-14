package com.mobaires.gymdroid.data;

import android.content.Context;

/**
 * Gym Discipline
 * <br/>-<br/>
 * Disciplina, Ejercicio o Deporte.
 * Created by cduarte on 1/14/16.
 */
public class Discipline {

    private String name;
    private String schedule;
    private int level;
    private int price;
    private int logoResId;
    private String description;

    public Discipline(Context ctx, int nameResId, int scheduleResId, int level, int price, int logoResId, int descriptionResId) {
        this(ctx.getString(nameResId), ctx.getString(scheduleResId),
                level, price, logoResId, ctx.getString(descriptionResId));
    }

    public Discipline(String name, String schedule, int level, int price, int logoResId, String description) {
        this.name = name;
        this.schedule = schedule;
        this.level = level;
        this.price = price;
        this.logoResId = logoResId;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLogoResId() {
        return logoResId;
    }

    public void setLogoResId(int logoResId) {
        this.logoResId = logoResId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}