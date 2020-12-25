
public class question1{

    public static void main ( String [] args ){
        
        int i;
        int sum=0;
        
            for(i=0;i<1000;i++){
            
                if(i%3==0||i%5==0){/* i can  be divided by 3 or 5 */ 
                    
                    sum=sum+i; /*we sum */
                    
                }
            
            }
     
        System.out.println(sum);
        
        
    }
}