//3이상 4462 이하에서 짝수인 정수의 합을 구하여라.
// 개수 ++ / 누적 +=

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int sum=0;
	    for(int i=3;i<=4462;i++) 
	    {
	         if(i%2==0) {
	        	 sum+=i;
	         }
	    }
	    	System.out.println("짝수의 합:"+sum);
		
	}

}
