package getPI;

public class Main {

	public static void main(String[] args) {
		Euler e = new Euler();
		Wallis w = new Wallis();
		Ramanujan r = new Ramanujan();
		
		System.out.println("오일러 곱셈 공식 : " + e.getPI());
		System.out.println("존 월리스 공식 : " + w.getPI());
		System.out.println("라마누잔 공식 : " + r.getPI());
	}
}
