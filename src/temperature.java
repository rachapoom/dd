
import java.util.Scanner;

public class temperature {
     private static Scanner sc;
     
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Celsius : ");
		double c = sc.nextDouble();
		double temp = (1.8 * c) + 32;
		System.out.println("Fahrenheit is : " + temp + " F");
	}


		// TODO Auto-generated method stub

	}