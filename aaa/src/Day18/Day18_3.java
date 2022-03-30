package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {

	public static void main(String[] args) {
		
		// p731 ~ 732 
		// LinkedList
		
		//			ArrayList		vs		LinkedList
		//			배열						링크
		//	내부구조 차이
		//		인덱스 기준으로 메모리연결			서로 다른 메모리주소 연결
		//	속도 차이
		//	add[삽입]		빠름
		//	add[삽입-중간]						빠름
		//	검색			빠름
		//	삭제								빠름
		
		// 1. ArrayList 객체선언
		ArrayList<String> list1 = new ArrayList<>();
		// 2. LinkedList 객체 선언
		LinkedList<String> list2 = new LinkedList<>();
		
		// 3. 시간변수
		long starttime;
		long endtime;
		
		// 4. arraylist에 10000개 삽입하는데 걸리는 시간
		starttime = System.nanoTime(); // 현재시간 나노로 출력
		for(int i=0 ; i<10000 ; i++) {
			list1.add(0,i+""); 
			// 정수-> 문자열 반환 
				// 1. String.valueOf(정수)
				// 2. 정수 + ""
			// 문자열 -> 정수 반환
				// 1. Integer.parseInt(문자열)
		}
		endtime = System.nanoTime();
		System.out.println("시간 : " + (endtime-starttime));
		
		// 5. Linkedlist에 10000개 삽입하는데 걸리는 시간
		starttime = System.nanoTime();
		for(int i=0 ; i<10000 ; i++) {
			list2.add(0,i+""); 
			// 정수-> 문자열 반환 
				// 1. String.valueOf(정수)
				// 2. 정수 + ""
			// 문자열 -> 정수 반환
				// 1. Integer.parseInt(문자열)
		}
		endtime = System.nanoTime();
		System.out.println("시간 : " + (endtime-starttime));
		
	}
}
