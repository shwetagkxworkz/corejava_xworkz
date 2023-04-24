class Hotstar1{
static String hindi[]={"sherni", "raazi", "tumbbad", "newton", "kapoorand sons", "trapped", "parched", "shanghai", "titli", "patan", "ludo", "thar", "torbaaz", "article", "chopsticks"};
static String kannada[]={"sita ram", "balagam", "maja ma", "dia", "shuddhi", "yuvarathana", "trible ridin", "dil pasanda", "vedha", "mock tail 2", "trible riding", "vikrant rona", "kottigobaa 3", "james", "yuvaratna"};

public static void main(String name[])
{
System.out.println("main started");
getHindi();
getKannada();
System.out.println("main ended");
}
public static void getHindi(){
System.out.println("calling getHindi method");
System.out.println("list of hindi movies names ");
for (int i=0; i<hindi.length; i++)
{
System.out.println(hindi[i]);
}
System.out.println("ended getHindi method");
return;
}

public static void getKannada(){
System.out.println("calling getKannada method");
System.out.println("list of Kannada movies names ");
for (int i=0; i<kannada.length; i++)
{
System.out.println(kannada[i]);
}
System.out.println("ended getKannada method");
return;
}
}

	