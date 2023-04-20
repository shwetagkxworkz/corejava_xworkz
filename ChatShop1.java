class ChatShop{
static String chatNames[]={"panipuri", "dahipuri", "masala puri", "sev puri", "bel", "kachoori", "samosa", "pav bhaji", "vada pav", "misala pav", "papadi", "dhokala", "gobi manchurin", "mirachi", "noddles", "maggie"};
public static void main(String chat[])
{
System.out.println("main started");
getChatNames();
System.out.println("main ended");
}
public static void getChatNames(){
System.out.println("calling getChatNames method");
System.out.println("list of chat names");
for (int i=0; i<chatNames.length; i++)
{
System.out.println(chatNames[i]);
}
System.out.println("ended getChatNames method");
return;
}

}

