package com.hillel.zasiedko.homeworks.homeworks14.MusicStyles;

public class RockMusic extends MusicStyles{

    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic(MusicStyles styles) {
        System.out.println(" Rock band : " + getName());
    }
}
