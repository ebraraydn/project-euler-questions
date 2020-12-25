
public class question4 {
        
        public static void main(String[] args) {
        
        
        int i,j;
        int largest=1;
        int number=1;
        
        
    /*I used exhaustive search algorithm in this question */   
    for(i=100;i<=999;i++){
        
        for(j=100;j<=999;j++){
            
            number=i*j;
            
            /*I do control every digits under 100000 */
            if(number<=99999&&(int)(number/10000)==number%10&&(int)(number/1000)%10==(int)(number%100)/10){
                
                if(number>largest){
                 
                    largest=number;/*and if ı find palindrome number */
                }
               
            }
            
            if(number>=100000&&(int)(number/100000)==number%10&&(int)(number/10000)%10==(int)(number%100)/10&&(int)(number/1000)%10==(int)(number/100)%10){
                
                if(number>largest){
                  
                  largest=number;/*the same thing */
                
                }
            
            }
            
            
            
        }
        
        
    }
        
        
            System.out.println(largest);     
        
        
        
    }
}
