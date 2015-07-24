package extra_utilpackage;

import java.util.Random;

//기타 유틸 잡 클래스 1탄 - Random 클래스

public class ETC_01 {

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextInt()); // 무작위 인트범위안의 숫자 
		System.out.println(rand.nextBoolean()); // 논리
		
		System.out.println(rand.nextDouble()); // 0 이상 1미만
		System.out.println(rand.nextFloat()); // 0 이상 1미만

		System.out.println(rand.nextGaussian()); // 가우스 분포, 정규분포
		// ex. 평균키 173 부근을 벗어나면 서서히 분포가 줄어든다.

		System.out.println(rand.nextInt(2)); // 2 = 가짓수
		
		//1부터 100사이의 값 출력
		System.out.println(rand.nextInt(100)+1);
	}
}
