package Atm;

public class Config {
    private double saldo;
    private String nome;
    private String senha;
    public Config(String _nome, String _senha,double saldoInicial){
        this.nome = _nome;
        this.senha = _senha;
        this.saldo = saldoInicial;
    }
    private boolean verificador = false;

    String[] users = {
            "Owner",
            "BirdPerson",
            "Rick",
            "iLove",
            "Garry",
            "Jerry Smith",
            "Morty",
            "Admin",
            this.nome
    };
    String[] passwords = {
            "1234",
            "Thamy",
            "Morty",
            "Coffe",
            "SpongeBob",
            "Beth",
            "Rick",
            "Admin",
            this.senha
    };
    public void  verificarAcesso(String login,String senha){
        for(int i =0;i<users.length;i++){
             if(users[i].equals(login)&&passwords[i].equals(senha)){
                 this.verificador = true;
                 break;
             }
        }
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
}
