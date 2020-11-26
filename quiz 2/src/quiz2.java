
public class quiz2 {

	public static void main(String[] args) {
		
		// 1.
		System.out.println("1.");
		int max = 5;
		for (int n = 1; n <= max; n++) {
		    System.out.println(n);
		}
		System.out.println();

		int n=1;
		while(n<=max) {		
				System.out.println(n);
				n++;
			}System.out.println();
		
		
	    //2.
		System.out.println("2.");
		int total = 25;
		for (int number = 1; number <= (total / 2); number++) {
		    total = total - number;
		    System.out.println(total + " " + number);
		}
		System.out.println();
		
		int totals = 25;
		int number = 1;
		while(number<= totals / 2) {
			 totals = totals - number;
				 System.out.println(totals + " " + number);
				 number++;
			}
		System.out.println();
		
		
		//3.
		System.out.println("3.");
		for (int i = 1; i <= 2; i++) {
		    for (int j = 1; j <= 3; j++) {
		        for (int k = 1; k <= 4; k++) {
		            System.out.print("*");
		        }
		        System.out.print("!");
		    }
		    System.out.println();
		}
		System.out.println();
		
		int i =1;
		while(i<=2) {		
			int j =1;
			while(j<=3) {
				int k =1;
				while(k<=4) {
					System.out.print("*");
					k++;
				}
				System.out.print("!");
				j++;
			}
			System.out.println();
		    i++;
		}
		System.out.println();
		
		
		// 4.
		System.out.println("4.");
		int numbers = 4;
		for (int count = 1; count <= numbers; count++) {
		    System.out.println(numbers);
		    numbers = numbers / 2;
		}
		System.out.println();
		
		int numberss = 4;
		int count= 1;
		while(count<=numberss) {	
				System.out.println(numberss);
				numberss = numberss / 2;
				count++;
				
		}

	}

}
