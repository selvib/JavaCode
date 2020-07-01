package browser;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;//
		int j = i++;//At this position J's value is 10 coz j associate with i only.but i value is 11.i can't escape its increment
		System.out.println(j);
		int m = 100;
		int n = m--;//here m value become 99 and n value is 100
		System.out.println(m);
		int p = --m;//
		int l = n--;
		System.out.println(l);
		int z = p-- + --n;
		System.out.println(z);
		z= --p - ++n;
		
	}
}
