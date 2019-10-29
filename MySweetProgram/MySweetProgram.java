import java.util.Scanner;

public class MySweetProgram {

    public static void main(String[] args) {
        System.out.println("Enter your name");

        Scanner in = new Scanner(System.in);
        //String s = in.nextLine();

        // int i = 0; 
        // while(i<10) {
        //     System.out.println("i is:" + i);
        //     i++;
        // }


        int i = 0; //initialization

        do {
            System.out.println("i is: " + i);
            i++;
        } while(i<10);
            
        in.close();
    }
}