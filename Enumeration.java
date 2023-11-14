import java.util.*;

public class Sample {
	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<>();
		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}
		
    System.out.println(v);
		
		Enumeration<Integer> e = v.elements();

		while (e.hasMoreElements()) {
			int i = e.nextElement();
			System.out.print(i + " ");
		}
	}
}
