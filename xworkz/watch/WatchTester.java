package com.xworkz.watch;

public class WatchTester {
    public static void main(String[] args) {
        Watch watch6=new Watch("analog", "timer",1299, "brown");
        System.out.println(watch6.type + " "+ watch6.brand + "  "+ watch6.price+ " " + watch6.color);

        Watch watch7=new Watch("digital", "hala",1299, "black");
        System.out.println(watch7.type + " "+ watch7.brand + "  "+ watch7.price+ " " + watch7.color);

        Watch watch8=new Watch("analog", "lorenz",1000, "black");
        System.out.println(watch8.type + " " + watch8.brand + "  " + watch8.price + " " + watch8.color);

        Watch watch9=new Watch("analog", "sonata", 1374, "silver");
        System.out.println(watch9.type + " " + watch9.brand + "  " + watch9.price + " " + watch9.color);

        Watch watch10=new Watch("analog", "HYMT",2999, "gold");
        System.out.println(watch10.type + " "+ watch10.brand + "  "+ watch10.price + " " + watch10.color);

    }
}
