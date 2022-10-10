package bridgeLabz;

public class ArrayPresentElement {
	
	public static void checkArrayPresent(int arr) {
		
		int [] arr1 = new int [] {1, 2, 3, 4, 5};  
		  
        System.out.println("Elements of given array present on even position: ");  
        //Loop through the array by incrementing value of i by 2  
        //Here, i will start from 1 as first even positioned element is present at position 1.  
        for (int i = 1; i < arr1.length; i = i+2) {  
            System.out.println(arr1[i]);{
            }
            
            }
	}

	public static void main(String[] args ) {
		
		checkArrayPresent(0);
		
	}

}
