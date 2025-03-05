package chaptertwo;

public class Variablescope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result, x,y;
		x=200;
		y=300;
		
		result= x+y;
		System.out.println("add" + result);
		
		result= x-y;
		System.out.println("sub" + result);
		
		
		result= x*y;
		System.out.println("mult" + result);
		
		
		result= x/y;
		System.out.println("div" + result);
		
		result= x+y;
		System.out.println("add" + result);
		
		System.out.println(Math.pow(x, y)); 
	}
}



