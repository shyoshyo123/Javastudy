
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int i=1;i<=4;i++) 
       {
    	   for(int j=1;j<=4-i;j++) 
    	   {
    		  System.out.print(" ");
    	   }  for(int k=1;k<=i;k++) 
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       for(int i=1;i<=4;i++) 
       {
    	   for(int j=1;j<=i-1;j++) 
    	   {
    		  System.out.print(" ");
    	   }  for(int k=1;k<=5-i;k++) 
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
      
	}
       for(int i=1;i<=4;i++) 
       {
    	   for(int j=1;j<=4-i;j++)  
    	   {
    		  System.out.print(" ");
    	   }  for(int k=1;k<=(i*2)-1;k++) 
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
	}
}
