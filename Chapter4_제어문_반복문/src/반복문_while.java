/*
 * 초기값 먼저
 *            초기값
 *             while(조건식) 
 *           {
 *                       반복수행문장
 *                       증가식
 *             }
 *            ==> for(초기값;조건식;증가식;)
 *            {
 *                      반복수행문장
 *             }          
 */
public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     A~Z , Z~A   
		char c='A';
		while(c<='Z') 
		{
			System.out.print(c+" ");
			c++;
		}
		// ('Z'+1) 증가된 c 초기화 시켜주기! ↓
		// 대문자 소문자 =>32 'A'=65 'a'=97
		c='Z';
		System.out.println();
		while(c>='A') 
		{
			System.out.print((char)(c+32)+" ");
			c--;
		}
	}

}
