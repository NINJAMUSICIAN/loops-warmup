

public class problem1{

	public int starter;
	public static int total;

	public static void main(String[] args) {
		//getNumber();
		//addition(10);
		//toThePower(5, 5);
		int x = multiplication(6);
		System.out.println(x);
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
//adifjaoidoijgaiaghiujgjaghitjaiujfiojasjfapodfa;giojgfiojgijogfijofgdjiol
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

				return temp;
		}
	
	}