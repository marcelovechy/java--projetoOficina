package oficina;


public class FaturaCliente {
    //Atributo
    private double preco;

    // getters e setters


    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public FaturaCliente(double preco) {
        this.preco = preco;
    }

    
}
