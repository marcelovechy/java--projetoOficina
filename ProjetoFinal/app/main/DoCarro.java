package app.main;
import org.w3c.dom.DOMException;
import oficina.Oficina;
import ui.Comando;
import ui.LerString;


public class DoCarro extends Comando<Oficina>{

    private LerString matricula;
    private LerString marca;
    private LerString modelo;
    private LerString avaria;
    
   
    

    public DoCarro(Oficina receptor, String titulo) {
    super(receptor,titulo);
        this.matricula=new LerString(Label.pedirMatricula, null);
        this.marca=new LerString(Label.pedirMarca, null);
        this.modelo=new LerString(Label.pedirModelo, null);
        this.avaria=new LerString(Label.pedirAvaria, null);

    }




    @Override
    public void executar() throws DOMException {
        //Carregar a variavel com o input dado pelo usuario

        this.ui.lerInput(this.matricula);
        this.ui.lerInput(this.marca);
        this.ui.lerInput(this.modelo);
        this.ui.lerInput(this.avaria);

        //escrevendo o que o usuário colocou
        this.getReceptor().criarCarro(this.matricula.getValor(),this.marca.getValor(), this.modelo.getValor(), this.avaria.getValor());
        
    }
    
}
