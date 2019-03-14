import java.util.*;

public class aaah {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		string a = sc.nextLine();
		string b = sc.next();
		string c = sc.next();
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
