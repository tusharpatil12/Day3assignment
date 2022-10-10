package bridgeLabz;

import java.util.Arrays;

public class SecondLargestNumber {
	
	public static int check2ndLargestNumber(int a [],int total){
		
		Arrays.sort(a);  
		return a[total-2];  
		
//		int temp;  
//		for (int i = 0; i < total; i++)   
//		        {  
//		            for (int j = i + 1; j < total; j++)   
//		            {  
//		                if (a[i] > a[j])   
//		                {  
//		                    temp = a[i];  
//		                    a[i] = a[j];  
//		                    a[j] = temp;  
//		                }  
//		            }  
//		        }  
//		       return a[total-2];  
		
	}
	

	public static void main(String[] args) {
	int a [] = {1,2,3,4,5,};
	int b[]={44,77,33,66};  
	System.out.println("Second Largest: "+check2ndLargestNumber(a,5));
	System.out.println("Second Largest: "+check2ndLargestNumber(b,4));

	}

}
