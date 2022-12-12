package com.hillel.zasiedko.homeworks.homeworks14.MusicStyles;

public class PopMusic extends MusicStyles{

    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic(MusicStyles styles) {
        System.out.println(" Pop group : " + getName());
    }
}
