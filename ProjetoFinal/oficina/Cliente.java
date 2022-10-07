package oficina;

public class Cliente {
    private String nif;
    private String nome;

    // Metodos

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente(String nextCliente, String nif, String nome) {
        this.nif = nif;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nif: "+ this.nif + " | Nome: "+ this.nome;
    }

}
