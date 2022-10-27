/*
 *                     *
 *                     **
 *                     ***
 *                     ****
 *                     
 *                     ****
 *                     ***
 *                     **
 *                     *
 *                     
 *                     
 */          
import java.util.Scanner;
public class 반복문_중첩_for_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			  for( int j=1;j<=n;j++) 
			  {
				  System.out.print("*");
			  }
			System.out.println();
		}
	}
}
