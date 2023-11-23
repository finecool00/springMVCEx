package ch02_pjt_01;

public class MyCalculator {

	
	public void calculate(int fNum, int sNum, ICalculator calculator) { //ICalculator 객체 주입
		int value = calculator.doOperation(fNum, sNum); //연산 실행
		System.out.println("result : " + value);
	}
	
	
//	//덧셈기능
//	public void calAdd(int fNum, int sNum, CalAdd calAdd) { //calAdd 객체 주입
//		int value = calAdd.doOperation(fNum, sNum); //덧셈 실행
//		System.out.println("result : " + value);
//	}
//	
//	
//	//뺄셈기능
//	public void calSub(int fNum, int sNum, CalSub calSub) { //calSub 객체 주입
//		int value = calSub.doOperation(fNum, sNum); //뺄셈 실행
//		System.out.println("result : " + value);
//	}
//	
//	
//	//곱셈기능
//	public void calMul(int fNum, int sNum, CalMul calMul) { //calMul 객체 주입
//		int value = calMul.doOperation(fNum, sNum); //곱셈 실행
//		System.out.println("result : " + value);
//	}
//	
//	
//	//나눗셈기능
//	public void calDiv(int fNum, int sNum, CalDiv calDiv) { //calDiv 객체 주입
//		int value = calDiv.doOperation(fNum, sNum); //나눗셈 실행
//		System.out.println("result : " + value);
//	}
	
}
