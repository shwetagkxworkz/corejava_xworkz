class Teatre1{
static String movies[]={"null","null", "null", "null", "null", "null","null", "null", "null", "null"};
static int index;
public static boolean addMovies(String name){
System.out.println("addMovies method started");
boolean isAdded=false;
if(movies!=null && index<movies.length){
movies[index++]=name;
isAdded=true;
System.out.println("movie name is added");
}
else{
System.out.println("movie name reached max");
}
System.out.println("addMovies method ended");
return isAdded;
}
public static void getMovies(){
System.out.println("getMovies method started");
for (int i=0;i<movies.length;i++){
System.out.println(movies[i]);
}
System.out.println("getMovies method ended");
return ;
}
public static boolean updateMovies(String oldName, String updatedName){
System.out.println("updateMovies method started");
boolean isUpdated=false;
for(int i=0;i<movies.length;i++){
if(movies[i].equals(oldName)){
movies[i]=updatedName;
isUpdated=true;
System.out.println(movies[i]);
}
}
System.out.println("updateMovies method ended");
return isUpdated;
}
public static String getMovies(String name){
	System.out.println("getMovies method started");
	for (int i=0;i<movies.length;i++){
		if(movies[i].equals(name))
			return name;
		else{
			System.out.println("movie name is not found");
		}
	}
	System.out.println("getMovies method ended");
	return "no movie name";
}
}