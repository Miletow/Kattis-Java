import java.util.Scanner;
import java.util.Arrays;

public class ABC {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int Numbers[] = {a, b, c};

		char aS = sc.next().charAt(0);
		char bS = sc.next().charAt(0);
		char cS = sc.next().charAt(0);

		char Letters[] = {aS, bS, cS};

		ABC(Numbers, Letters);
			}
    }
	
	public static void ABC(int Numbers[],char Letters[]){
		
		Arrays.sort(Numbers);

		int A = Numbers[0];
		int B = Numbers[1];
		int C = Numbers[2];

		for (char var : Letters) 
		{ 
			if(var == 'A')
			System.out.print(A + " ");
			else if(var == 'B')
			System.out.print(B + " ");
			else if(var == 'C')
			System.out.print(C + " ");
		}
	}

}