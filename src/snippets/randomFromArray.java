package snippets;

import java.util.Random;

public class randomFromArray {

	public static void main(String[] args) {	
		int[] list = new int[] {1,2,3,4,5,6};		
		int result  = getRandom(list);		
		System.out.println(result);		
		
		String[] listString = new String[] {"GB","FR","GR","IT"};
		String resultString  = getRandom(listString);
		System.out.println(resultString);		
		}


		public static int getRandom(int[] array) {
		    int rnd = new Random().nextInt(array.length);
		    return array[rnd];
		}
		
		public static String getRandom(String[] array) {
		    int rnd = new Random().nextInt(array.length);
		    return array[rnd];
		}
}

