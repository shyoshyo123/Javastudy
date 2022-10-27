/*
 * 
 * 반복제어문
 *     => 반복문 종료 : break
 *     => 특정부분을 제거 : continue
 *     ***주의점
 *            break;
 *            continue; =>밑에는 소스 코딩을 할 수 없다
 *           -------------------------------------------------
 *             break; 반복문, 선택문에서만 사용이 가능 => 제어문을 종료
 *            continue; 반복문이 있는 경우에만 사용이 가능 => 제외하고 다른 반복문을 수행(특정부분만)
 *            
 *break;  1~100까지 출력  ==>5까지 출력후  for 중단         
 * 
 * 
 */
public class 반복제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          for(int i=1;i<=100;i++) 
          {  
        	  System.out.print(i+" ");
        	   if(i==5)      	  
        		   break;        	  
        	   // System.exit(0); 모든 프로그램이 종료
          }
          int i=1;
          while(1<=100)
          {
        	  System.out.print(i+" ");
       	   if(i==5)      	  
       		     break;     
         	   i++;
        	  
          }
          
        	  
	}

}
