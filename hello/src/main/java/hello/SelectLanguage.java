package hello;

import java.util.Scanner;

public class SelectLanguage {

	public void sayHello() {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Select language! 1.korea, 2.english");

			int num = scan.nextInt();

			if(num == 1) {
				System.out.println("안녕하세요");
			} else if(num == 2) {
				System.out.println("Hello");
			} else {
				System.out.println("다시 입력해주세요");
			}
		
		}
		
		
		
	}
	
	
	
	
}
