public class SolidRhombus{
	public static void main(String[] args){
		int n = 6;
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}