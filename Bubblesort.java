
public class Bubblesort {
	public static void main(String[] args) {
		int a[] = {-5, 13, -32, 7, -3, 17, 23, 12, -35, 19};
		int INT = 10;
		
		AusgabeArray(a, INT);
		System.out.println("Bubblesort:");
		Bubblesort(a, INT);
	}
	
	public static int [] Bubblesort(int []a, int INT) {
		int temp;
		for(int i = 1; i < INT; i++) {
			for(int j = 0; j < INT-i; j++) {
				AusgabeArray(a, INT);
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
		}
		AusgabeArray(a, INT);
		return a;
	}
	
	public static void AusgabeArray(int []a, int INT) {
		for(int i = 0; i < INT; i++) {
			System.out.print(a[i]);
			System.out.print("  ");
		}
		System.out.println("");
	}
}
