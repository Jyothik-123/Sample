package GitDemo;

import java.util.ArrayList;

public class Sample {
	public static void main(String args[]) {
		ArrayList<String> ar = new ArrayList();
		ar.add("Teacher");
		ar.add("Student");
		ar.add("Books");
		for(int i = 0; i<ar.size();i++) {
			System.out.println("Attributes are: " +ar.get(i));
		}
	}
}
