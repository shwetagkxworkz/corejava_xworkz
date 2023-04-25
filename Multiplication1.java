class Multiplication1{
public static void main(String multiply[]){
System.out.println("main started");
multiply(4,5);
multiply(15,15,15);
System.out.println("main ended");
}
public static void multiply(int num1,int num2){
System.out.println("multiply method started");
System.out.println(num1*num2);
System.out.println("multiply method ended");
}
public static void multiply(int num1,int num2, int num3){
System.out.println("multiply method started");
System.out.println(num1*num2*num3);
System.out.println("multiply method ended");
}
}