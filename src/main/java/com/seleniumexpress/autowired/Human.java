package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;

    public Human() {
    }

//    @Autowired
    public Human(Heart heart) {
        System.out.println("Human constructor being called setting heart=" + heart);
        this.heart = heart;
    }


    public void setHeart(Heart heart) {
        System.out.println("Heart setter method");
        this.heart = heart;
    }

    public void startPumping() {
        if (heart != null) {
            heart.pump();
            System.out.println("Name of anmial is " + heart.getNameOfAnimal() + " Number of hearts is " + heart.getNoOfHeart());
         } else {
            System.out.println("No heart detected");
        }
    }

}
