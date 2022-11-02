import java.util.Scanner;
public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		 while(true)
	       {
	    	        System.out.println("======= Menu ========");
	    	        System.out.println("1. 로그인"); // string
	    	        System.out.println("2. 회원가입"); // IO
	    	        System.out.println("3. 영화목록"); // try catch
	    	        System.out.println("4. 영화상세"); 
	    	        System.out.println("5. 영화예매"); 
	    	        System.out.println("6. 종료"); 
	    	        System.out.println("==============");
	    	        System.out.print("메뉴 선택하세요");
	    	        int menu=scan.nextInt();   	        
	    	  switch(menu)
	    	  {
	    	  case 1:
	    		   break;
	    	  case 2:
	    		   break;
	    	  case 3:
	    		   break;
	    	  case 4:
	    		   break;
	    	  case 5: 
	    		   break;
	    	  case 6:
	    		   System.out.println("화면을 종료합니다");
	    	default:
	    		  System.out.println("");
	    	  }
	    	        }
		 
	}

}
