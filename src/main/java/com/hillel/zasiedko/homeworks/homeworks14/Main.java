package com.hillel.zasiedko.homeworks.homeworks14;

import com.hillel.zasiedko.homeworks.homeworks14.MusicStyles.ClassicMusic;
import com.hillel.zasiedko.homeworks.homeworks14.MusicStyles.MusicStyles;
import com.hillel.zasiedko.homeworks.homeworks14.MusicStyles.PopMusic;
import com.hillel.zasiedko.homeworks.homeworks14.MusicStyles.RockMusic;

public class Main {
    public static void main(String[] args) {

        MusicStyles [] groups = {
                new ClassicMusic("The Beatles"),
                new ClassicMusic("The Who"),
                new ClassicMusic("Pink Floyd"),
                new ClassicMusic("Eagles" + "\n"),

                new PopMusic("Blur"),
                new PopMusic("The Kinks"),
                new PopMusic("SugaBabes"),
                new PopMusic("Duran Duran" + "\n"),

                new RockMusic("Pearl Jam"),
                new RockMusic("Rush"),
                new RockMusic("Def Lepard"),
                new RockMusic("Kiss"),
        };

        for (MusicStyles musicStyles: groups) {
            musicStyles.playMusic(musicStyles);

        }
    }
}
