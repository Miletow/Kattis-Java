import java.util.*;

public class aaah {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
		String a = sc.nextLine();
		String b = sc.nextLine();
   // solve test case and output answer
   System.out.println(aaah(a, b));
		}
    }
	
	public static String aaah(String jon, String doctor){
		
		if(jon.length() >= doctor.length()){
		
			return "go";
		}
		
		return "no";
	}

}
