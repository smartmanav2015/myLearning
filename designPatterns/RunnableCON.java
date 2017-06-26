
public class RunnableCON implements Runnable {
	

    
    @Override
    public void run(){
    	final NotificationTest test = new NotificationTest();
        test.go();
        System.out.println(Thread.currentThread() + " finished Execution");
    }


}
