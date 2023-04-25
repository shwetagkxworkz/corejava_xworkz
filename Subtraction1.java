class Subtraction1{
public static void main(String subtraction[]){
System.out.println("main started");
sub(1000,500);
sub(100,50,20);
sub(80,40);
System.out.println("main ended");
}
public static void sub(int a,int b){
System.out.println(a-b);
return;
}
public static void sub(int a,int b, int c){
System.out.println(a-b-c);
return;
}
}