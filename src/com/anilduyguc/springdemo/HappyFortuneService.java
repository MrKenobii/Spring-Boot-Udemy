package com.anilduyguc.springdemo;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        String[] fortuneArray = {"Today is your lucky day!", "You will have the best of luck!", "You will hit the jackpot!"};
        return fortuneArray[(int)(Math.random() * fortuneArray.length)];
    }
}
