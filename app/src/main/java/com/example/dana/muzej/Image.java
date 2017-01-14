package com.example.dana.muzej;

/**
 * Created by Džana on 13.1.2017.
 */

public class Image {

    private String name;
    private String imageUri;
    private String gallery_id;

    public String getGallery_id() {
        return gallery_id;
    }

    public String getImageUri() {
        return imageUri;
    }

    public String getName() {
        return name;
    }

    public void setGallery_id(String gallery_id) {
        this.gallery_id = gallery_id;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public void setName(String name) {
        this.name = name;
    }
}

