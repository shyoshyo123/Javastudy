/*
 *      선택문 중첩
 *       swtich(변수) 
 *{
 *         case 값:
 *               swtich
 *                {
 *                     case 값:
 *                 }
 *                 break;
 *}
 * 
 *        3. 반복문 중첩
 *        ==========> for
 *       -for, while 서로 중첩 가능-
 *      
 *        이중for문
 *        for() ======> 줄수
 *        { 
 *               for()
 *               {
 *                 실제 출력문                
 *               }                     
 *        }
 *           변수 위치
 *           
 *           for(int=1;i<=5;i++)
 *           { sysout}
 * 
 */
public class 반복문_중첩for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		   System.out.println("2차 for문을 이용");
		   //줄 수==>5
		   for(int i =1;i<=5;i++) 
		   {
			   for(int j =1;j<=5;j++) 
			   {
				   System.out.print('☆');
			
			   }
			   System.out.println();
			   
		   }
		   
	}

}
