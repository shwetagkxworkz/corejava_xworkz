class Hospital1
{
static String doctorNames[]={"nirnajana", "pavan", "mahantesh", "suraj", "shweta", "sumana", "sneha", "rekha", "shilpa", "vinoda", "sushmita", "sunil", "pavitra", "dhrushti", "deepa"};
public static void main(String name[])
{

System.out.println("main started");
getDoctorNames();
System.out.println("main ended");
}
public static void getDoctorNames(){
System.out.println(" calling getDoctorNames method");
System.out.println(" list of doctor names");
for (int i=0; i<doctorNames.length; i++)
{
System.out.println(doctorNames[i]);
}
System.out.println("ended getDoctorNames method");
return;
}
}