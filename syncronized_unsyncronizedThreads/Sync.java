class CallMe{
	/*synchronized*/ void call(String msg){ // synchronized modifier is not hte only way to sync the method
		System.out.print("[" + msg);
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("]");
	}
}
class Caller implements Runnable{
	String msg;
	Thread t;
	CallMe target;
	Caller(CallMe trgt, String ms){
		target = trgt;
		msg = ms;
		t = new Thread(this);
		t.start();
	}
	public void run(){
		synchronized(target){ // another way to synchronize
			target.call(msg);
		}
	}
}
class Sync{
	public static void main(String[] args) {
		System.out.println("Unsynchronized example: ");
		CallMe target = new CallMe();
		Caller obj1 = new Caller(target, "Hello, ");
		//System.out.println(obj1);
		Caller obj2 = new Caller(target, "this is ");
		//System.out.println(obj2);
		Caller obj3 = new Caller(target, "SYNCHRO example.");
		//System.out.println(obj3);
		try{
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
}






















/*
class CallMe{
	public void callUnS(String msg){
		System.out.print("[" + msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("]");
	}
}
class CallMeSynch{
	public synchronized void callS(String msg){	
		System.out.print("[" + msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("]");
	}
}
class CallerUnS implements Runnable{
	private String msg;
	Thread t;
	private CallMe target;
	CallerUnS(CallMe trgt, String ms){
		msg = ms;
		target = trgt;
		t = new Thread(this);
		t.start();
	}
	public void run(){
		target.callUnS(msg);
	}
}
class CallerS implements Runnable{
	private String msg;
	Thread t;
	private CallMeSynch target;
	CallerS(CallMeSynch trgt, String ms){
		msg = ms;
		target = trgt;
		t = new Thread(this);
		t.start();
	}
	public void run(){
		target.callS(msg);
	}
}
class Sync{
	public static void main(String[] args) {
		System.out.println("Unsynchronized example: ");
		CallMe target1 = new CallMe();
		CallMeSynch target2 = new CallMeSynch();
		CallerUnS obj1 = new CallerUnS(target1, "Hello, ");
		CallerUnS obj2 = new CallerUnS(target1, "this is ");
		CallerUnS obj3 = new CallerUnS(target1, "SYNCHRO example.");
		try{
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("\nSynchronized example: ");
		CallerS obj4 = new CallerS(target2, "Hello, ");
		CallerS obj5 = new CallerS(target2, "this is ");
		CallerS obj6 = new CallerS(target2, "SYNCHRO example.");
		try{
			obj4.t.join();
			obj5.t.join();
			obj6.t.join();
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
}
*/