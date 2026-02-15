package Atm;

public class Config {
    private double saldo = 9999;
    private String nome;
    private String senha;
    public Config(String _nome, String _senha,double saldoInicial){
        this.nome = _nome;
        this.senha = _senha;
        this.saldo = saldoInicial;
    }
    public Config(String _nome, String _senha){
        this.nome = _nome;
        this.senha = _senha;
    }
    public Config(){
    }
    private boolean verificador = false;

    static String[] users = {
            "Owner",
            "BirdPerson",
            "Rick",
            "iLove",
            "Garry",
            "Jerry Smith",
            "Morty",
            "Admin",

    };
    static String[] passwords = {
            "1234",
            "Thamy",
            "Morty",
            "Coffe",
            "SpongeBob",
            "Beth",
            "Rick",
            "Admin",

    };
    public static boolean  verificarAcesso(String login,String senha){
        for(int i =0;i<users.length;i++){
             if(users[i].equals(login)&&passwords[i].equals(senha)){
                 return true;
             }
        }
        return false;
    }
    public String getNome(){
        return this.nome;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setNome(String _newName){
        this.nome = _newName;
    }
    public boolean getVerificador(){
        return this.verificador;
    }
    public void sacarSaldo(double saldoSacado){
        this.saldo -= saldoSacado;
    }
    public void depositarSaldo(double saldoDepositado){
        this.saldo += saldoDepositado;
    }
    public String toString() {
        return "  Saldo: "+ getSaldo()
                + "\n Nome do Titular: " + getNome();
    }
}
