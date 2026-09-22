
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       
       double num1 , num2 , soma;
       
        System.out.println("digita um número aí : ");
        num1 = scanner.nextDouble();
        System.out.println("Digita mais um namoralzinha; ");
        num2 = scanner.nextDouble();
        soma = num1 + num2;
        if (soma > 10){
            System.out.println("A soma é :"+ soma);
        }else{
            
        }
        
        
    }
}
