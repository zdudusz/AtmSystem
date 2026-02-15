package Main;
import Atm.Config;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean acessoAoMenu = false;
    Config user = null;
    System.out.println("Bem vindo ao sistema ATM 24h! \n Você tem alguma conta? \n 1-SIM \n 2-NAO");
    String temConta = sc.next();
    boolean verifier = false;
    if(temConta.equals("1")) {
        sc.nextLine();
        System.out.println("INSIRA SEU LOGIN: ");
        String login = sc.nextLine();
        System.out.print("Insira sua senha: ");
        String senha = sc.next();
         if(verifier = Config.verificarAcesso(login,senha)){
             user = new Config(login,senha);
         acessoAoMenu = true;}
         else{
             System.out.print("CONTA NAO EXISTE! ");
         }
    }
    else if(temConta.equals("2")){
        System.out.println("Deseja criar uma conta? \n 1-SIM \n 2-NAO");
        sc.nextLine();
        String flag = sc.next();
        if(flag.equals("1")){
            sc.nextLine();
            System.out.println("INSIRA SEU LOGIN: ");
            String _login = sc.nextLine();
            System.out.println("Insira sua senha: ");
            String _senha = sc.next();
            System.out.print("Valor de deposito incial: ");
            double saldoInicial = sc.nextDouble();
             user = new Config(_login,_senha,saldoInicial);
            acessoAoMenu = true;
        } else if (flag.equals("2")) {
            System.out.print("SISTEMA FINALIZADO...");
        }
    }
    if(acessoAoMenu == true){
        while(true) {
            System.out.println("|MENU DA CONTA| \n 1-USER INFO \n 2-SACAR \n 3-DEPOSITAR \n QUALQUER OUTRA OPÇAO-SAIR");
            String flagMenu = sc.next();
            if (flagMenu.equals("1")) {
                System.out.println(user.toString()+ "\n  DIGITE ALGO PARA CONTINUAR");
                String a = sc.next();


            } else if (flagMenu.equals("2")) {
                System.out.println("Quanto você quer sacar: ");
                double valorSacado = sc.nextDouble();
                if (valorSacado > user.getSaldo()) {
                    System.out.print("Saldo insuficiente");
                }
                user.sacarSaldo(valorSacado);
            } else if (flagMenu.equals("3")) {
                System.out.println("VALOR DEPOSITADO: ");
                double valorDepositado = sc.nextDouble();
                user.depositarSaldo(valorDepositado);
            }
            else{
                break;
            }
        }
    }
}
}
