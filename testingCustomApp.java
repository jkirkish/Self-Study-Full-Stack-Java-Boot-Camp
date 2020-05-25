package com.coderscampus.arraylist;






public class testingCustomApp {

	public static void main(String[] args) {
		//Always program to an interface dealing with concrete class interface
		CustomList<Integer> elements = new CustomArrayList<>();
		
		for(int i = 1; i < 1200000; i++) {
			elements.add(i);
		}
		for(int i =0; i <elements.getSize(); i++)
		{
			
			System.out.println(elements.get(i));
		}

	}

}
