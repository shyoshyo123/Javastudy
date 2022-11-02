

/*
 * 
 *   난수 6개 추출 
 * 
 */
public class 반복문_while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int sum=0;
     /*     int a= (int)(Math.random()*100)+1;
          sum+=a;*/
          int i= 1;
          while(i<=6)
          {
        	  int a= (int)(Math.random()*100)+1;
        	  //a변수는 while 한번수행시킬때마다 새로운 변
        	  System.out.println(i+". "+a);
        	  sum+=a;
        	  i++;
          }
          System.out.println("i="+i);
          
	}

}
