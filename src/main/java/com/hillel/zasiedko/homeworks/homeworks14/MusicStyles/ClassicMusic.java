package com.hillel.zasiedko.homeworks.homeworks14.MusicStyles;

public class ClassicMusic extends MusicStyles{

    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic(MusicStyles styles) {
        System.out.println(" Classic group : " + getName());
    }
}
