package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {

        Cat felix = new Cat("Felix", "Tuna", 4);

        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());
        System.out.println(felix.getAge());

        Assert.assertEquals(felix.getName(), "Felix");
        Assert.assertEquals(felix.getFavoriteFood(), "Tuna");
        Assert.assertEquals(felix.getAge(), 4);
    }

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);

        System.out.println(fido.getName());
        System.out.println(fido.getFavoriteToy());
        System.out.println(fido.getAge());

        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);

    }

    @Test
    public void creating_a_hampster() {
        Hampster rusty = new Hampster("Rusty", "Wheel", 1); //we have an operational hampster

        System.out.println(rusty.getName());
        System.out.println(rusty.getFavoriteGame());
        System.out.println(rusty.getAge());

        Assert.assertEquals(rusty.getName(), "Rusty");
        Assert.assertEquals(rusty.getFavoriteGame(), "Wheel");
        Assert.assertEquals(rusty.getAge(), 1);
    }

    @Test
    public void cat_makes_noise() {
        Cat felix = new Cat("Felix", "Tuna", 5);

        System.out.println(" Felix goes " + felix.makeNoise());
    }

    @Test
    public void dog_makes_noise(){
        Dog fido = new Dog("Fido", "Bone", 5);

        System.out.println(" Fido goes " + fido.makeNoise());

    }

    @Test
    public void pets_make_noise() {
        Pet felix = new Cat("Felix", "Tuna", 4);
        Pet fido = new Dog("Fido", "Bone", 5);
        Pet rusty = new Hampster("Rusty", "Wheel", 1);

        System.out.println(" Felix goes " + felix.makeNoise());
        System.out.println(" Fido goes " + fido.makeNoise());
        System.out.println(" Rusty goes " + rusty.makeNoise());
    }
        @Test
    public void whenADogBarks() {
        Dog fido = new Dog("Fido","Bone", 5);

        String dogSound = "Woof";
        // TODO: implement a method in the Dog sound called makeNoise() that returns the sound a dog makes: "Woof", e.g.
        dogSound = fido.makeNoise();
        System.out.println(" Fido goes " + fido.makeNoise());

        Assert.assertEquals(dogSound, "Woof");
    }
    @Test
    public void whenADogGetsFed() {
        Dog fido = new Dog("Fido","Bone", 5);

        // TODO: implement a method in the Dog sound called feed() that sets the isFed variable to true:
         fido.feed();

        System.out.println(" Fido is fed " + fido.feed());

        Assert.assertTrue(fido.feed());

    }
        @Test
    public void whenAnimalsPlay() {

        Pet fido = new Dog("Fido","Bone", 5);
        Pet spot = new Cat("Spot","String", 5);
        Pet hazel = new Hampster("Hazel", "Wheel", 1);

            System.out.println(" Fido " + fido.play());
            System.out.println(" Spot " + spot.play());
            System.out.println(" Hazel " + hazel.play());

            assertThat(fido.play(), equalTo("plays with bone"));
            assertThat(spot.play(), equalTo("plays with string"));
            assertThat(hazel.play(), equalTo("runs in wheel"));
        }


    }



