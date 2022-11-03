/*
 *   메소드
 *         구성요소
 *         처리 결과값(리턴값)       사용자 요청값(매개변수)
 *         ex) 정수 두개를 보내주고==> 더한값을 달라
 *              ---------------매개변수         -----------리턴
 *              id pwd ===> 로그인 여부 확인 ===>boolean
 *            메소드제작
 *            -----------------------------------
 *            결과값               매개변수
 *            -----------------------------------
 *                O                        O            ===========>String substing(int s)
 *            -----------------------------------
 *                O                         X            ===========> String trim()
 *            -----------------------------------
 *                X                          O           ============> System.out.println("A")
 *                                                                                            void println(String)
 *            -----------------------------------
 *                X                          X            ============> System.out.println();
 *            -----------------------------------
 *            -------------
 *            호출  
 *            기조에 있는 프로그램을 기능별로 나눠서 작업(분업화)
 *            **메소드는 반드시 한개의 기능만 수행할 수 있게 만든다.(재사용이 편하다)
 *                입력 기능 ==>세분화
 *                처리 기능
 *                출력 기능
 *             
 *             메소드
 *             =선언부(원형)
 *              리턴형(결과값) 메소드형(매개변수)
 *             =구현부
 *              리턴형(결과값) 메소드형(매개변수)
 *              {
 *                        //구현
 *              }
 *         더하기 가능
 *         int add (int a,int b)
 *         {
 *           // 맨 마지막줄에 
 *           return a+b// 매소드 종료 시점
 *         }
 *         
 *         void
 *         ---------메소드 자체 처리 (데이터 베이스 ==> insert, update, delete)
 *         {
 *          return; // 생략이 가능
 *         }
 *         
 *         1) 구성요소
 *         1. 매개변수=>사용자가 요청한 값
 *                                     =로그인 요청(id,pwd)
 *                                     =아이디 중복체크(id)
 *                                     *** 여러개 => ,로 구분
 *                                     --------------------------3개 이상(배열, 클래스를 이용해서 전송)
 *                                     ex) 정렬=>배열
 *                                           회원가입=>클래스
 *                                           
 *          2. 메소드명  => 변수(식별자)
 *                                  1) 알파벳, 대소문자 구분
 *                                  2) 숫자 (앞에 사용 금지)
 *                                  3) 특수문자\
 *                                  4) 키워드는 사용 금지
 *                                  약속 사항 -->소문자로 시작한다.
 *                                  
 *                                  
 *                                  
 *          3. 리턴형(결과값) =>사용자 요청을 처리한 절대값
 *                                           메소드
 *                                           =>자체 처리(구구단 출력)
 *                                           ==>결과값을 넘겨준다 => 로그인 여부 확인=>해당 데이터형을 설정
 *                                                    ======반드시 1개만 설정이 가능하다
 *          4. 매개변수
 *              ----------1) 사용자가 입력(명시적인 초기화, Scanner, random())
 *                           2) 반복 제어 => 틀린문장
 *                           3) 웹 => 검색, 입력, 버튼 클릭 , 페이지 요청, 상세보기
 *                           
 *                                                        
 */
// 년도, 월 일을 입력
import java.util.Scanner;
public class 메소드_1 {
  static int userInput(String msg)
  {
	Scanner scan=new Scanner(System.in);
	System.out.print(msg);
	int value=scan.nextInt();
	 return value;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int year =userInput("년도 입력:");
	   int month=userInput("월 입력:");
	   int day=userInput("일 입력:");
		/*Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        System.out.println("년도 입력");
        
        int month=sc.nextInt();
        System.out.println("월 입력");
        
        int day=sc.nextInt();
        System.out.println("일 입력");
        
        System.out.println(year+"년도"+month+"월"+day+"일");*/

        
        
	}

}




