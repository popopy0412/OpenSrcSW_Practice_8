package getPI;

public class Ramanujan {
	private static double PI;
	public Ramanujan() {
		double sum=0;
		for(double i=0;i<=100;i++) {
			double temp = (1103 + 26390*i);
			for(double j=1;j<=4*i;j++) {
				temp *= j;
				temp /= 396.0;
			}
			for(double j=1;j<=i;j++) temp = temp / j/j/j/j;
			sum += temp;
		}
		PI = 1/(Math.sqrt(8)/9801*sum);
	}
	public double getPI() { return PI; }
}
 