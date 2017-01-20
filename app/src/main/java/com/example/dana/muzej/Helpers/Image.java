package com.example.dana.muzej.Helpers;

import java.io.Serializable;

/**
 * Created by Džana on 13.1.2017.
 */

public class Image implements Serializable {


    public String name;
    public  String image1;
    public String AdDescription;

    public Image(String imageUrl, String name, String AdDescription){
        this.image1=imageUrl;
        this.name=name;
        this.AdDescription=AdDescription;
    }

    public Image() {
        image1 = null;
        name = null;
        AdDescription = null;
    }
}

