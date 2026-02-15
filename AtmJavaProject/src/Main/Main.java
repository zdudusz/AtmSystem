package Main;
import Atm.Config;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Bem vindo ao sistema ATM 24h! \n Você tem alguma conta? \n 1-SIM \n 2-NAO");
    String temConta = sc.next();
    boolean verifier = false;
    if(temConta.equals("1")) {
        sc.nextLine();
        System.out.println("INSIRA SEU LOGIN: ");
        String login = sc.nextLine();
        System.out.print("Insira sua senha: ");
        String senha = sc.next();
         verifier = Config.verificarAcesso(login,senha);
    }
}
}
