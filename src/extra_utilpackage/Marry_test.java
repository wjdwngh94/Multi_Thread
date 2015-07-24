package extra_utilpackage;

import java.util.Calendar;
import java.util.Random;

public class Marry_test {
	public static void main(String[] args) {
		Random rand = new Random();
		Calendar cal = Calendar.getInstance();

		int yoil;
		while (true) {
			cal.set(Calendar.YEAR, 2016);
			cal.set(Calendar.DATE, rand.nextInt(31)+1);
			cal.set(Calendar.MONTH, rand.nextInt(12) - 1);
			
			int yy = cal.get(Calendar.YEAR);
			int mm = cal.get(Calendar.MONTH) + 1;
			int dd = cal.get(Calendar.DATE);
			
			String today = yy + "년" + mm + "월" + dd + "일";
			yoil = cal.get(Calendar.DAY_OF_WEEK);
			
			if (yoil == 1 || yoil == 7) {
				System.out.println(today);
				break;
			}
		}
		switch (yoil) {
		case 7:	System.out.println("토요일");
			break;
		case 1:	System.out.println("일요일");
			break;
		default:
			break;
		}
	}
}
