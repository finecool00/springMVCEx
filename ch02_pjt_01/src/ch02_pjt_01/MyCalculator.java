package ch02_pjt_01;

public class MyCalculator {

	
	//덧셈기능
	public void calAdd(int fNum, int sNum) {
		ICalculator calculator = new CalAdd(); //CalAdd객체 생성(ICalculator인터페이스 상속받은 클래스로 ICalculator타입 객체로 생성 가능)
		int value = calculator.doOperation(fNum, sNum); //덧셈 실행
		System.out.println("result : " + value);
	}
	
	
	//뺄셈기능
	public void calSub(int fNum, int sNum) {
		ICalculator calculator = new CalSub();
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	
	
	//곱셈기능
	public void calMul(int fNum, int sNum) {
		ICalculator calculator = new CalMul();
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	
	
	//나눗셈기능
	public void calDiv(int fNum, int sNum) {
		ICalculator calculator = new CalDiv();
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	
}
