import java.util.*;

class Ar{
  public static int Yearn(int age, int spacetime){

  int ability = age ** spacetime;
  int solve = Integer.valueOf(log(ability));

}

  public static String Dose(){
  
  

  HashMap<int, String> Vaccine = new HashMap<int, String>();
  Vaccine.put(1, "Fiduciary);
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
      continue
  }
 

}

  public static boolean Heal(){
    if (solve == 1 || solve == 2 || solve ==3)
      return true;
    else
      return false;
  }

  public static void main(String [] args){

    int spacetime = 93000000;

    Scanner sy = new Scanner(System.in());

    System.out.println("Enter age");
    int age = sy.nextInt();

    Yearn(age, spacetime);
    Dose();
    Heal();
  
     
    
  }

}

