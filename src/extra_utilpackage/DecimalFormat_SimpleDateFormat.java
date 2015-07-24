package extra_utilpackage;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//현재시간을 다음과 같이 변환하여 출력하십시오
// 2015년 7월 24일 [오후 1시 24분 3초]

public class DecimalFormat_SimpleDateFormat {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 M월 d일 E요일");
		SimpleDateFormat sdf1 = new SimpleDateFormat("[a h시 m분  s초]");
		//앞파벳의 숫자는 최소한의 자릿수를 뜻한다.
		
		System.out.println();
		
		String today = sdf.format(date) + sdf1.format(date); 
		
		System.out.println(today);
		
		//또다른 형식들 ...... DecimalFormat(숫자 자리수)
		
		DecimalFormat df = new DecimalFormat("###,###.000"); //패턴 (#, 0)
		//0은 무조건 확보 #은 있으면 찍고 아니면 말고
		
		int a = 123456789;
		System.out.println(df.format(a));
	}
}
