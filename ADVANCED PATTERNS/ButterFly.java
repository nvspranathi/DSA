public class ButterFly{
	public static void main(String[] args){
		int n = 4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j<=i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int k=n;k>0;k--){
				if(k<=i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		for(int i=n;i>0;i--){
			for(int j=1;j<=n;j++){
				if(j<=i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int k=n;k>0;k--){
				if(k<=i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		
	}
}