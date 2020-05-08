package getPI;

public class Wallis {
	private static double PI;
	public Wallis() {
		double sum=1;
		for(double i=1;i<=100000000;i++) {
			sum *= (1 - 1/(4*i*i));
		}
		PI = 2/sum;
	}
	public double getPI() { return PI; }
}
