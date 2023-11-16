package com.serenitydojo;

public class Hampster extends Pet{
    public String name;
    public String favoriteGame;
    public int age;

    public static final String HAMPSTER_NOISE = "Squick";

    public Hampster(String name, String favoriteGame, int age) {
        super(name, age);
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }
    @Override
    public String makeNoise() {
        return HAMPSTER_NOISE;
    }
    @Override
    public String play() {
        return "runs in wheel";
    }

}
