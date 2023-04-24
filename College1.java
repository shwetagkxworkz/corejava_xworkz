class College1
{
static String deptName[]={"science", "commerce", "arts", "Engineering", "EEE", "ECE", "CSE", "CE", "ME", "CIVIL"};
public static void main(String name[])
{
System.out.println("main started");
getDeptName();
System.out.println(" main ended");
}
public static void getDeptName(){
System.out.println("calling getDeptName method");
getDeptName();
System.out.println("list of department names");
for (int i=0;i<deptName.length; i++)
{
System.out.println(deptName[i]);
}
System.out.println("ended getDeptName method");
return;
}

}