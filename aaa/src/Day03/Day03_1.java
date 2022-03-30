package Day03;

public class Day03_1 {
	
	// 1일차 : 출력 , 입력
			// 2일차 : 저장(변수) , 계산(연산) 
			// 제어문 
				// 컴퓨터의 판단력~~ => 경우의수 
				// 조건식이 true 이면 실행문 처리 
				// 형태  
					// 1.  IF( 조건식[true/false] ) 실행문;
					// 2.  IF( 조건식 ) 실행문[참];
					//     ELSE 실행문[거짓];
					// 3.  실행문이 2줄 이상( ; 2개 이상이면 )  {   } 묶음처리 
					// 4.  경우의수 다수일때 [ 조건이 다수일때 ]
					//	   IF( 조건1 ) { 실행문[참1]; }
					//	   ELSE IF( 조건2 ) { 실행문[참2]; }
					//	   ELSE IF( 조건3 ) { 실행문[참3]; }
					//	   ELSE IF( 조건4 ) { 실행문[참4]; }
					//	   ELSE IF( 조건5 ) { 실행문[참5]; }
					//     ELSE { 실행문[거짓]; }
					// 5. if 중첩
					//		IF( 조건식 ) { 
					//			IF( 조건식 ){ 실행문; }
					//			ELSE { 실행문; } 
					//		}ELSE{
					//			IF( 조건식 ){ 실행문; }
					//			ELSE { 실행문; }
					//		}

	public static void main(String[] args) {

		if (3 > 1)
			System.out.println("3이 1보다 크다. ");
		// 만약 3이 1보다 크면 출력 / 아니면 출력X
		// true 실행

		if (3 > 5)
			System.out.println("3이 5보다 크다. ");
		// 만약 3이 5보다 크면 출력o 아니면 출력X

		if (3 > 1)
			System.out.println("3이 1보다 크다. ");
		else
			System.out.println("3이 1보다 작다. ");
		// 만약 3이 1보다 크면 위에 출력 / 아니면 밑에 출력

		if (3 > 5) {
			System.out.println("true");
			System.out.println("3이 2보다 크다. ");
		} else {
			System.out.println("false");
			System.out.println("3이 5보다 작다. ");
		}

		if (3 > 5) //결과 1개
			System.out.println("3이 5보다 크다. ");
		else if (3 > 4)
			System.out.println("3이 4보다 크다. ");
		else if (3 > 3)
			System.out.println("3이 3보다 크다. ");
		else if (3 > 2)
			System.out.println("3이 2보다 크다. ");
		else
			System.out.println("true 없다. ");

		
		
		if (3 > 5) //결과 여러개
			System.out.println("3이 5보다 크다. ");
		if (3 > 4)
			System.out.println("3이 4보다 크다. ");
		if (3 > 3)
			System.out.println("3이 3보다 크다. ");
		if (3 > 2)
			System.out.println("3이 2보다 크다. ");
			System.out.println("true 없다. ");
	}
}
