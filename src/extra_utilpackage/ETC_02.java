//시스템의 날짜 관리 클래스 = Date, Calender

//Date(설정은 금지되고 확인위주로 사용됨) ->Calender 로 넘어가는 추세
//Calender - 객체를 스스로 만들 수 없는 추상클래스로 설정,확인이 가능하다

package extra_utilpackage;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ETC_02 {
	public static void main(String[] args) {
		Date date = new Date();
		//	import java.util.Date;
		System.out.println(date);
		
		// ~ Format클래스 이용 (java.text)
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); // 형식 yyyy/MM/dd 대소문자 구분 (mm - 분)
		//import java.text.SimpleDateFormat;
		
		String today = sdf.format(date); //내가 요청한 형식대로 값을 담는다
		
		System.out.println(today);
	}
}
