import java.util.Scanner;
public class 반복문_while4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         int i=1; 
         int sum=0;
             
         while(i<=10) {
        	 System.out.println(i+"번째 정수 입력");
        	 int num=scan.nextInt();
        			sum+=num;
        			i++;
        			
         }
      System.out.println("합계:"+sum);
        
	}

}
