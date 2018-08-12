package chapter1;

public class Unit9_Break_continue {
	
	public static void main(String []  args) {
		
		for(int i = 0; i <=15; i++) {
			if(i%2==0) {
				continue; // this operator left all body cicle and go up for next i iteration
			}
			System.out.println("This is noncountable number:"+ i);
		}
		int imp = 0;
		while(true) {
			if(imp > 20) {
				break;
			}
			System.out.println("This is imp and working "+imp);
			imp++;
			
		}
	}

}
