import java.util.*;

class Solution{
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = 0;
            int loop = 0;
            
            for(int j=0; j<n; ++j){
            	loop = recursive(j, b);
            	sum = (int) (a  + loop);
            	System.out.printf("%d ", sum);
            }
            System.out.println("");
        }
        in.close();
    }

	private static int recursive(int j, int b) {
		if(j == 0){
			return (int) Math.pow(2, j) * b;
		}
		else{
			return (int) (Math.pow(2, j) * b) + recursive(j-1,b) ;
		}
			
	}
}
