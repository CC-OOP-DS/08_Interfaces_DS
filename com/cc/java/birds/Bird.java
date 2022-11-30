package com.cc.java.birds;

import com.cc.java.bees.HoneyBee;
import com.cc.java.interfaces.Feathers;
import com.cc.java.interfaces.Flyable;


public class Bird implements Flyable, Feathers
{

    @Override
    public String fly() {
        return "I'm a bird, I can fly fast!";
    }
    
    @Override
    public String hasFeathers(){
        return "Back in black";
    }
    
}
