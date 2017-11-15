
public class Selectionsort {
	public static void main(String[] args) {
		int a[] = {-5, 13, -32, 7, -3, 17, 23, 12, -35, 19};
		int INT = 10; //Arraylänge
		
		AusgabeArray(a, INT);
		System.out.println("Selectionsort:");
		Selectionsort(a, INT);
	}
	
	public static int [] Selectionsort(int []a, int INT) {
		for (int i = 0; i < INT - 1; i++) {
			for (int j = i + 1; j < INT; j++) {
				if (a[i] > a[j]) {
					AusgabeArray(a, INT);
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
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
