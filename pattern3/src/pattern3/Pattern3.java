
package pattern3;


public class Pattern3 {

    
    public static void main(String[] args) {
   int len=10;
     for(int r=1;r<=len;r++){
         for(int sp=1;sp<=len-r;sp++){
             System.out.print("  ");
         }
         for(int c=1;c<=r+r-1;c++){
             System.out.print("* ");         
         }
         System.out.println( );
     }
    }
    
}
