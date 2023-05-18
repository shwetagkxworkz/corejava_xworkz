package com.xworkz.robot;

public class RobotTester {
    public static void main(String[] args) {
        Robot robot1=new Robot("ballie", "south korea", "samsung",2020);
        System.out.println(robot1.name+ " " + robot1.country + " " +  robot1.creator + " " + robot1.year);

        Robot robot2=new Robot("bellabot", "china", "pudutech",2020);
        System.out.println(robot2.name+ " " +robot2.country + " " + robot2.creator + " " + robot2.year);

        Robot robot3=new Robot("C astra", "india", "inventro robotics",2020);
        System.out.println(robot3.name+ " " +robot3.country + " " + robot3.creator + " " + robot3.year);

        Robot robot4=new Robot("jivaka", "india", "parel workshop",2020);
        System.out.println(robot4.name+ " " +robot4.country + " " + robot4.creator + " " + robot4.year);

        Robot robot5=new Robot("mars cat", "china", "elephant robotics", 2017);
        System.out.println(robot5.name+ " " +robot5.country + " " + robot5.creator + " " + robot5.year);

    }
}
