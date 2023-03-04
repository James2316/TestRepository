package dataTypes;

public class ActionItem22 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i<=15; i++) {
			sum = sum + i;
			System.out.println("Sum so far: " + sum);
		}
		
		int sum2 = 0;
		int j = 0;
		do { 
			sum2 = sum2 + j;
			j++;
		} while (j<=15);
	        System.out.println(sum2);
		
		int sum3 = 0;
		int k = 0;
		while (k<=15) {
			sum3 = sum3 + k;
			k++;
			System.out.println(sum3);
		}
	}

}
        