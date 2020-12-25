
public class question6 {
    public static void main(String[] args) {
        
        int difference=0;
        int sumSquare=0;
        int i,j;
        int squareSum=0;
        
        for(i=1;i<=100;i++){
            
            sumSquare=sumSquare+i;/* (1+2+3....100)*/
            squareSum=squareSum+i*i;/* 1^2+2^2+3^2........100^2 */
            
        }
        
        sumSquare=sumSquare*sumSquare;/*square*/
        
        difference=sumSquare-squareSum;/*difference */
        
            System.out.println(difference);
        
        
    }
}
