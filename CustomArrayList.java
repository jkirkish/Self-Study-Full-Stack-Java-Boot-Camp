package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 10; 
	@Override
	public boolean add(T item) {
		if(size == items.length) {
			items = increaseSize();
		}
		items[size] = item;
		size++;
		return true;
	}

	/**
	 * @return 
	 * 
	 */
	private Object[] increaseSize() 
	{
		Object[] newArray = new Object[size*2];
		for(int i=0; i<size; i++) {
			newArray[i] = items[i];
		}
		return newArray;
	}

	@Override
	public int getSize() {
		
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException{
		/*you can cast (T) to represent the datatype you want to put into the index. (Generic type for 
		 * what ever it is. It can be any Object.You add a SuppressWarnings when casting if needed. 
		 */
		if(index >= size)throw new IndexOutOfBoundsException("Please get back into Bounds!!");
		return (T) items[index];
		
	}
	
}
