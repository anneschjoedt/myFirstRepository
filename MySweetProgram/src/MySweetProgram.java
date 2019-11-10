import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("students.txt"));

		List<String> students = new ArrayList<>();

		while(in.hasNextLine()) {
			students.add(in.nextLine()); 
			}

		// goes through each student in the txt file
		// students.get(i) passes in the index i
		for(int i = 0; i < students.size(); i++) {
			System.out.println("name: " + students.get(i));
		}
		in.close();
	}
}