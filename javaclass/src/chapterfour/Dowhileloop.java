package chapterfour;

public class Dowhileloop {

	public static void main(String[] args) {
		// int i = 1;
		//do {
		  //  System.out.println(i);
		  //  i++;
		//} while (i <= 10);
		for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break;  // Exit the loop when i equals 5
            }
            System.out.println(i);


	}
		for (int i = 0; i < 5; i++) {
		    if (i == 3) {
		        break;
		    }
		    System.out.print(i + " ");
		}
		int i = 0;
		do {
		    System.out.print(i + " ");
		    i++;
		} while (i < 3);

	}
}
