class Fan{
static boolean isConnected;
static int maxVolume=5;
static int minVolume;
static int currentVolume;
public static void main(String fan[]){
System.out.println("main started");
onOrOff();
increaseVolume();
increaseVolume();
decreaseVolume();
onOrOff();
System.out.println(" main ended");
}
public static boolean onOrOff(){
System.out.println("onOrOff method started");
if(isConnected==false){
isConnected=true;
System.out.println("fan is turned on");
}
else if(isConnected==true){
isConnected=false;
System.out.println("fan is turned off");
}
System.out.println("onOrOff method ended");
return isConnected;
}
public static int increaseVolume(){
System.out.println("increaseVolume method started");
if(isConnected==true){
if(currentVolume<maxVolume){
currentVolume=currentVolume+1;
System.out.println("current Volume"+ currentVolume);
}
else{
System.out.println("current volume reached max");
}
}
else{
System.out.println("first turn on fan");
}
System.out.println("increaseVolume method ended");
return currentVolume;
}

public static int decreaseVolume(){
System.out.println("decreaseVolume method started");
if(isConnected==true){
if(currentVolume>minVolume){
currentVolume=currentVolume-1;
System.out.println("current Volume"+ currentVolume);
}
else{
System.out.println("current volume reached min");
}
}
else{
System.out.println("first turn on fan");
}
System.out.println("decreaseVolume method ended");
return currentVolume;
}
}