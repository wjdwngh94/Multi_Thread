package extra_utilpackage;

import java.util.Calendar;

//Calendar 클래스 : single - tone 방식의 객체 생성
//미리 1개만 만들어 놓고 더이상의 객체 생성을 금지하는 방식
//시스템의 시간을 변경가능한 객체임으로
//생성자가 잠겨있다.

public class ETC_04 {
	public static void main(String[] args) {
		//미리만들어진 객체를 대여한다.
		Calendar cal = Calendar.getInstance(); // new로 객체생성하는 것이 아니다.
		//System.out.println(cal);
		
		
		//API 이용 팁
		//메소드의 이름 형태
		//1.정보 추출 용도 메소드 : get~~();
		//2.정보 설정 용도 메소드 : set~~();
		//3.질문 용도 메소드 : (값이 있는가 / 사용가능 한가) is~~();
		
		//cal 에 정보 설정 - set(항목, 값);
		cal.set(Calendar.YEAR, 2000);
		cal.set(Calendar.MONTH, 7-1); // 7월 계산 이지만 6으로 넣어야 함으로 7-1로 표시한다.
		
		//cal 에서 정보를 뽑아와서 표시 - get(항목 숫자값)
		int yy = cal.get(Calendar.YEAR); // get(1)과 동일하고 이것이 연도이다.
		int mm = cal.get(Calendar.MONTH)+1; // 0~11로 1~12월표시임으로 +1
		int dd = cal.get(Calendar.DATE);// Calendar.DAY_OF_MONTH와 동일하다.
		int hour = cal.get(Calendar.HOUR);//HOUR_OF_DAY는 24시간
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		String today = yy + "년" + mm +"월" +dd+"일"+hour+ "시"+min+"분"+sec+"초";
		System.out.println(today);
		
		int yoil = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일 : " + yoil);
	}
}
