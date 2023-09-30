package a05;

import java.util.Random;

public class ObjectArray implements Comparable<ObjectArray>{
	
	int keyID;
	int randomNumber;
	
	/**
	 * Constructor
	 * @param keyID
	 * @param randomNumber
	 */
	public ObjectArray(int keyID, int randomNumber) {
		this.keyID = keyID;
		this.randomNumber = randomNumber;
		
	}
	
	public static ObjectArray[] generateObjects(int size) {
		Random rand = new Random();
		
		ObjectArray[] objects = new ObjectArray[size];
		
		for( int i = 0; i < size; i++) {
			int randomNumber = rand.nextInt(101); // generates the random number between 0 and 100
			
			objects[i] = new ObjectArray(i, randomNumber);
			
		}
		return objects;
	}
	 @Override
	    public int compareTo(ObjectArray other) {
	        return Integer.compare(this.randomNumber, other.randomNumber);
	    }

	@Override
	public String toString() {
		return "ObjectArray [keyID=" + keyID + ", randomNumber=" + randomNumber + "]";
	}

}
