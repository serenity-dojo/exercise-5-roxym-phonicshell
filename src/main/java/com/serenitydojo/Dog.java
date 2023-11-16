package com.serenitydojo;

public class Dog extends Pet {
    private String favoriteToy = "Bone";
    private boolean isFed = true;
    //public static final String DOG_NOISE = "Woof";
    private String dogSound = "Woof";


    public Dog(String name, String favoriteToy, int age) {
        super (name, age);
        this.favoriteToy = favoriteToy;
        this.dogSound = makeNoise();

    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    @Override
    public String makeNoise() {
        return dogSound;
    }

    public boolean feed() {
        return isFed;
    }
    @Override
    public String play() {
        return "plays with bone";
    }

}
