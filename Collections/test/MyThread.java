package test;

public class MyThread extends Thread {

	
	public void run(){
	//	try{
			
			for(int i=0;i<5;i++){
				System.out.println(i);
			}
		throw new RuntimeException();
		/*}catch (Exception e){
			System.out.println("aakash");
			//e.printStackTrace();
		}*/
		
}
}