package bridgeLabz;

public class SmallerElement {
	
	public static void checkSmallerElement(int temp,int size) {
		
		//int temp, size;
	      int array[] = {10, 20, 30, 40, 50};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Smallest element of the array is:: "+array[0]);
	   
	}

	public static void main(String[] args) {
		
		checkSmallerElement(0, 0);		
	}

}
