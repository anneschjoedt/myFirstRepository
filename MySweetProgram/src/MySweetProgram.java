import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<String> names = new LinkedList<>();
		names.push("Anne");
		names.push("Astrid");
		names.push("Morten");
		
		Iterator<String> it = names.iterator();
		it.next();
		it.next();

		for(String s: names) {
			System.out.println(s);
		}
		
	}
}
