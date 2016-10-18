package com.hsbc.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionOperations {

	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> l = Arrays.asList(a);
		ArrayList<Integer> list = new ArrayList<Integer>(l);
		ArrayList<Integer> ulist = new ArrayList<Integer>();
		ulist.addAll(list);
		System.out.println(ulist);
		System.out.println(ulist.addAll(list));
		System.out.println(ulist.containsAll(list));
		System.out.println(ulist.removeAll(list));
		System.out.println(ulist.retainAll(list));

		int[] a1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<int[]> l1 = Arrays.asList(a1);
		ArrayList<int[]> list1 = new ArrayList<int[]>(l1);
		ArrayList<int[]> ulist1 = new ArrayList<int[]>();
		ulist1.addAll(list1);
		System.out.println(ulist1); // Prints the

		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++)
			nums.add(i);
		System.out.println("Original list " + nums);
		Iterator<Integer> numsIter = nums.iterator();
		while (numsIter.hasNext()) {
			numsIter.next(); // If this line is commented then it will throw
								// IllegalStateException numsIter.remove(); }
			System.out.println("List after removing all elements" + nums);

			double x = Double.parseDouble("1.0");
			int n = Integer.parseInt("1");
			System.out.println("x: " + x);
			System.out.println("n: " + n);

			Double[] temperatureArray = { 31.1, 30.0, 32.5, 34.9, 33.7, 27.8 };
			System.out.println("The original array is: "
					+ Arrays.toString(temperatureArray));
			List<Double> temperatureList = Arrays.asList(temperatureArray);
			temperatureList.set(0, 35.2);
			System.out.println("The modified array is: "
					+ Arrays.toString(temperatureArray));
			Double[] aArray = temperatureList
					.toArray(new Double[temperatureList.size() + 1]);
			aArray[6] = 12.0;
			System.out.println(Arrays.toString(aArray));

			
			Arrays.stream(IntStream.class.getMethods()) // source 
			 .map(method-> method.getName()) // intermediate op 
			 .distinct() //intermediate op 
			 .forEach(System.out::println); // terminal op
			IntStream.iterate(1, i -> i * 2)
				.limit(5)
				.forEach(System.out::println);
			
			 Arrays.stream( new String[]{"abc", "s", "ssss", "sdsdsdsd", "sd",""}) 
			 	.sorted((a, b)-> Integer.compare(a.length(), b.length()))
			 	.forEach(System.out::println);
			 
			 
			   byte[] bytes = { (byte) 0b10101100, (byte) 0b00101000 };
			    BitSet primes = BitSet.valueOf(bytes);
			    // {2, 3, 5, 7, 11, 13}
			    long[] longs = { 0x100010116L, 0x1L, 0x1L, 0L, 0x1L };
			    BitSet powersOfTwo = BitSet.valueOf(longs);
			    // {1, 2, 4, 8, 16, 32, 64, 128, 256}
			    primes.stream().collect(Collector.joining(", "));
		}
	}
}