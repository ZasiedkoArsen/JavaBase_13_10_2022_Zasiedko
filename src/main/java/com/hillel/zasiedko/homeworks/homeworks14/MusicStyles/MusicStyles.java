package com.hillel.zasiedko.homeworks.homeworks14.MusicStyles;

public abstract class MusicStyles {

    private String name;

    public MusicStyles(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void playMusic(MusicStyles musicStyles);
}
