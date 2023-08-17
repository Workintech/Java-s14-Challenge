package com.workintech.burger.main;

import com.workintech.burger.model.BreadRollType;
import com.workintech.burger.model.DeluxeBurger;
import com.workintech.burger.model.Hamburger;
import com.workintech.burger.model.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", BreadRollType.WRAP, 3.56);

        hamburger.addAddition("Tomato", 0.27);

        hamburger.addAddition("Lettuce", 0.75);

        hamburger.addAddition("Cheese", 1.13);

        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger",BreadRollType.SANDWICH, 5.67);

        healthyBurger.addAddition("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger();

        db.addAddition("Should not do this", 50.53);

        db.itemizeHamburger();
    }
}