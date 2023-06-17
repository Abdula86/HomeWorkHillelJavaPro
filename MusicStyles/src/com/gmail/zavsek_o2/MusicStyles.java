package com.gmail.zavsek_o2;

public class MusicStyles {
    public void playMusic() {
        System.out.println("Playing music");
    }
}


class PopMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing pop music");
    }
}

class RockMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing rock music");
    }
}


class ClassicMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing classic music");
    }
}