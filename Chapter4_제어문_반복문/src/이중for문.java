/*
 * 지역변수(멤버변수=전액변수), 매개변수
 * 제어문 종류 -형식 -동작순서 -응용(배열)
 * 
 * 제어문 종류(단일, 선책, 다중,선택문)
 * -제어문 뒤 ; X
 * -선택조건문은 삼항연산자로 바꿀 수 있어야 함.
 * -다중 조건문 해당 조건에 맞는 조건문만 실행<->switch case
 * -선택문은 한개만 설정 가능하게 한다.
 * 
 * 반복문
 * -for 반복횟수 알고있음
 * -while 반복횟수 모르고있음(목록출력, 페이지나누기)=> 무한루프 (네트워크 서버, 데이터 베이스 값 가져올때) => 서버 단형식- 선조건이라 실행이 안될수도있음
 * -do while 무조건 한번 이상 수행 해야됨- 후조건
 * 
 *반복제어문
 *-break 반복중단
 *-continue 반복에서 특정부분 제외
 *
 * 
 *
 */

public class 이중for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        1~10까지출력
		System.out.println("=== for문 ===");
	    for(int i=1;i<=10;i++) {
              System.out.print(i+" ");
	    } System.out.println("\n=== while문 ===");
	    int i=1;
	    while(i<=10) {}
	}

}
