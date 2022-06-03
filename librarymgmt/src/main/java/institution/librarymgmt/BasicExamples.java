package institution.librarymgmt;

public class BasicExamples {
	public void forloopexample(){
		int sum = 0;
		for(int i = 0; i <=10; i++) {
			sum = sum + i;
			System.out.println("I,sum" + i + "," + sum);
			
		}
			
	}
	
	public void whileloopexample(){
		int sum = 0;
		int i=1;
		while (i<=10) {
			sum = sum + i;
			System.out.println("I,sum" + i + "," + sum);
			i++;
			
		}
			
	}
	
}

