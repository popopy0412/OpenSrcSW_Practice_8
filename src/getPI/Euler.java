package getPI;

public class Euler {
	private static double PI;
	public Euler(){
		double sum=0;
		for(double i=1;i<=100000000;i++) {
			sum += 1/(i*i);
		}
		PI = Math.sqrt(sum*6);
	}
	public double getPI() { return PI; }
}