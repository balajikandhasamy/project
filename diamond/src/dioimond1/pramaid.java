package dioimond1;

public class pramaid {
	public static void main(String[] args) {
		int n=7;
		int space=0;
		int star=7;
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j<=space; j++) {
				System.out.print(" ");
				}
			for (int k = 1; k<=star; k++) {
				System.out.print("*");
				
			}
			System.out.println();
	
			if(i<=n/2){
				star=star-2;
				space=space+1;
		
			}else{
				break;
			}
		}
	}
}




