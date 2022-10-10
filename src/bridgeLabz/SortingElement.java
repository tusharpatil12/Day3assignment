package bridgeLabz;

import java.util.Scanner;

public class SortingElement {
	
	public static void checkSortingElement() {
		int array[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element:");
		for(int i = 0; i<array.length;i++) {
			array[i] = sc.nextInt();
			
		}
		for(int i = 0;i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				int storeElement = array[i];
				array[i]=array[j];
				array[j]=storeElement;
			}
		}
		System.out.println("print ascending order element in array:");
		for (int i = 0; i<array.length; i++) {
			System.out.println(array[i]+" ");
		}

	}
	
	public static void main(String[] args) {
		System.out.println("welcome to ascending order program:");
		checkSortingElement();
		
	}

}

