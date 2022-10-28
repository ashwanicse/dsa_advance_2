package recursion_2;

/**
 * @author ashwani-kuma
 * 
 *         Sum of digits of a number using recursion.
 *
 */
public class Ex1_SOD {

	static int sod(int N) {
		if (N == 0)
			return 0;
		return (N % 10) + sod(N / 10);
	}

	public static void main(String[] args) {
		System.out.println(sod(83557));
	}

}
