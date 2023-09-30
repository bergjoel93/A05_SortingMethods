package a05;

import java.util.Random;
/**
 * Is an array that has elements consisting of two attributes: a keyID, and a number.
 * 
 */
public class ObjectArray implements Comparable<ObjectArray>{
	
	int keyID;
	int number;
	private static int keyIDCounter = 0;
	
	
	/**
	 * Constructor
	 * @param keyID
	 * @param randomNumber
	 */
	public ObjectArray(int number) {
		this.number = number;
		this.keyID = keyIDCounter++;
	}
	/**
	 * returns keyID
	 * @return
	 */
	public int getKeyID() {
		return keyID;
	}
	
	public int getNumber() {
		return number;
	}
	
	public static ObjectArray[] createArray(int[] values) {
		ObjectArray[] objectArray = new ObjectArray[values.length];
		for(int i = 0; i < values.length; i++) {
			objectArray[i] = new ObjectArray(values[i]);
		}
		return objectArray;
	}
	
	public static ObjectArray[] generateRandomArray(int size) {
        ObjectArray[] objectArray = new ObjectArray[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(101); // Generates a random number between 0 and 100
            objectArray[i] = new ObjectArray(randomNumber);
        }

        return objectArray;
    }
	
	 @Override
	    public int compareTo(ObjectArray other) {
	        return Integer.compare(this.number, other.number);
	    }

	@Override
	public String toString() {
		return "ObjectArray [keyID=" + keyID + ", number=" + number + "]";
	}

}
