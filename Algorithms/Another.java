

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Another {

  static int jj=1;

  public static void generatechange(Integer amount, LinkedList<Integer> denominations, HashMap<Integer,Integer> useddenominations) {
	  
    if(amount<0){
        return;
    }
    
    if(amount==0) {        
    	Iterator<Integer> it = useddenominations.keySet().iterator();
        while(it.hasNext()) {
        	Integer val = it.next();
            System.out.println(val +" :: "+useddenominations.get(val));
        }
        
        System.out.println("**************************************");

        return;
    }

    for(Integer denom : denominations) {
        if(amount - denom < 0){
            continue;
        }
        if(useddenominations.get(denom)== null){
            useddenominations.put(denom, 0);
        }
        useddenominations.put(denom, useddenominations.get(denom)+1);
        generatechange(amount-denom, denominations, useddenominations);
        useddenominations.put(denom, useddenominations.get(denom)-1);
    }
  }

  public static void main(String[] args) {
	  
    int amount = 15;
    int nikle=1;
    int dollar=5;
    int ddollar=10;

    LinkedList<Integer> denominations = new LinkedList<Integer>();

    denominations.add(ddollar);
    denominations.add(dollar);
    denominations.add(nikle);

    HashMap<Integer,Integer> usedDenominations = new HashMap<Integer,Integer>();
    
    generatechange(amount, denominations, usedDenominations);
  }
}

