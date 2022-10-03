package com.example.privateaccountant.ui;
import android.media.Image;
import java.io.Serializable;
import java.util.Date;

public class check implements Serializable {

    String name, phone;
    Date date;
    int shotef;
    Image pic;

    public check(String name, String phone, Date date, int shotef, Image pic){
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.shotef = shotef;
        this.pic = pic;
    }

    public String getName()
    {
        return name;
    }
    public String getPhone(){ return  phone;}
    public Date getDate(){return date;}
    public int getShotefO(){return shotef;}
    public Image getPic(){return pic;}



}
