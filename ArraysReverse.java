package yakup;

import java.util.Arrays;

public class ArraysReverse{
	public static void main(String[] args) {
		int[] array = {10,20,30,40};
		System.out.println(Arrays.toString(array));
		int[] result = new int[array.length];
		
		for(int i=0, j=array.length-1;i<result.length;i++,j--) {
			result[i] = array[j];	
		}
		System.out.println(Arrays.toString(result));
	}
}
