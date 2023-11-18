import java.util.ArrayList;
import java.util.ListIterator;

public class Sample {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			al.add(i);
		}
		
		System.out.println(al);
 
		ListIterator<Integer> ltr = al.listIterator(); //At beginning ltr(cursor) will point to index just before the first element in al

		while (ltr.hasNext()) { // Checking the next element availability
			int i = (Integer)ltr.next();  // Moving cursor to next element and retrieve the value
			System.out.print(i + " ");
			if (i % 2 == 0) {
				i++; // Changing to odd
				ltr.set(i); // Set method to change even numbers to odd
			}
		}

		System.out.println();
		System.out.println(al);
	}
}
