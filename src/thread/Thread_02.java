package thread;

import javax.swing.JOptionPane;

//multi thread로 동일한 내용 구현
class MyThread extends Thread {
	public void run() { // run : 고정 된 이름
		for (int i = 1; i <= 100; i++) {
			System.out.println("i = " + i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
} // Thread를 부모로 가지기 때문에 Thread 가 되는 MyThread


// 프로그램 시작 -> 입력 -> 반복 -> 종료  : 단일 Thread
// 프로그램 시작 ->   입력/반복   -> 종료  : 병렬 Thread 모양 

public class Thread_02 {
	public static void main(String[] args) { // 프로그램에서 가장 먼저 시작되는 것은 main 임으로
		//Thread를 main에 적어 줘야 한다.
		
		System.out.println("메인 시작");
		
		//Thread 추가 및 구동
		//thread class의 객체 추가
		MyThread my = new MyThread();
		my.setDaemon(true);
		//시작은 main에서 구동시켜 주지만 종료는 main에서 시켜주는 것이 아니다
		//그래서 main과 종속계약(노예 계약)을 맺어 주어야 한다. - demon설정

		//my.run(); //메소드 호출 - 이것만 적었을 때는 
		//위의 100세는 thread를 끝낸다음에야 main의 내용을 부른다
		my.start(); // 멀티 thread(2개 이상의 thread) 구동 명령

		// 입력
		String text = JOptionPane.showInputDialog("입력");
		System.out.println("text = " + text);
		
		System.out.println("메인 종료");
	}
}
