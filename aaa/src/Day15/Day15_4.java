package Day15;

public class Day15_4 {

	// 12장 : 스레드 - 코드 읽어주는 역할
		// 코드 -> 파일 -> 프로세스
		// 목적 : 병렬처리
			// main메소드에 main스레드 포함
		// 사용방법
			// 1. Thread 클래스
			// 2. Runnable 클래스
		// run 메소드 : 멀티스레드의 실행코드
	
	public static void main(String[] args) {
		// ex1) Thread 클래스를 이용한 병렬처리 객체 만들기
		음악 m1 = new 음악();
		m1.start(); // run메소드 실행
		// ex2) Runnable 인터페이스를 이용한 병렬처리 객체
		채팅 c1 = new 채팅();
		// c1.start(); - 인터페이스는 start() 메소드를 가지고 있지 않음
		Thread thread = new Thread(c1);
		thread.start();
		
		while(true) {
			System.out.println("프로그램 작동중");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
	}
}
