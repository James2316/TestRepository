package dataTypes;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		/** 
		 * for(initialization/ start point, how far/end point, how will it increase/decrease )
		 * {
		 * Code to be executed
		 * }
		 */
		//System.out.println("I am from " + variable name);
		
		
        // write "I love you 10 times using for loop 
		System.out.println("Starts");
		for(int i = 1; i<=10; i++) {
			System.out.println(i + ". I love you");
		}
		System.out.println("Ends!!");
		
		System.out.println("Starts");
		for(int i = 1; i<=3; i++) {
			System.out.println(i + ". I am from Brooklyn");
		}
		System.out.println("Ends!!");
	


	


       /** Syntax for a while loop
        * initialization;
        * while(codition){
        * increment/decrement
        * }
        * Syntax for do while loop
        * initialization;
        * do{
        *   //Statement
        *   increment/decrement
        *   }while (condition)
        *   
        *   Type I am from + variable 3 times using 
        *   for, while and do while loop
        *   use String variable for referring to 
        *   your place
        * 
        * 
        */
     
     int i = 1;
     while (i<=3) {
    	 System.out.println(i + ". I am from Queens");
    	 i++;
     
    	 
     } 
     
     
     int j = 1;
     do { 
    	 System.out.println(j + ". I am from Queens");
    	 j++;
     } while (j<=3);
  }
}




