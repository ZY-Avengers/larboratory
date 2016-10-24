package com.github.Avengers.larboratory;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SimpleForEach implements Iterable<String> {

	private String[] str = {"tianlelu", "why", "write", "this"};

	public static void main(String[] args) {
		SimpleForEach strings = new SimpleForEach();

		strings.eachSimple(strings);
		strings.eachDemo();

	}

	private void eachSimple(SimpleForEach strings) {
		for (String s : strings)
			System.out.println(s);
	}

	private void eachDemo() {
		for (String s : new Demo())
			System.out.println(s);
	}

	public Iterator iterator() {
		return new Iterator() {
			private int index = 0;
			public boolean hasNext() {return index < str.length;}

			public String next() {return str[index++];}//不知道怎么写了

			public void remove() {str = new String[4];}
		};
	}

	class Demo implements Iterable<String> {

		private List elements = Arrays.asList("tianlelu", "why", "write", "this");

		public Iterator<String> iterator() {return elements.iterator();}
	}
}


