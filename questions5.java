
public class questions5{
    
    public static void main(String[] args) {
        int n=20;
        int[] array=new int[n];
        int i,j;
        int number=0;
        int count=0;
        int last=0;
        int repeat=1;
       
        
  /*firstly ,we find prime number to run fastly */
  
  
        for(i=2;i<=n;i++){
          last=0;  
        
          for(j=2;j<n;j++){     
                if(i%j==0){
                     last++;
                 }
            }
                
            if(last==1){
                repeat=repeat*i;
            }
        
        }
       
        
     /*secondly, we're just looking at multiples of prime numbers  */   
        for(i=repeat;i>=0;){
            count=0;
            for(j=1;j<=n;j++){
                if(i%j==0){
                    count++;
                }
                
            }
            if(count==n){  /*thırdly,when every number is divided, we quit loop*/
                number=i;
                break;
            }
        i=i+repeat;
        }
            
    
    System.out.print(number);   /* we show our number */
    
    
    
    
      
    
    }
    }

