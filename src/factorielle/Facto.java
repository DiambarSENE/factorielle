package factorielle;

public class Facto {

	public static int Fac (int n, int k) {
		int s = n- k,c = 1, r=1,m=0,h=1;
		while(m<k) {
			h = m*h;
			for(int i =0; i<n;i++) {
				r = r*i;
			}
			for(int j = 0; j< s;s++) {
				c = c*j;
			}
			m++;
		}
		
		return r/h*c;
	}
	public static void main(String[] args) {

		System.out.println(Fac(4,5));
	}

}
