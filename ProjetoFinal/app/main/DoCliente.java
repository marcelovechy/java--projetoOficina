package app.main;
import oficina.Oficina;
import ui.Comando;
import ui.Constantes;
import ui.LerString;
import ui.exceptions.DialogException;

public class DoCliente extends Comando<Oficina>{
    private LerString nif;
    private LerString nome;


    public DoCliente(Oficina receptor,String titulo, Object Constantes) {
        
        super(receptor,titulo);
        this.nif=new LerString(Label.pedirNIFCliente, null);
        this.nome=new LerString(Label.pedirNomeCliente, null);


    }


    @Override
    public void executar() throws DialogException {
        this.ui.lerInput(this.nif);
        this.ui.lerInput(this.nome);
        this.getReceptor().criarCliente(this.nif.getValor(), this.nome.getValor());
    }
    
}
