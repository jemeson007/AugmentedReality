
import java.util.HashMap;
import java.util.Scanner;

public class Ar {
  

	  public static int Yearn(int a, int spacet){

	  int ability = (int)(Math.pow(a, spacet));
	  int solve = (int)(Math.log(ability));
	 
	 

	  HashMap<Integer, String> Vaccine = new HashMap<Integer, String>();
	  Vaccine.put(1, "Fiduciary");
	  Vaccine.put(2, "Honesty");
	  Vaccine.put(3, "Halicin");
	 
	 
	  switch(solve){
	    case 1:
	        System.out.println(Vaccine.get(1));
	      break;
	    case 2:
	        System.out.println(Vaccine.get(2));
	      break;
	    case 3:
	       System.out.println(Vaccine.get(3));
	      break;
	    default:
	       System.out.println("another");
	      break;
	  }
	 
	  return solve;
	 
	 
	}
	//   public static boolean Heal(){
//	     if (solve == 1 || solve == 2 || solve == 3)
//	       return true;
//	     else
//	       return false;
	//   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int spacetime = 93000000;
	    try (Scanner sy = new Scanner(System.in)) {
			System.out.println("Enter age: ");
			int age = sy.nextInt();
   
   
			// BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
   
			// System.out.println("Enter age: ");
			// int age = red.read();
   
			Yearn(age, spacetime);
			//Dose();
			// Heal();
		}
	 

	}

}
