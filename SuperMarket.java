class SuperMarket{
static String groceries[]={"wheat","oil", "sugar", "tea powder", "moong dal", "thoor dal", "rice", "peanut", "almond", "cashew", "pista", "wheat flour", "maida flour", "ragi flour", "besan"};
static String chocolates[]={"dairy milk","silk", "kitkat", "perk", "munch", "milkybar", "cadbury", "5 star", "hareshey", "kinder", "ferrero rocher", "nestle", "galaxy", "milka"};
static String perfumes[]={"enage","calvin klein", "chanel", "gucci", "givenchy", "signature", "park avenue", "fogg", "nivea", "axe", "cargo", "wild stone", "denver", "bombay"};
static String soaps[]={"lux","mysore sandal", "life boy", "wheel", "rin", "surfexcel", "dove", "pearl", "santoor", "madimix", "chandrika", "dettol", "himalaya", "liril"};
static String brands[]={"levis","arrow", "blackberry", "jack and jhon", "mufti", "nike", "pepe jeans", "crew neck", "v neck", "ucb", "max", "trends", "peltoon", "allen solly"};

public static void main(String name[])
{
System.out.println(" list of groceries");
for (int i=0; i<groceries.length; i++)
{
System.out.println(groceries[i]);
}

System.out.println(" list of chocolates");
for ( int i=0; i<chocolates.length; i++)
{
System.out.println(chocolates[i]);
}

System.out.println(" list of perfumes");
for ( int i=0; i<perfumes.length; i++)
{
System.out.println(perfumes[i]);
}

System.out.println(" list of soaps");
for ( int i=0; i<soaps.length; i++)
{
System.out.println(soaps[i]);
}

System.out.println(" list of T shirt brands");
for ( int i=0; i<brands.length; i++)
{
System.out.println(brands[i]);
}

}
}