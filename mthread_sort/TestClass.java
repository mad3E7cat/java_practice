import java.util.Arrays;
import java.lang.Object;
class SortThread implements Runnable{
	public int[] arr;
	SortThread(int[] arr1){	
		Thread t = new Thread(this, "Child_thread");
		//arr = arr1.clone(); // copy array
		t.start();
	}
	public void run(){
		Arrays.sort(arr);
	}
	public int[] newArray(){
		return arr;
	}
}
//
class TestClass{
	static int[] array;
	static int[] arr1;
	static int[] arr2;
	static{
		array = new int[10000];
		for(int i = 0; i < 10000; i++){
			array[ i ] = (int)(Math.random()*2000);
		}
		arr1 = new int[5000];
		arr2 = new int[5000];
		for(int i = 0; i < 5000; i++){
			arr1[ i ] = array[ i ];
		}
		for(int i = 0; i < 5000; i++){
			arr2[ i ] = array[ i ];
		}
	}
	static int mthread(){ // multy - launches the 2-3-4... threads for sorting with quick sort, returns time of working
		SortThread st1 = new SortThread(arr1);
		arr1 = st1.newArray();
		SortThread st2 = new SortThread(arr2);
		arr2 = st2.newArray();
		return 1;
	} 
	static int sthread(){ // single - launches just quick sort of array, returns time of working
		Arrays.sort(array);
		return 1;
	}
	public static void main(String[] args) {
		// for (int i = 0; i < 10000; i++ ){
		// 	System.out.println(array[ i ] + " ");
		// }
		mthread();
		for (int i: arr1) {
			System.out.print(i + " ");
		}
		for(int i: arr2){
			System.out.print(i + " ");
		}
		/////////////////////////////////// single thread is working OK
		// sthread();
		// for(int i: array){
		// 	System.out.print(i + " ");
		// }

	}
}
