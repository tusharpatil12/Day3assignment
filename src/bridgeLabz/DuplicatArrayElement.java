package bridgeLabz;

public class DuplicatArrayElement {
	
	public static void checkDuplicatArray() {
		String[] Array = {"A", "B", "C", "A", "C", "D", "E"};
		 
		for (int i = 0; i < Array.length-1; i++)
			 {
    		for (int j = i+1; j < Array.length; j++)
    		{
        		if( (Array[i].equals(Array[j])) && (i != j) )
        			{
            System.out.println("Duplicate Element : "+Array[j]);
        			}
    		}
    		
			 }
		
	}

	public static void main(String[] args) {
		checkDuplicatArray();
	}

}
