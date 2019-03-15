import java.util.Scanner;
import java.util.Arrays;

public class ABC {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int Numbers[] = {a, b, c};

		String Word = sc.next();

		

		ABC(Numbers, Word);
		
    }
	
	public static void ABC(int Numbers[], String Word){
		
		Arrays.sort(Numbers);

		int A = Numbers[0];
		int B = Numbers[1];
		int C = Numbers[2];

		char[] Letters = Word.toCharArray();

		int counter = 0;
		String Result = "";
		for (char var : Letters) 
		{ 
			counter++;
			if(var == 'A')
			Result += A;
			else if(var == 'B')
			Result += B;
			else if(var == 'C')
			Result += C;
			
			if(counter == 3)
			break;
			Result += " ";
		}
		System.out.println(Result);
	}
}