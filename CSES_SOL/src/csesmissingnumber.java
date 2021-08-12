import java.util.*;


public class csesmissingnumber {

	
	public static void main(String[] args) {
		
		int n;
		long sum=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int [] arr = new int[n-1];
		int result=0;
		for(int i =0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		
		long temp = (long)n*(n+1)/2 ;
		
		System.out.println(temp - sum);
	}
}
