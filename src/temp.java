import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double C,F;
		System.out.print("Enter temp in Fahrenheit: ");
		F= sc.nextDouble();
		C = ((F-32)*5)/9;
		System.out.println("Temp "+F+" in Fahrenheit = "+String.format("%.2f",C)+ " Centigrade");

	}

}
