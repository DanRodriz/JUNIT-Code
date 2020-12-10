/**
* Counts positive elements in array
*
* @param x array to search
* @return number of positive elements in x
* @throws NullPointerException if x is null
*/

public class countPositive{

	public static int countPositive (int[] x){

		int count = 0;
		for (int i=0; i < x.length; i++){
			if (x[i] >= 0){
				count++;
			}
		}
		return count;
	}


	public static void main (String []argv){ 

		int[] inArr = new int [argv.length];
		if (argv.length == 0){
			System.out.println ("usage: java countPositive n1 n2 n3...");
			return;
		}

		for (int i = 0; i< argv.length; i++){
			try{
				inArr [i] = Integer.parseInt (argv[i]);
			}catch (NumberFormatException e){
				System.out.println ("Introduce un entero");
				inArr [i] = 1;
			}
		}

		System.out.println ("Número de positivos: " + countPositive (inArr));
	}
}