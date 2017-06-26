
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class change_generation {


  public static void generatechange(Integer amount, LinkedList<Integer> denominations, HashMap<Integer,Integer> usedDenominations) {
	  
	  System.out.println("amount : "+amount+", denominations : "+denominations+", usedDenominations : "+usedDenominations);
	  
    if(amount<0){
    	System.out.println("Amount is less than ZERO");
        return;
    }
    
    if(amount==0) {        
    	System.out.println("Amount is ZERO");
    	Iterator<Integer> it = usedDenominations.keySet().iterator();
        while(it.hasNext()) {
        	Integer val = it.next();
            System.out.println(val +" :: "+usedDenominations.get(val));
        }
        
        System.out.println("**************************************");

        return;
    }

    for(Integer denom : denominations) {
    	System.out.println("VALUE of AMOUNT : "+amount);
    	//System.out.println("denom : "+denom);
    	int leftAmount = amount - denom;
        if(leftAmount < 0){
            continue;
        }
        if(usedDenominations.get(denom)== null){
        	usedDenominations.put(denom, 0);
        }
        usedDenominations.put(denom, usedDenominations.get(denom)+1);
        generatechange(leftAmount, denominations, usedDenominations);
        usedDenominations.put(denom, usedDenominations.get(denom)-1);
    }
  }

  public static void main(String[] args) {
	  
    Integer amount = 7;
    LinkedList<Integer> denominations = new LinkedList<Integer>();

    denominations.add(1);
    denominations.add(5);
    denominations.add(10);

    HashMap<Integer,Integer> usedDenominations = new HashMap<Integer,Integer>();
    
    generatechange(amount, denominations, usedDenominations);
  }
}

