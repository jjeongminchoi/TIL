package TIL;

import java.util.Scanner;

public class AsciicodeChange {

	public static void main(String[] args) {
		
		// 입력받은 아스키코드를 10진수로 변환하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 또는 숫자를 입력해주세요");
		char alpa = sc.nextLine().charAt(0);
		int ialpa = (int)alpa;
			
		System.out.println(ialpa);
		
	}

}
