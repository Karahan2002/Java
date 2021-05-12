package yakup;

import java.util.ArrayList;
import java.util.Random;

public class ArrayUtility{
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(10);
		numList.add(7);
		numList.add(8);
		numList.add(8);
		numList.add(3);
		numList.add(4);
		numList.add(8);
		
		printList(numList);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		double sum = sumList(doubleList);
		System.out.println(sum);
		System.out.println(Math.round(sum));
		
		ArrayList<Integer> list = getList(25);
		System.out.println(list.toString());
		
		ArrayList<Integer> rList = getRandomList(20);
		System.out.println(rList.toString());
		
		ArrayList<String> strnums = new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		
		ArrayList<Integer> converted = convertToIntList(strnums);
		System.out.println(converted);
		
	}
	public static void printList(ArrayList<Integer> num) {
		for(Integer n : num) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	public static double sumList(ArrayList<Double> dlist) {
		double sum = 0;
		for(Double d : dlist) {
			sum = sum+d;
		}
		return sum;
	}
	public static ArrayList<Integer> getList(int size){
		ArrayList<Integer> newList = new ArrayList<>();
		for(int i=1;i<=size;i++) {
			newList.add(i);
		}
		return newList;
	}
	public static ArrayList<Integer> getRandomList(int size){
		Random random = new Random();
		ArrayList<Integer> randomNums = new ArrayList<>();
		for(int i=0;i<=size;i++) {
			randomNums.add(random.nextInt(101));
		}
		return randomNums;
	}
	public static ArrayList<Integer> convertToIntList(ArrayList<String> strList){
		ArrayList<Integer> newList = new ArrayList<>();
		for(String str : strList) {
			newList.add(Integer.parseInt(str));
		}
		return newList;
	}
}
