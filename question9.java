
public class question9 {

    public static void main(String[] args) {
        
        int product=1;
        int i,j;
        
        long count=0;
        for(i=1;i<250;i++){
               
            for(j=i;j<500;j++){
                
                if(i*i+j*j==(1000-i-j)*(1000-i-j)){
                
                product=i*j*(1000-i-j);
                  
                break;
                
            }
              count++;
            }
         count++; }
        
        System.out.println(product);
      
        
    }

    
}
