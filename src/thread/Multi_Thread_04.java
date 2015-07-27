package thread;

import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import java.util.Date;

/*
 * 시계만들기
 * 
 * 멀티 스레드를 이용하여
 * main에서 입력
 * Timer라는 클래스에서는 스레드 구동을 통해
 * 시계가 작동되도록 프로그램을 만드시기 바랍니다.
 * 
 * 
 * 2015년 7월 24일 오후 [3시 45분 3초]
 * 
 * 5초가 작동되도록 하시면 됩니다.
 */

class Timer extends Thread {
	public void run() {
		// 1초에 한번씩 시간을 출력

		while (true) {

			Date date = new Date();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/"); 
			// import java.text.SimpleDateFormat;

			String today = sdf.format(date); // 내가 요청한 형식대로 값을 담는다

			System.out.println(today);
			try{
				Thread.sleep(1000L); //1000L
			}catch(InterruptedException e){}
		}
	}
}

public class Multi_Thread_04 {
	public static void main(String[] args) {

		//스레드 생성 및 구동
		
		Timer timer = new Timer();
		timer.setDaemon(true);
		timer.start();
		
		String text = JOptionPane.showInputDialog("입력");
		System.out.println("입력된 메세지 : " + text);

	}
}
