
package app.main;
import oficina.Oficina;
import ui.Comando;


public class Menu  extends ui.Menu{
    public Menu(Oficina ofi){
        super(Label.MENU_PRINCIPAL,new Comando<?>[]{
            new DoCliente (ofi, Label.DOCLIENTE,ofi),
            new DoCarro(ofi, Label.DOCARRO),
            new DoListarCliente(ofi, Label.listarCliente),
            new DoListarCarro(ofi, Label.DOABRIRSTOCK),
            new DoFatura(ofi,Label.DOFATURA)
        });
    }
}
