package com.xworkz.river;

public class RiverTester {
    public static void main(String[] args) {
        River river1=new River("ganga","varanasi",2525, "devprayag");
        System.out.println(river1.name+ " " + river1.location + " " + river1.length+ " " + river1.origin);

        River river2=new River("indus river", "tibetan plateau",3180, "lake manasarovar");
        System.out.println(river2.name+ " " + river2.location + " " + river2.length+ " " + river2.origin);

    }
}
