class Hotstar{
static String hindi[]={"hostages", "criminal justice", "grahan", "aarya", "rudra", "empire", "hanuman", "malgudi days", "imlie", "pariwar", "masoom", "ishqbaaz", "annapoornna", "dear ishq", "mahabharata"};
static String kannada[]={"kantara", "KGF 2", "muddumanigalu", "honaganasu", "radha krishana", "mahabharata", "sita ram", "jenu gudu", "marali manasagidhe", "aragini", "trible riding", "vikrant rona", "bombat bojana", "james", "yuvaratna"};

public static void main(String name[])
{
System.out.println("list of hindi movies names ");
for (int i=0; i<hindi.length; i++)
{
System.out.println(hindi[i]);
}

System.out.println("list of kannada movies names ");
for (int i=0; i<kannada.length; i++)
{
System.out.println(kannada[i]);
}
}
}