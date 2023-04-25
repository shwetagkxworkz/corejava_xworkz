class Addition1{
public static void main(String addition[]){
System.out.println("main started");
add (100,100);
add(256,123,100);
System.out.println("main ended");
}

public static void add(int a, int b){
System.out.println(a+b);
return ;
}

public static void add(int a, int b, int c){
System.out.println(a+b+c);
return ;
}
}