package exception_demo;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외 (Exception) 와 에러 (Error) 의차이
// 에러는 100%실행이 안되는 문제점 - 반드시 해결해야 하낟.
//예외는 어쩌다 가끔씩 안되는 문제점 - 기법으로 회피 또는 해결

public class Exception_01 {

	public static void main(String[] args) {
		// 숫자 두개를 입력받아 나눗셈을 수행하는 프로그램
		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0;
		try { // 예외 발생 위험 지역
			System.out.print("숫자입력 : ");
			a = scanner.nextInt();
			if(a<0){
				throw new Exception(); //집어던진다.
				//조건에 걸리는 순간 아래로 진행되지 않는다.
			}
			System.out.print("숫자입력 : ");
			
			b = scanner.nextInt();
			if(b<0){
				throw new Exception(); //집어던진다.
			}
			System.out.print("결과 : ");

			System.out.println(a / b);
		} 
		
		//대빵으로 모두 처리 (다형성의 원리)
		catch(Exception e){
			System.out.println("오류 발생");//포괄적으로 처리 하지만 예외를 구분해 처리 불가
			System.out.println(e); //오류 발생시 발생에러를 가져온다.
			System.out.println(e.getMessage()); //getMessage 로 에러 원인 출력
			e.printStackTrace(); // 에러를 있는 그대로 출력
		}
		/*
		catch (InputMismatchException e) {
			//에러발생을 catch로 넘겨와 대체한다.
			System.err.println("숫자 입력하라고 했냐 안했냐");
		} 
		catch (ArithmeticException e) {
			System.err.println("초등학교 안나왔냐");
		}
		//예외별로 자세하게 대처가능하지만 추가로 발생하는 에러는 대체불가
		*/
		
		finally{ //오류의 발생여부와 상관없이 최종적으로 수행되는 구문
			System.out.println("만든이 황인빈");
		}
	}
}
// try - catch - finally

// Object <-Throwable (java.lang) <-Exception (java.lang) <- 자바에 존재하는 모든 예외(InputMismatch, Arithmetic....)
// 예외처리 방법 : 예외처리 클래스를 만들어 exception을 상속 받던가 / try(분류소) catch(쓰레기장)사용