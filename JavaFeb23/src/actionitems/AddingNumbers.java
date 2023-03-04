package actionitems;

public class AddingNumbers {

	public static void main(String[] args) {
		
		System.out.println("Calculating sum of numbers from 0 to 15");
		
        int sum = 0;
		for(int i = 0; i<=15; i++)
		{
			sum = sum + i;
		}
		System.out.println("The result is : " + sum);
	}

}
