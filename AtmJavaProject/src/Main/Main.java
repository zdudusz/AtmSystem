package Main;
import Atm.Config;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean acessoAoMenu = false;
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
         acessoAoMenu = true;
    }
    else if(temConta.equals("2")){
        System.out.println("Deseja criar uma conta? \n 1-SIM \n 2-NAO");
        sc.nextLine();
        String flag = sc.next();
        if(flag.equals("1")){
            sc.nextLine();
            System.out.println("INSIRA SEU LOGIN: ");
            String _login = sc.nextLine();
            System.out.print("Insira sua senha: ");
            String _senha = sc.next();
            System.out.print("Valor de deposito incial: ");
            double saldoInicial = sc.nextDouble();
            Config user = new Config(_login,_senha,saldoInicial);
            acessoAoMenu = true;
        } else if (flag.equals("2")) {
            System.out.print("SISTEMA FINALIZADO...");
        }
    }
    if(acessoAoMenu == true){
        System.out.print("|MENU DA CONTA| \n 1-USER INFO \n 2-SACAR \n 3- DEPOSITAR");

    }
}
}
