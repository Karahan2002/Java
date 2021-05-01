package yakup;

public class MinMax{
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5};
		double[] y = {1.2,1.3,1.4,1.5,1.6};
		System.out.println(max(x));
		System.out.println(min(x));
		System.out.println(max(y));
		System.out.println(min(y));
	}
	public static int max(int[] array) {
		int max = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}
	public static double max(double[] array) {
		double max = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}
	public static int min(int[] array) {
		int min = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
	public static double min(double[] array) {
		double min = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
	
}
