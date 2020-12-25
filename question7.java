
 
public class question7 {
            
        public static void main(String[] args) {
        
            int count=0;
            int control=0;
            int i,j;
            int primeNumber=0;
            
        for(i=2;i>0;i++){
               
               control=0;
               for(j=2;j<=i;j++){
                    
                    if(i%j==0){
                        
                     control++;
                    }
                    
                }
            
        if(control==1){
            
            count++;
                
            }
        if(count==10001){
            primeNumber=i;
            break;    
        }
        
    }
            
            System.out.println(primeNumber);      
                
                
    }
}
