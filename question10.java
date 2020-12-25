
 
public class question10 {
    public static void main(String[] args) {
    
        long sum=2;
	int control=0;
        
	for (int i=3;i<=2000000;i=i+2){
		
             for(int j=3;j<=i;j=j+2){
      	
                if(i%j==0&&j<i){break;}//if number can be diveded by smaller number than itself
                    
             control=j;//if number is same itself	 
      	
             }
      
        if(i==control){
            
            sum=sum+i;//sum of prime numbers
            
        }
        
        }
	
        System.out.println(sum);


    }
}

