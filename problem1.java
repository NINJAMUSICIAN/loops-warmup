

public class problem1{

	public int starter;
	public static int total;

	public static void main(String[] args) {
		
		int a = addition(10);
		System.out.println("addition thing = " + a);
		int b = toThePower(5, 5);
		System.out.println("exponent thing = " + b);
		int x = multiplication(6);
		System.out.println("factoral thing = " + x);
	}

	

	public static int addition(int x){

		int temp = x;

		while(temp > 0){
			total += temp;
			temp--;
		}
		int yer = total;
		
		return total;

	}
								//x = beginning number n = exponent
	public static int toThePower(int x, int n){
//adifjaoidoijgaiaghiujgjaghitjaiujfiojasjfapodfa;giojgfiojgijogfijofgdjiol
		int temp = x;
		int exponent = n;

		for(int i = 0; i < exponent - 1; i++){

			total = temp * x;
			temp = total;

		}

		return total;

	}

	public static int multiplication(int x){

			int temp = 1;

			for(int i = x; i > 0; i--){

				temp = temp * i;
			}

				return temp;
		}
	
	}