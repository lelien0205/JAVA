package demo;
import java.util.Scanner;

public class arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("so phan tu cua mang la: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		int index=0;
		do { 
			System.out.print("phan tu thu " + (index+1) + " la: ");
			arr[index]=sc.nextInt();
			index ++;
			}while(index<n);
		
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("maxValue = " + max);
		
		int min = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("minValue = " + min);
		
		System.out.print("Sort: ");
		for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (arr[i] > arr[j]) {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        System.out.print( arr[i] + " ");
	    }
		
		
		
	}
}


