package com.mobaires.gymdroid.data;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Gym Discipline
 * <br/>-<br/>
 * Disciplina, Ejercicio o Deporte.
 * Created by cduarte on 1/14/16.
 */
public class Discipline  implements Parcelable{

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

    protected Discipline(Parcel in) {
        name = in.readString();
        schedule = in.readString();
        level = in.readInt();
        price = in.readInt();
        logoResId = in.readInt();
        description = in.readString();
    }

    public static final Creator<Discipline> CREATOR = new Creator<Discipline>() {
        @Override
        public Discipline createFromParcel(Parcel in) {
            return new Discipline(in);
        }

        @Override
        public Discipline[] newArray(int size) {
            return new Discipline[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(schedule);
        dest.writeInt(level);
        dest.writeInt(price);
        dest.writeInt(logoResId);
        dest.writeString(description);
    }

    public boolean equals(String string){

        return name.toLowerCase().contains(string.toLowerCase());
    }
}