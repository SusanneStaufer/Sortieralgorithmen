
public class Insertionsort {

	public static void main(String[] args) {
		int a[] = {-5, 13, -32, 7, -3, 17, 23, 12, -35, 19};
		int INT = 10;
		
		AusgabeArray(a, INT);
		System.out.println("Insertionsort:");
		InsertionsortRekursiv(a, INT);
	}
	
	public static void InsertionsortRekursiv(int []a, int INT) {
		if(INT > 1) {
			InsertionsortRekursiv(a, INT-1);
			int key = a[INT-1];
			int j = INT-2;
			while((j >= 0) && (a[j] > key)) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		
		
		AusgabeArray(a, INT);
	}
	
	public static void AusgabeArray(int []a, int INT) {
		for(int i = 0; i < INT; i++) {
			System.out.print(a[i]);
			System.out.print("  ");
		}
		System.out.println("");
	}
}
