package no10;

abstract class PairMap{
	protected String keyArray[]; 
	protected String valueArray[]; 
	abstract String get(String key); 
	abstract void put(String key, String value);
	abstract String delete(String key);	
	abstract int length();
}
class Dictionary extends PairMap {
    private int cap;
    private int size;

    public Dictionary(int cap) {
        this.cap = cap;
        keyArray = new String[cap];
        valueArray = new String[cap];
        size = 0;
    }

    @Override
    String get(String key) {
        for (int i = 0; i < size; i++) {
            if (keyArray[i].equals(key)) {
                return valueArray[i];
            }
        }
        return null;
    }
    @Override
    void put(String key, String value) {
        for (int i = 0; i < size; i++) {
            if (keyArray[i].equals(key)) {
                valueArray[i] = value;
                return;
            }
        }
        keyArray[size] = key;
        valueArray[size] = value;
        size++;
    }
    @Override
    String delete(String key) {
        for (int i = 0; i < size; i++) {
            if (keyArray[i].equals(key)) {
                String deletedValue = valueArray[i];
                for (int j = i; j < size - 1; j++) {
                    keyArray[j] = keyArray[j + 1];
                    valueArray[j] = valueArray[j + 1];
                }
                keyArray[size - 1] = null;
                valueArray[size - 1] = null;
                size--;
                return deletedValue;
            }
        }
        return null;
    }

    @Override
    int length() {
        return size;
    }
}

public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Hwang", "JAVA");
		dic.put("Lee", "Python");
		dic.put("Lee", "C++");
		System.out.println("Value of Lee is " + dic.get("Lee"));
		System.out.println("Value of Hwang is " + dic.get("Hwang"));
		dic.delete("Hwang");
		System.out.println("Value of Hwang is " + dic.get("Hwang"));
	}
}
