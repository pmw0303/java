package Day09;

public class HankookTire extends Tire {

	// 필드

	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	@Override // 슈퍼클래스내 메소드를 재정의
	public boolean roll() {
		// TODO Auto-generated method stub
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크***");
			return false;
		}
	}
}
