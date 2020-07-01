package browser;

public class Whileloop_learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=6) {   //outer-loop
			for(int j=1;j<=5;j++) {  //inner-loop
				System.out.println("i= "+i+":j= "+j);
			}
			i++;
		}
	}

}
