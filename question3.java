
public class question3 {
        
        public static void main(String[] args) {
            
        int max=1;
        int i=2;
        double number=600851475143d;
         
        while(number!=1.0){/* we divide number to be one */
             
             if(number%i==0){
                number=number/i;
                max=i;
                i--;/* for repeat numbers */
             }
           
           
          i++;   
         }
            
            System.out.print(max);    
            
    }
}
