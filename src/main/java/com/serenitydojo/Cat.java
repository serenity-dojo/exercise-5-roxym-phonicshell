package com.serenitydojo;

/**
 * A feline creature
 */
public class Cat extends Pet {

  private String favoriteFood;

  // A very useful field
    public static final String CAT_NOISE = "Meow";

    public static String favoriteFood(){
        return "Tuna";
    }

    public Cat (String name, String favoriteFood, int age){
        super(name,age);
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }
    //method returns cat noise
    @Override
    public String makeNoise(){
        return CAT_NOISE;
    }

    @Override
    public String play(){
        return "plays with string";
    }
    public void feed(String food) {
        System.out.println(getName() + " eats some " + food);
    }

    public void groom(){
        lickPaws();
        cleanFur();
    }

    private void cleanFur(){
        System.out.println(getName() + "cleans his fur");
    }
    private void lickPaws(){
        System.out.println(getName()+ "lick his paws");
    }

}
