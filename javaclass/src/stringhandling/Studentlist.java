package stringhandling;
import java.util.ArrayList;
import java.util.List;
public class Studentlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> studentList= new ArrayList<>();
		
		studentList.add("Binyam");
		studentList.add("Mati");
		studentList.add("Hilina");
		studentList.add("Selam");
	
		
		System.out.println("second element:"   + studentList.get(1));
		
		studentList.remove(0);
		System.out.println("studentlist:"  + studentList);
		System.out.println("Total size: "   +  studentList.size());
		
		
		
		

	}

}
