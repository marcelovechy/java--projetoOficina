package app.main;
import java.util.ArrayList;
import oficina.Carro;
import oficina.Oficina;
import ui.Comando;
import ui.exceptions.DialogException;

public class DoListarCarro extends Comando<Oficina>{
    

    public DoListarCarro(Oficina receptor, String titulo) {
        super(receptor, titulo);
        
    }



    @Override
    public void executar() throws DialogException {
        ArrayList<Carro> lista = this.getReceptor().listarCarros();
        this.ui.escreveLinha(Label.listarCarro);
        for (Carro carro : lista) {
            this.ui.escreveLinha(carro.toString());
            System.out.println("  ");
        }
        
        
    }
    
}
