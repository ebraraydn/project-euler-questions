
public class question2 {
    
    public static void main(String [] args ){
        
      int number=0;    
      int number2=1;
      double total=0; /* we sum of Fibonacci numbers which can be divided by two */
      
      while(number2<=4000000){/*until 4000000 */
            
            number=number+number2;      /*number is the first number of Fibonacci series */ 
            number2=number2+number;     /*number2 is the second number of Fibonacci series*/
            
                if(number%2==0){
                 total=total+number;    
                }
            
                if(number2%2==0){
                total=total+number2;    
                }
            
        }
        
        System.out.println(total);  
        
    }

    
}
