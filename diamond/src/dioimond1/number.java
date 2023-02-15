package dioimond1;

public class number {
	public static void main(String[] args) {
		int alpha=64;
		int n=5;
		int space=0;
		int star=5;
		for (int i = 1; i<=n; i++) {
			for (int j =1; j<=space; j++) {
				System.out.print(" ");
				}
			for (int k =1; k<=star; k++) {
				
				System.out.print((char)(alpha+k));
			}
			
			
			System.out.println();
			if (i<=n/2) 
			{
				star=star-2;
				space++;
			}else{
				star=star+2;
				space--;
			}
		}
	}

}


