package app;

import oficina.Carro;
import oficina.Oficina;

public class App {
    public static void main(String[] args) {
        Oficina ofi=new Oficina();

 //chamando Menu Principal
        app.main.Menu m=new app.main.Menu(ofi);
        m.open();
    
        
    }
}
