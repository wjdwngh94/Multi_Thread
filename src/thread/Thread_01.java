package thread;

import javax.swing.JOptionPane;

// 프로그램 --실행(메모리 등록)--> 프로세스(실행되는 프로그램 - jvm)
// 프로세스(  THread(작업 그룹) thread(작업 그룹) thread(작업 그룹) .......)
// thread - 동시에 할수 있는 그룹
// 각각의 thread는 stack을 가진다.

// 그리고 thread class를 사용하여 thread를 추가한다.
// ex. 프로그램 작동중에도 음악이나 시계가 움직인다.

// Lock 과 unLock - java는 기본적으로 unLock 를 thread마다 달고 생성됨
// 화장실 문을 열고 닫을 때 등.. 동시에 이용하는 것을 막아준다.
// synchronized를 사용하여 Lock로 바꿔 준다.
// ex. 운영체제안에 프로세스들(카톡 , jvm) 들이 1/n씩 메모리를 가져간다.
// ex. 그래서 jvm안에서 여러개의 thread가 생겨도 카톡에게는 영향을 주지 않는다.
// ex. 즉, 프로세스 속에 속해져 있는 thread이기 때문에 다른 프로세스의 thread에는 영향을 주지 않는다.

// 단일 thread
// 시분할

//단일 thread에서는 어떻게 입력과 반복이 처리되는 가????
public class Thread_01 {
	public static void main(String[] args) { // main도 하나의 thread이다.

		// 입력
		String text = JOptionPane.showInputDialog("입력"); // 입력창을 그래픽창으로 띄운다
		System.out.println("text = " + text);

		// 1부터 100까지 1초간격으로 출력
		for (int i = 1; i <= 100; i++) {
			System.out.println("i = " + i);
			// 1초 정지 : thread.sleep(밀리초); - InterruptedException 예외 전가
			//그럼으로 try catch를 붙여줘야 한다.

			try {
				Thread.sleep(1000);// 1000밀리초 = 1초
			} catch (Exception e) {
			}

			// 단일 thread이기 때문에
			// 입력과 반복문이 동시에 진행되지 못한다.
			// 모두가 한줄로 서있는 것과 같다.

		}

	}
}
