package com.example.dana.muzej.Helpers;

import java.io.Serializable;

/**
 * Created by Džana on 13.1.2017.
 */

public class News implements Serializable {


    public String naziv_dogadjaja;
    public  String slika_dogadjaja;
    public String opis_dogadjaja;

    public News(String imageUrl, String name, String AdDescription){
        this.slika_dogadjaja=imageUrl;
        this.naziv_dogadjaja=name;
        this.opis_dogadjaja=AdDescription;
    }

    public News() {
        slika_dogadjaja = null;
        naziv_dogadjaja = null;
        opis_dogadjaja = null;
    }
}

