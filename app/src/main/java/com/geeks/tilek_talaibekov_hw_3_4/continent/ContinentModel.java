package com.geeks.tilek_talaibekov_hw_3_4.continent;

public class ContinentModel {
    private String img;
    private String name;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContinentModel(String img, String name) {
        this.img = img;
        this.name = name;
    }
}
