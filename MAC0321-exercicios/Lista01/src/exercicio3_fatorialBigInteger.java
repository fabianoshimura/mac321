import java.math.BigInteger;

public class exercicio3_fatorialBigInteger {

	public BigInteger fatorial (String n) {
		BigInteger res = new BigInteger("1");
		BigInteger m = new BigInteger(n);
		BigInteger a = new BigInteger("-1");
		
		while (m.intValue() > 0) {
			res = res.multiply(m);
			m = m.add(a);
		}
		
		return res;
	}
}
