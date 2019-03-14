import java.util.*;

public class Kattis {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		while (sc.hasNextLong()) {
		long a = sc.nextLong();
		long b = sc.nextLong();
   // solve test case and output answer
   ladder(a, b);
		}
    }
	
	public static void ladder(long h, long v){
		
	double degree =( v * (Math.PI / 180));
    if(h<=10000 && h>=1 && v>=1 && v<=89)
    System.out.println((long)( Math.ceil(h/(Math.sin(degree)))));
	}

}
