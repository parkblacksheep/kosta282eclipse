package kr.co.kosta4;

class KeyValue<K, V>{
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

public class DoubleGenericTest {
	public static void main(String[] args) {
		KeyValue<String, Integer> kv1 =new KeyValue();
		kv1.setKey("참외");
		kv1.setValue(5000);
		String key1 =kv1.getKey();
		int value1 =kv1.getValue();
		System.out.println(key1+": "+value1);
		
		KeyValue<Integer,String> kv2 = new KeyValue();
		kv2.setKey(5000);
		kv2.setValue("원 입니다.");
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		
		System.out.println(key2+ value2);
	}
}
