package exception_demo;

//예외 전가
//오류를 떠넘기는 방법
public class Exception_02 {
	public static void main(String[] args) { //상사
		//main에 throws를 적으면 돌아갈 곳이 없으므로 처리하지 않는 것과 같은 말이다.
		
		try{
			method();
		}
		catch(Exception e){
			System.err.println("오류 발생 !");
		}
	}

	public static void method() throws ArithmeticException { //나 -> 상사 에게 떠넘긴다.
		// arithmetic에러가 발생하면 나를 부른 메소드에서 처리한다.
		// 둘중의 한곳에서는 예외 처리 코드가 있어야 한다.
		System.out.println(5 / 0);

	}
}
