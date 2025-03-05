package chapterfive;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define students and subjects
        String[] students = {"student1", "student2", "student3"};
        String[] subjects = {"physics", "chemistry", "maths"};

        // 2D array to store grades
        int[][] grades = {
            {85, 90, 78},  // Alice's grades
            {92, 88, 95},  // Bob's grades
            {76, 80, 84}   // Charlie's grades
        };

        // Print student grades with subjects
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + "'s grades:");
            for (int j = 0; j < subjects.length; j++) {
                System.out.println("  " + subjects[j] + ": " + grades[i][j]);
            }
            System.out.println(); // New line for better formatting

	}
	}

}
