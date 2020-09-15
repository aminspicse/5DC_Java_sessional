import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=4;
		double arr[] = new double[size];
		
		List<Double> list = new ArrayList<Double>();
		System.out.print("Enter four numbers: ");
		  
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextDouble();
			list.add(arr[i]);
		}
		
		double difference = Collections.max(list)-Collections.min(list);
		
		System.out.println("Difference is "+String.format("%.4f", difference));

	}

}
