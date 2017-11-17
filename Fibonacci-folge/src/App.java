import java.util.*;


public class App {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		
		
		System.out.println("Fibunaccifolge!");
		System.out.println("Bitte Länge eingeben:");
		int x= myScanner.nextInt();
		// List<Integer> zahlenfolge = new ArrayList<Integer>();
		int[] zahlenfolge = new int[x];
		

		zahlenfolge[0] = 0;
		zahlenfolge[1] = 1;
		
		for(int i = 2; i<x; i++) {
			zahlenfolge[i]=zahlenfolge[(i-1)]+zahlenfolge[(i-2)];
		}
		
		for(int j=0;j<zahlenfolge.length; j++) {
			System.out.print(zahlenfolge[j] );
			if(j <= (zahlenfolge.length-2)) {
				System.out.print(", ");
			}
		}
		
		myScanner.close();
		System.exit(1);
	}

}
