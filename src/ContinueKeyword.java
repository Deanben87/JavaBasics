
public class ContinueKeyword {

	public static void main(String[] args) {
		
		//continue -skips current execution/iteration
		//when java executes continue->
		//go back to beginning of the loop,
		//will be skipped/ignored
	
		
		
		for(int i=1; i<=5; i++) {
			
			if(i==2) {
			continue;
			}
			System.out.print(i+" ");
			System.out.println("hello");
			System.out.println("We are goimg on break soon");
			
		}
//print number from 1 to 10 except number 5 and 7 
		
		for(int i=1; i<=10; i++) {
			
			if(i==5 || i==7) {
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
