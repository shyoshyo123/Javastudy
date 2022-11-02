/*
 *  String
 *  --------문자열을 저장하는 기능, 문자열 제어하는 기능(라이브러리)
 *  1)저장방법
 *  "String s="; 가장 많이 사용하는  방법
 *   String s=new String("")
 *   String id="admin" 
 *   2)기능(메소드)
 *     --------------
 *     1. 문자 변환
 *        1) toUpperCase : 대문자 변환
 *        2) toLowerCase : 소문자 변환
 *       *** 3) valueOf : 모든 데이터형을 문자열로 변경
 *                   int a=10;
 *                   alueOf(a) ==> "10" ==> parseInt("10") ==>10
 *                   boolean b =true
 *                   valueOf(b) ==> "true"
 *                   
 *     2. 문자 제어
 *    *** 1) substring()==>문자열 자를때 사용
 *     3. 문자 변경
 *         1) trim() ==> 좌우 공백을 제거 (입력)
 *         2) replace() ==> 글자 변경 ==> 오라클 (크롤링)==>이미지
 *            (오라클) replace('&','^')
 *         3) replaceAll() ==> 정규식 (문자 형식)
 *             ip
 *             replaceAll("[0-9]{1,3}\\,[0-9]{1,3}\\,[0-9]{1,3}\\,[0-9]{1,3}")
 *                                맛있는, 맛있고---
 *                                ----------------------맛있+ ==> 분석(빅데이터,AI)
 *         4) splite(): 문자열을 배열로 변경
 *             String s="red,blue,green";
 *             String [] arr=s.spilte(",") ==>{red,blue,green}
 *     4. 문자 비교
 *       1) equals() : 대소문자 구분 후 비교 (로그인, 아이디 중복 체크, 아이디찾기, 상세보기)
 *       2) contains() : 포함 (검색) 
 *       3) startsWith() : 서제스트(자동완성) 시작단어
 *       4) endsWith() : 끝나는 단어
 *       -------------------------------------------------------검색기
 *     5. 문자 찾기
 *        1) indexOf : 앞에 있는 데이터 찾기
 *        String s= "hello java"
 *             s.indexOf("a");
 *        2) lastIndexOf : 뒤에서 데이터 찾기
 *        
 *     6. 기타
 *     concat("a","b")==> ab 
 *     charAt()==> 문자 한개 가지고 올때
 *       
 *  
 *  
 */
public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //String s= "Hello java";
    // char[] c= s.toCharArray();
    // System.out.println(c);
     
     //  변수 선언
		
		String msg;//="Hello java";
		//char[]==>
		//초기화
		msg="Hello java";
		//	활용
		//문자의 개수활용(length()) ==>
		System.out.println(msg.length()); //공백도 문자로 취급한다. 비밀번호 자리수
		//공백울 제거
		System.out.println(msg.trim().length()); //입력값에 사용자가 등록 (실수->space)
		//좌우에 있는 공백만 제거
    //3.변화
      System.out.println(msg.toUpperCase()); //대문자  검색
      System.out.println(msg.toLowerCase()); // 소문자   검색
      //자르기 
      /*
       * substring(int start)->저장된 위치부터
       * substring(int start,the end)->
       */
      System.out.println(msg.substring(6));
      System.out.println(msg.substring(0,4));
    String post="101-123";
    System.out.println(post.substring(0,3));
    System.out.println(post.substring(4));
    String fileName="문자열_1.java";
    System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));
    System.out.println(msg.indexOf("a"));
    System.out.println(msg.lastIndexOf("a"));
	}

}





