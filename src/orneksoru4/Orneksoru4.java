
package orneksoru4;
import java.util.Scanner;

public class Orneksoru4 {
    public static void main(String[] args) {
       Scanner klavye=new Scanner (System.in);
      int TM=0 ;
       System.out.print("Maas Giriniz:");
       int Maas = klavye.nextInt();
       for (int s =1 ;s<36;s++){
           TM=TM+Maas;
           System.out.println(s+" kişinin maaş toplamı : "+TM);
       }
             
    }
    
}
