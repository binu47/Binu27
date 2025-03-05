package todolist;

public class Ifpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	boolean isLatte=true;
	        boolean isIced=false;
	        boolean withMatcha=true;
	        int itmesOrdered=0;
	        int vanillaPumps=3;
	        if (isLatte == isIced){
	            System.out.println("espresso, milk, ice, syrup.");
	        }else if (isLatte == withMatcha){
	            System.out.println("matcha, oat milk, ice, vanilla.");
	        }else if (isLatte){
	            System.out.println("espresso, steamed milk");
	        }else{
	            System.out.println("Select a drink to get started!");
	        }
	        if(itmesOrdered > 1){
	            System.out.println("provide cup holder");
	        }
	        if(vanillaPumps >= 2){
	            System.out.println("charge $1 extra");
	        }
//		int i=1;
//        while (i <= 5){
//            System.out.println("Line" + i+ ":  Sorry for the trouble I caused!!!");
//            i=i+1;
        }
	}


