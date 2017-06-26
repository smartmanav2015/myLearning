public class BitShiftTest {

    public static void main(String args[]) {
       
     int number = 8; //0000 1000
     System.out.println("Original number : " + number);
   
     //left shifting bytes with 1 position
     number = number<<1; //should be 16 i.e. 0001 0000

     //equivalent of multiplication of 2
     System.out.println("value of number after left shift: " + number);
   
     number = -8; // 1 0000 1000
     //right shifting bytes with sign 1 position
     number = number>>1; //should be 16 i.e. 0001 0000

   
     //equivalent of division of 2
     System.out.println("value of number after right shift with sign: " + number);
   
     number = -8; // 1000 1000   or 11000
     //right shifting bytes without sign 1 position
     number = number>>>1; //should be 16 i.e. 1100  0100   or

     //equivalent of division of 2
     System.out.println("value of number after right shift with sign: " + number);
   
    }  
      
}


//Read more: http://javarevisited.blogspot.com/2013/03/bitwise-and-bitshift-operators-in-java-and-or-xor-left-right-shift-example-tutorial.html#ixzz3Yt0Fb9yF