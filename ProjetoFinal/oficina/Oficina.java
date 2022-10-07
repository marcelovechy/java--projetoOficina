package oficina;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import oficina.Cliente;
import oficina.Carro;

public class Oficina {
    private HashMap<String, Carro> carros;
    private HashMap<String,Cliente> clientes;
    private String nextCliente;
    private String nextCarro;

    public Oficina(){
        this.carros = new HashMap<>();
        this.clientes=new HashMap<>();
    }

    //CRIANDO NOVO CARRO
    public boolean criarCarro(String matricula, String marca, String modelo, String avaria){
        this.carros.put(this.nextCarro, new Carro (this.nextCarro, matricula, marca, modelo, avaria));
        return true;

    }
    //LISTANDO CARROS
    
    public ArrayList<Carro> listarCarros(){
        ArrayList<Carro> lista = new ArrayList<>(this.carros.values());
        return lista;
    }

    //CRIANDO NOVO CLIENTE

    public void criarCliente(String nif,String nome){
        this.clientes.put(this.nextCliente, new Cliente(this.nextCliente,nif, nome));
        
    }

    //LISTANDO CLIENTES
    public ArrayList<Cliente> listarCliente(){
        ArrayList<Cliente> lista = new ArrayList<>(this.clientes.values());
        return lista;
    }

    //Gerando a fatura com os dados do clente e do carro

    public boolean GeraFatura (String matricula){

        if (this.carros.containsKey(matricula)) {
            this.carros.remove(matricula);
            return true;
            
        }
        return false;
    }

}
