package app.main;

import java.util.ArrayList;

import oficina.Cliente;
import oficina.Oficina;
import ui.Comando;
import ui.exceptions.DialogException;

public class DoListarCliente extends Comando<Oficina>{

    public DoListarCliente(Oficina receptor, String titulo) {
        super(receptor, titulo);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void executar() throws DialogException {
        ArrayList<Cliente> lista = this.getReceptor().listarCliente();
        this.ui.escreveLinha(Label.listarCarro);
        for (Cliente cliente : lista) {
            this.ui.escreveLinha(cliente.toString());
        }
        
    }
    
}
