import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int digit;
		
		System.out.print("Enter an integer: ");
		digit = sc.nextInt();
		
		Problem8 obj = new Problem8();
		
		System.out.print("Sum of the digits of "+digit+" is "+obj.Sum(digit));
	}
	
	public int Sum(int digit) {
		int sum=0;
		while (digit != 0) 
        { 
            sum = sum + digit % 10; 
            digit = digit/10; 
        } 
		return sum;
	}
}
