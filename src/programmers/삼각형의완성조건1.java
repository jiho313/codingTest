package programmers;

import java.util.Arrays;

public class 삼각형의완성조건1 {

	public static void main(String[] args) {
		
//		선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
//		가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
//		삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.

//		[제한사항]
//		sides의 원소는 자연수입니다.
//		sides의 길이는 3입니다.
//		1 ≤ sides의 원소 ≤ 1,000
		
//		[입출력 예]
//		sides	result
//		[1, 2, 3]	2
//		[3, 6, 2]	2
//		[199, 72, 222]	1
		
		int[] sides = {199, 72, 222};	
		int max = 0;
		int sum = 0;
		int answer = 0;
		
		//for문을 이용한 문제풀이
//		for (int i = 0; i < sides.length; i++) {
//			if (max < sides[i]) {
//				max = sides[i];
//			}
//		}
//		for (int i = 0; i < sides.length; i++) {
//			if(max > sides[i]) {
//				sum += sides[i];
//			}
//		}
//		if (max < sum) {
//			answer = 1;
//		} else {
//			answer = 2;
//		}
//		System.out.println(answer);
			
		//Array.sort()메서드를 이용한 문제풀이
		Arrays.sort(sides);
		if (sides[2] < sides[0]+sides[1]) {
			answer = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);
		
		
	
	}
}
