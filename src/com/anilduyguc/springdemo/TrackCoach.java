package com.anilduyguc.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }
    public void doMyCleanStuffYoYo(){
        System.out.println("TrackCoach: inside method doMyCleanStuffYoYo");
    }
}
