import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max,seris=1,sum=0;
		System.out.print("Enter a +ve integer less than 50: ");
		max = sc.nextInt();
		if(max < 50 && max > 0) {
			for(int i=0;i<max;i++) {
				
				seris=seris+i;
				if(seris <= max) {
					sum += Math.pow(seris, 4);
					//System.out.println(seris+" = "+Math.pow(seris, 4));
					continue;
				}else {
					break;
				}
				
			}
			System.out.println("Sum of the series is "+sum);
		}else {
			System.out.println("Invalid input");
		}

	}

}
