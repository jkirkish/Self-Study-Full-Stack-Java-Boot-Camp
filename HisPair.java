package testingBankAcconts;

/*
 * K, V. are generics you can put in the class. Can represent key and value. 
 * Generics can be any letter or multi character placeholders
 */
		

public class HisPair<K, V>{
   	
	private Integer id;
	private	K key;
 	private V value;
 	
 	public HisPair(K key, V value) {
 		 
 		this.key = key;
 		this.value = value;
 	}
    /**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(K key) {
		key = key;
	}
	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}
	
}
