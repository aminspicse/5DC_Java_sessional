import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a +ve no less than 10000:");
		int digit = sc.nextInt();
		if(digit < 10000 && digit > 0) {
			Problem7 obj = new Problem7();
			System.out.println("Sum of the digits of 546 is "+obj.Sum(digit));
		}else {
			System.out.println("Entered number is out of range");
		}

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
