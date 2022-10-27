/*
 *     aBCDE
 *     AbCDE
 *     
 *     166p 중요~
 *     
 *     
 */
//import java.util.Scanner;
public class 반복문_중첩_for_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          for(int i=1;i<=5;i++) 
            {  char c='A';         
            	for(int j =1;j<=5;j++) 
            	{
            		 if(i==j) 
            			 System.out.print((char)(c+32));
            		else
            		System.out.print(c);
            			c++;	
            	}
            	System.out.println();
            }
	/*Scanner scan=new Scanner(System.in);
	System.out.print("2와12사이의 정수를 입력:");
	int hap=scan.nextInt();*/
	
	
	
	}

}
