package java_Learning;

public class Missing_Number {

	public static void main(String[] args) {
		int[] a = {1998,2002,1993,2020,2015,2010};
		int[] b = {2015,2020,2010,2002,1998,0}; 
		
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int j=0; j<b.length; j++) {
			sum1=sum1+b[j];
		}
		System.out.println(sum1);
		
		System.out.println("Missing Num Is: " + (sum-sum1));
	}
	
}
