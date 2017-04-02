import java.io.*;
class TestClass{
	final static String ESC = "\033[";
	public static boolean contains(int array[], int value){
		for(int i = 0; i < array.length; i++){
			if(array[i] == value) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Object obj = new Object();
		int hashCode1 = obj.hashCode();
		int hashCode2[] = new int[1000000];
		int collisionCounter = 0;
		while(!contains(hashCode2, hashCode1)){
			hashCode2[collisionCounter] = hashCode1;
			obj = new Object();
			hashCode1 = obj.hashCode();
			System.out.println("Current hash:" + hashCode2[collisionCounter]);
			//System.out.print(ESC + "2J");
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			collisionCounter++;
			//try{Thread.sleep(50);}catch(InterruptedException e) {System.out.println(e);}
		}
		System.out.println("Collision at: " + hashCode2[collisionCounter-1] + " hash\nAt " + collisionCounter + "th step.");
	}
}