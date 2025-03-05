package chapter3;

public class Switchcondtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 5;
		switch (day) {
		    case 1:
		        System.out.println("Monday");
		        break;
		    case 2:
		        System.out.println("Tuesday");
		        break;
		    case 3:
		        System.out.println("Wednesday");
		        break;
		    case 4:
		        System.out.println("Thursday");
		        break;
		    case 5:
		        System.out.println("Friday");
		        break;
		    case 6:
		        System.out.println("Saturday");
		        break;
		    case 7:
		        System.out.println("Sunday");
		        break;
		    default:
		        System.out.println("Invalid day no");
		        break;
		
}
		char grade = 'B';
		switch (grade) {
		   case 'A':
		       System.out.println("Excellent");
		       break;
		   case 'B':
		       System.out.println("Good");
		       break;
		   case 'C':
		       System.out.println("Average");
		       break;
		   case 'D':
		       System.out.println("Below Average");
		       break;
		   case 'F':
		       System.out.println("Fail");
		       break;
		   default:
		       System.out.println("Incomplete");
		       break;
		}
		
		char monthCode = 'W';
		switch (monthCode) {
		    case 'W':
		        System.out.println("Winter: December to February");
		        break;
		    case 'S':
		        System.out.println("Spring: March to May");
		        break;
		    case 'A':
		        System.out.println("Autumn: September to November");
		        break;
		    case 'F':
		        System.out.println("Summer: June to August");
		        break;
		    default:
		        System.out.println("Invalid Season Code");
		        break;
		}
		
		int foodcode=1;
		switch (foodcode) {
		case 1:
			System.out.print("Italian: Pizza and Pasta");
			break;
		case 2:
			System.out.print("Mexican:Tacos and Burriots");
			break;
		case 3:
			System.out.print("Indian:Curry and Naan");
			break;
		case 4:
			System.out.print("Chinese:Noodles and Dumpling");
			break;
		case 5:
			System.out.print("American:Burger and Fries");
			break;
		default:
				System.out.print("no additional menue");
				break;
		}
		
		
		
		
	}
}


