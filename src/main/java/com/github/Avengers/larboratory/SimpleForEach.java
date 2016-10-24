package com.github.Avengers.larboratory;

import java.util.Iterator;

public class SimpleForEach implements Iterable<String>{

	private String[] str = {"tianlelu","why","write","this"};
	
	public Iterator<String> iterator() {		
		return new Iterator<String>(){
			private int index = 0;
			public boolean hasNext(){
				return index < str.length;
			}
			public String next() {
				return null;
			}
			public void remove() {				
			}
		};
	}
	
	public static void main(String[] args) {
		SimpleForEach simpleForEach = new SimpleForEach();
		for(String s: simpleForEach){
			System.out.println(s);
		}
	}
}

