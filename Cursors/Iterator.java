import java.util.*;

public class Sample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        System.out.println(al);
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()) {   // Checking the next element availability.
        	int i=itr.next();  // Moving cursor to next element.
        	System.out.print(i+" ");
        	
        	if(i%2!=0) {
        		itr.remove();
        	}
        }
        System.out.println();
        System.out.println(al);
    }
}
