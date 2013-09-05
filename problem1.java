

public class problem1{

	public int starter;
	public static int total;

	public static void main(String[] args) {
		//getNumber();
		//addition(10);
		//toThePower(5, 5);
		multiplication(6);
	}

	

	public static void addition(int x){

		int temp = x;

		while(temp > 0){
			total += temp;
			temp--;
		}
		System.out.println(total);

	}
								//x = beginning number n = exponent
	public static void toThePower(int x, int n){

		int temp = x;
		int exponent = n;

		for(int i = 0; i < exponent - 1; i++){

			total = temp * x;
			temp = total;

		}

		System.out.println(total);

	}

	public static int multiplication(int x){

			int temp = 1;

			for(int i = x; i > 0; i--){

				temp = temp * i;
			}

				System.out.println(temp);

				return temp;
		}
	
	}