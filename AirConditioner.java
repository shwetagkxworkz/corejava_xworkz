class AirConditioner{
static boolean isConnected;
static int maxVolume=50;
static int minVolume;
static int currentVolume;

public static void main(String conditioner[]){
System.out.println("main started");
boolean connected=onOrOff();
System.out.println("air condittioner is connected"+ connected);
increaseVolume();
increaseVolume();
increaseVolume();
decreaseVolume();
decreaseVolume();

onOrOff();
System.out.println("main ended");
}
public static boolean onOrOff(){
System.out.println("onOrOff method started");
if(isConnected==false){
 isConnected=true;
 System.out.println("air conditioner is turned on");
}
else if(isConnected==true){
isConnected=false;
System.out.println("air conditioner is turned off");
}
System.out.println("onOrOff method ended");
return isConnected;

}

public static int increaseVolume(){
System.out.println("increase volume method started");
if (isConnected==true){
	if (currentVolume<maxVolume){
	System.out.println("current value is less than max proceed");
	currentVolume=currentVolume+1;
	System.out.println("current volume"+ currentVolume);
	}

	
	else {
		System.out.println("max volume reached");
	}
	}
	else {
		System.out.println("air conditioner turn on first");
		
	}

	System.out.println("increase Volume method ended");
	return currentVolume;
}

public static int decreaseVolume(){
	System.out.println("decrease volume method started");
	if (isConnected==true){
		if (currentVolume>minVolume){
			System.out.println("current volume is grater than max proced");
			currentVolume=currentVolume-1;
			System.out.println("current volume"+ currentVolume);
			
		}
		else {
			System.out.println("min Volume reached");
		}
	}
else{
	System.out.println("air conditioner turn on first");
}
System.out.println("decrease volume method ended");
return currentVolume;
}
}
