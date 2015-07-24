package thread;

import javax.swing.JOptionPane;

//Runnable 인터페이스를 이용한 Thread 구동
//클래스 상속을 더이상 받을 수 없는 경우에 사용한다.

class MyRunnable implements Runnable{ //인터페이스
	//인터페이스는 추상메소드를 가지고 있다.
	
	public void run(){
		for (int i = 1; i <= 100; i++) {
			System.out.println("i = " + i);
			// 1초 정지 : thread.sleep(밀리초); - InterruptedException 예외 전가
			//그럼으로 try catch를 붙여줘야 한다.

			try {
				Thread.sleep(1000);// 1000밀리초 = 1초
			} catch (Exception e) {
			}

		}
	}
	
}
public class Mulit_Thread_03 {
	
	public static void main(String[] args) {
		System.out.println("main 시작");
		
		//thread 생성 및 구동 개시
		MyRunnable my = new MyRunnable();
		//my.start(); 가 불가하다. Runnable의 Interface에는 start가 없다
		//그래서 start를 가지고 있는 class를 빌려서 사용한다.
		
		Thread th = new Thread(my); //Runnable은 Thread에서 정보복사를해와서 start를 실행시켜야 한다.
		th.setDaemon(true);
		th.start();
		
		
		//익명 중첩 클래스를 이용한 thread 추가
		Thread tmp = new Thread(){
			public void run() {
			//실행 내용
			}
		};
		tmp.setDaemon(true);
		tmp.start();
		
		String text = JOptionPane.showInputDialog("입력"); // 입력창을 그래픽창으로 띄운다
		System.out.println("text = " + text);

		// 1부터 100까지 1초간격으로 출력
	
		
		System.out.println("main 종료");
	}
}
