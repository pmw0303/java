package Day14;

public class Day14_3 {

	public static void main(String[] args) {
		
		// 메소드 = 함수
			// 호출방법 [1. 객체 2. static]
		// 객체
		컨트롤러 컨트롤러객체 = new 컨트롤러();
		컨트롤러객체.입차("1234");
		// static
		컨트롤러.입차2("1234");
			// 인수 : 메소드 안으로 들어가는 데이터 [동일한 자료형으로 받음]
			// 반환 : 메소드 밖으로 나오는 데이터 [메소드 호출 후 반환]
			// 1. 인수O 반환O
		
		boolean 결과 = 컨트롤러.입차2("1234");
			// 메소드에 1234(인수) 보내고 메소드 호출
		
			// 2. 인수O 반환X
		컨트롤러객체.출차("1234");
			// 메소드에 1234문자를 인수로 보내고 메소드 실행 후 반환값이 없기때문에 결과 변수X
		
		String 결과2 = 컨트롤러객체.매출();
		
		컨트롤러객체.차량리스트();
		
		// @Override : 동일한 메소드명 / 인수
		// 추상메소드
			// 선언부 존재하고 구현부X
		// static, final
	}
}
