class Bar{
static String alcohol[]={"vodaka", "brandy", "kingfisher", "whiskey", "vermouth", "cognac", "beer", "port wine","rum", "gin", "tequila", "absinthe", "everclean", "royal stag", "100 pipe's"};
public static void main(String bar[])
{
System.out.println(" list of alcohol");

for(int index=0; index<=alcohol.length-1;index++)
{
	System.out.println(alcohol[index]);
}

}
}