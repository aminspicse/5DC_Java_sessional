import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;
		System.out.print("Enter value of x:");
		x = sc.nextDouble();
		
		if(x != 0) {
			double sin_val = Math.sin(1/x);
			System.out.println("Value of sin (1/x) is "+String.format("%.4f", sin_val));
		}else {
			System.out.println("Value of x must be nonzero: try again");
		}
		

	}

}
