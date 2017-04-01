///Stephen Gordon
public class LinearSearch {
	public static void main(String arg[]){
		String s = "This is a test";
		char c = 'e';
		System.out.println(advancedSearch(s, c));
	} //end main method
	
	//Searches for first instance of character in String
	public static int searchForChar(String str, char c){
		int i = 0;
		boolean flag = false;
		while(i < str.length()){
			if(str.charAt(i) == c){
				flag = true;
				break;
			} //end if
			i++;
		}//end while
		if(flag){
			return i;
		} else{
			System.out.println("No instance of " + c + " found.");
			return -1;
		}
	} //end method
	
	//Still only finds first instance of character
	public static String advancedSearch(String str, char c){
		int i = 0;
		String pointer = "";
		System.out.println("Finding " + c);
		System.out.println(str);
		boolean flag = false;
		str = str.toLowerCase(); //Deals with capital letters, should look no different in end result
		while(i < str.length()){
			if(str.charAt(i) == c){
				flag = true;
				pointer = pointer + "^";
				break;
			} //end if
			i++;
			pointer = pointer + " ";
		}//end while
		if(flag){
			return pointer;
		} else{
			pointer = pointer.replaceAll(" ", "") + "No instance of " + c + " found.";
			return pointer;
		}
	} //end method
}
