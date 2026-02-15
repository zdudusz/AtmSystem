package Atm;

public class Config {
    private double saldo;
    private String nome;
    private String senha;
    public boolean verificador = false;

    public Config(String _nome, String _senha,double saldoInicial){
        this.nome = _nome;
        this.senha = _senha;
        this.saldo = saldoInicial;
    }
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
    public String getNome(){
        return this.nome;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setNome(String _newName){
        this.nome = _newName;
    }
}
