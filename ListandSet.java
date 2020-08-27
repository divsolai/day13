package java30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ListandSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Welcome to the java world";
		String input1 = input.replaceAll(" ", "");
		char[] charArray = input1.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < input1.length(); i++) {
			list.add(charArray[i]);
		}
		System.out.println(list);
		List<Object> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println("The unique characters in the given input string is " + collect);
		HashSet<Integer> hs = new HashSet<Integer>();
		int size = input1.length();
		for (int i = 0; i < size; i++) {
			int indexOf = input1.indexOf(input1.substring(i, size-1));
			hs.add(indexOf);
		}
		System.out.println(hs);

	}
}
