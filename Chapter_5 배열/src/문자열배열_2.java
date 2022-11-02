import java.util.Scanner;
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] books= {
        		"java And Oracle",
        		"java And JSP",
        		"HTML5 & CSS3",
        		"Spring & Vue JS",
        		"StringBoot & React JS",
        		"JPA와 java",
        		"MyBatis & java",
        		"혼자 배우는 자바",
        		"Java의 정석"
        };
        System.out.println("=========전체출력==========");
        for(int i=0;i<books.length;i++)
        	{
        	System.out.println((i+1)+"."+books[i]);
	}
        System.out.println("=========================");
        // 2.검색 :contains
        Scanner scan=new Scanner(System.in);
        System.out.print("검색 입력:");
        String fd=scan.next();
        for(String book:books)
        {
        	if(book.contains(fd)) // 결과값 (true/false)
        		System.out.println(book);
        }
        //////////////////////////////서제스트
        //3.시작문자/끝문자 ==>자동완성기
        System.out.println("==== startWITH ====");
        for(String book:books)
         { if(book.startsWith(fd))
        	System.out.println(book);
         }
        System.out.println("==== endsWITH ====");
        for(String book:books)
        { if(book.endsWith(fd))
       	System.out.println(book);
        }
        
        
	}
}







