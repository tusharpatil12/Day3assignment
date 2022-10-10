package bridgeLabz;

import java.util.Arrays;

public class ArrayFrequency {
	
    static void checkArrayFrequency(int arr[], int freq[]) {
    	
    	int count=0;
        for(int i = 0; i<arr.length; i++) {
            
            count=1;
            for(int j = i + 1; j<arr.length;j++)
            {
                
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j] = 0;
                }
            }
           
            if(freq[i]!=0)
            {
                freq[i] = count;
            }
        }
        
       
        System.out.println("The elements of frequency");
        for(int i = 0; i<arr.length;i++)
        {
            if(freq[i]>=1)
                System.out.println("Element "+arr[i]+" : "+freq[i]+" times.");
        }
    }

	public static void main(String[] args) {
		 int arr[] = {12, 22, 34, 22, 54,55,34,11};
	        int freq[] = new int[arr.length];
	        
	       Arrays.fill(freq, -1);
	       
	       // System.out.println("The array elements are "+Arrays.toString(arr));
	        
	       checkArrayFrequency(arr,freq);


	}

}
