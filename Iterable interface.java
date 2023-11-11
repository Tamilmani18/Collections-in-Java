import java.util.*;

public class B {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10000;i++) {
        	list.add(i);
        }
      
    	  long start = Calendar.getInstance().getTimeInMillis();
        for(int i : list) {
        	int a=i;
        }
        long end = Calendar.getInstance().getTimeInMillis();
        
        System.out.println("Time taken by for-each loop : "+(end-start) +" ms");
        
        start = Calendar.getInstance().getTimeInMillis(); 
		    for (int j=0;j<list.size();j++) { 
			    int a = list.get(j); 
		    } 
		    end = Calendar.getInstance().getTimeInMillis(); 
		    
        System.out.println("Time taken by for-loop : "+(end-start)+" ms"); 
    }
}
