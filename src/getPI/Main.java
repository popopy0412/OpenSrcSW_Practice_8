package getPI;

public class Main {

	public static void main(String[] args) {
		Euler e = new Euler();
		Wallis w = new Wallis();
		Ramanujan r = new Ramanujan();
		
		System.out.println("���Ϸ� ���� ���� : " + e.getPI());
		System.out.println("�� ������ ���� : " + w.getPI());
		System.out.println("�󸶴��� ���� : " + r.getPI());
	}
}
