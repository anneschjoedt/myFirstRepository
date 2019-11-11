public class MySweetProgram {

	public static void main(String[] args) {
		int [][] data = {
					{0, 1, 1, 0},
					{1, 1, 1, 1},
					{1, 1, 2, 1}
		};



		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
