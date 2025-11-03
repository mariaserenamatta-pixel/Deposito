
package deposito;
import java.util.Scanner;


public class Deposito {
    public static double leggiLitri(){      //metodo per leggere la quantità da input
        double Litri;
    try(Scanner scanner=new Scanner(System.in)){
        Litri=scanner.nextDouble();
    }
    return Litri;
    }
    
    public static void main(String[] args) {
    double Litri =leggiLitri();
    System.out.println("Litri attuali:"+Litri+"l");
        if(Litri<20){
    System.out.println("Deposito in riserva");
    }else
            if(Litri>200){
     System.out.println("Deposito traboccante, chiudere l'alimentazione");
    }else{
    System.out.println("Deposito carico");            
            }
    
    }
    
}
