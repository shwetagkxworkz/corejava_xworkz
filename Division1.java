class Division1{
public static void main(String divide[]){
System.out.println("main started");
divide(40,5);
divide(20,2);
divide(500,25,4);
System.out.println("main ended");
}
public static void divide(int num1,int num2){
System.out.println("divide method started");
System.out.println(num1/num2);
System.out.println("divide method ended");
return;
}
public static void divide(int num1,int num2, int num3){
System.out.println("divide method started");
System.out.println(num1/num2/num3);
System.out.println("divide method ended");
return;
}
}