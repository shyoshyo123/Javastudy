/*
 *         1. 컴퓨터 가위바위보
 *         -----------------------계속진행 ===>q/Q
 */
import java.util.Scanner;
public class 반복제어문_3 {
 //종료 break; , 잘못된 입력(경고) continue;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int win=0, lose=0,same=0;
      int count=0;
      
      //new ==> 사용할때마다 메모리 공간이 다르다
     Scanner scan=new Scanner(System.in);
      while(true) 
      {
    	   //난수 발생==> 게임 시점   	  가위0 바위1 보2 
    	  int com=(int)(Math.random()*3);  // 0~2 웹 (예약일)
    	  System.out.print("가위(0),바위(1),보(2):");
    	 int user=scan.nextInt();
    	 if (user<0 || user>2) 
    	 {
    		 System.out.println("가위(0),바위(1),보(2)를 입력하세요!");
    		 continue;// 처음부터 다시 실행
    		 
    	 }
    	 count++;
    	 if(com==0)
    		 System.out.println("컴퓨터:가위");
    	 else if(com==1)
    		 System.out.println("컴퓨터:바위");
    	 else if(com==2)
    		 System.out.println("컴퓨터:보");
    	 
    	 if(user==0)
    		 System.out.println("사용자:가위");
    	 else if(user==1)
    		 System.out.println("사용자:바위");
    	 else if(user==2)
    		 System.out.println("사용자:보");
    	 
    	 //
    	 /*
    	  *                                            com-user
    	  *  com        user
    	  * 0 (가위)           0(가위)        0(s)
    	  *                         1(바위)        -1
    	  *                         2(보)           -2
    	  * 1 (바위)           0(가위)        1
    	  *                         1(바위)        0   
    	  *                         2(보)           -1
    	  * 2 (보)              0(가위)        2
    	  *                        1(바위)        1
    	  *                         2(보)           0   	 
    	  */
    	 switch(com-user)
    	 {
    	  case -1: case 2:
    		   System.out.println("사용자 win!");
    		   win++;// 이긴 횟수
    		   break;
    	  case -2: case 1:   
    		  System.out.println("사용자 lose!");
    		  lose++;//진 횟수
    		  break;
    	  case 0:   
    		  System.out.println("비겼다");
    		  same++;
    		  break;
    		  
    		  
    	 }
    	 //종료 확인
    	 System.out.print("게임을 종료할까요?(y/n)");
    	 char c=scan.next().charAt(0);
    	 if(c=='y'||c=='n')
    	 {
    		 System.out.println("Game over!");
    		 break;
    		 
    	 }
      }
      System.out.printf("%d전 %d승 %d무 %d패\n",count,win,same,lose);
	}

}
