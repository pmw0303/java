package Day07;

import java.util.Scanner;

public class Member {

	// 필드

	int mno; // 
	String id;
	String pw;
	String name;
	String phone;

	// 생성자
		// 1. 빈 생성자
		public Member() {
			
		}
		// 2. 모든 필드를 받는 생성자 
		public Member(int mno, String id, String pw, String name, String phone) {
			super();
			this.mno = mno;
			this.id = id;
			this.pw = pw;
			this.name = name;
			this.phone = phone;
		}

	// 메소드

		// 1. 회원가입 [인수 X 반환 O]
	boolean 회원가입() {		
		System.out.println("------------------회원가입 페이지------------------");
		System.out.print("아이디 : "); String id = Day07_5_BookApplication.sc.next();
		System.out.print("비밀번호 : "); String pw = Day07_5_BookApplication.sc.next();
		System.out.print("이름 : "); String name = Day07_5_BookApplication.sc.next();
		System.out.print("연락처 : "); String phone = Day07_5_BookApplication.sc.next();
														// 클래스명.필드명.함수명()

		// 아이디 중복 체크
		
		for(Member temp : Day07_5_BookApplication.member) {
			if(temp != null && temp.id.equals(id)) {
				// 만약 공백 아니면서 입력받은 아이디와 동일
				System.err.println("알림>> 현재 사용중인 아이디입니다");
				return false; // 아이디가 중복되었기 때문에 false
			}
		}
		
		// 회원번호 자동주입 [ 가장 최근 가입한 회원의 번호 + 1 ]
		
		int bno = 0;
		int j = 0;
		for (Member temp : Day07_5_BookApplication.member) {
			if (temp == null) {
				if (j == 0) { // 첫번째 인덱스가 null -> 첫회원
					bno = 1;
					break;
				} else {
					bno = Day07_5_BookApplication.member[j - 1].mno + 1;
					break;
				}

			}
			j++;
		}
		
		// 2. 4개 변수 -> 객체화 -> 1개
		Member member = new Member(bno, id, pw, name, phone); // 모든 필드 받는 생성자로 객체 생성
		// 3. 배열 내 빈 공간을 찾아서 새로운 회원[객체] 넣기
		// for(int i = 0 ; i < Day07_5_BookApplication.member.length ; i++) 
		int i = 0; 
		for( Member temp : Day07_5_BookApplication.member)	{
			 if(temp == null) { // 비어있으면 빈 인덱스에 저장
				 Day07_5_BookApplication.member[i] = member; 
				 return true; // 회원가입 메소드 종료 / 반환 = true
			 }
		 } i++;
		 // 4. 가입 성공 시 true 반환 실패스 false
		return false; // 회원가입 실패				
	}
	
		
	// 2. 로그인 [인수 X 반환 O]
	String 로그인() {
		System.out.println("------------------로그인 페이지------------------");
		System.out.print("아이디 : "); String id = Day07_5_BookApplication.sc.next();
		System.out.print("비밀번호 : "); String pw = Day07_5_BookApplication.sc.next();
		
		for(Member temp : Day07_5_BookApplication.member) {
			
			if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
				return temp.id;
				// 성공 시 입력한 id 반환
			}
		}
		// 실패 시 null 반환
		return null;
	}
	 
		// 3. 아이디찾기 [ 인수 X 반환 X ]
	void 아이디찾기() {
		System.out.println("-------------아이디 찾기------------");
		System.out.println("이름 입력 : "); String name = Day07_5_BookApplication.sc.next();
		System.out.println("전화번호 입력 : "); String phone = Day07_5_BookApplication.sc.next();
		
		for(Member temp : Day07_5_BookApplication.member) {
			
			if(temp.name != null && temp.name.equals(name) && temp.id.equals(phone)) {
				System.out.println(temp.name + "님 확인되었습니다");
				System.out.println("아이디는 " + temp.id + "입니다");
				return;
			} 
				
		} 
		System.err.println("알림>> 회원정보가 없습니다");
		
	}
	
		// 4. 비밀번호찾기 [ 인수 X 반환 X ]
		void 비밀번호찾기() {
			System.out.println("-------------비밀번호 찾기------------");
			System.out.println("아이디 입력 : ");
			String id = Day07_5_BookApplication.sc.next();
			
			System.out.println("전화번호 입력 : ");
			String phone = Day07_5_BookApplication.sc.next();

			for (Member temp : Day07_5_BookApplication.member) {

				if (temp.id != null && temp.name.equals(id) && temp.id.equals(phone)) {
					System.out.println(temp.id + "님 확인되었습니다");
					System.out.println("비밀번호는 " + temp.pw + "입니다");
					return;
				}

			}
			System.err.println("알림>> 회원정보가 없습니다");
		}

		// 5. 회원탈퇴(도전)
	
		// 6. 회원수정(도전)

}
