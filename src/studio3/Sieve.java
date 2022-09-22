package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input number");
		int n = in.nextInt();
		boolean [] array = new boolean [n] ;
		for (int i = 0 ; i < n; i++)	
		{
			array [i] = true ;
		}
		for (int i = 2; i < Math.pow(n, (1/2)); i++ )
		{
			if (array [i] == true ) {
				for (int j = (int) Math.pow(i, 2); j < n; j+= i ) {
					array [j] = false;
				}
			}


		}
		for ( int i = 0; i < n; i++) {
			if ( array [i] == true) {
				System.out.println(i);
			}

		}
	}

}
