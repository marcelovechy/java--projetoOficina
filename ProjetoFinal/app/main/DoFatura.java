package app.main;

import oficina.Oficina;
import ui.Comando;
import ui.exceptions.DialogException;
import ui.LerString;


public class DoFatura extends Comando<Oficina> {
    LerString matricula;

    public DoFatura(Oficina receptor, String titulo) 
    {
        super(receptor, titulo);
        this.matricula = new LerString(Label.PedirIdCarro, null);

    }
    @Override
    public void executar() throws DialogException
    {
        this.ui.lerInput(this.matricula);
        if (this.getReceptor().GeraFatura(this.matricula.getValor())) {
            this.ui.escreveLinha(Label.FaturaGeradaComSucesso(this.matricula.getValor()));

        } 
        else 
        {
            this.ui.escreveLinha(Label.FaturaNaoGerada(this.matricula.getValor()));
        }
    }

}
