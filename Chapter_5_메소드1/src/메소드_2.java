// 사용자가 구구단을 요청(매개변수=>단)
/*
 *   자체출력
 *   값을 넘겨준다
 */
import java.util.Scanner;
public class 메소드_2 {
	static void gugudan(int gg)
	{
		for(int i=0;i<=9;i++)
		{
			System.out.println(gg+"*"+i+"="+gg*i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("단을 입력: ");
         int gg=sc.nextInt();
         gugudan(gg);
         System.out.println("=========");
	}

}
