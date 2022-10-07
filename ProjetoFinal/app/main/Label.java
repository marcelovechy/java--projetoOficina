package app.main;

public class Label {

    //MENU PRINCIPAL
    public static String MENU_PRINCIPAL= "Menu Oficina";
    public static String DOCLIENTE= "Inserir Cliente";
    public static String DOCARRO= "Inserir Carro";
    public static String DOABRIRSTOCK= "Mostrar Stock dos carros";
    public static String DOFATURA= "Gerar fatura";


    //CLIENTE
    public static String pedirNomeCliente= "Insira o nome: ";
    public static String pedirNIFCliente= "Insira o NIF: ";

    //CARRO

    public static String pedirMatricula= "Insira a matricula: ";
    public static String pedirMarca= "Insira a marca: ";
    public static String pedirModelo= "Insira o modelo: ";
    public static String pedirAvaria= "Insira a avaria: ";

    // Lista de carros

    public static String listarCarro= "Lista de carros na oficina: ";

    //Lista de Clientes

    public static String listarCliente="Lista de clientes";

    // Fatura Cliente

    public static String PedirIdCarro="Insira a matricula do Carro: ";
    public static String FaturaGeradaComSucesso= "Fatura gerada com sucesso!";
    public static String FaturaNaoGerada= "Carro não encontrado!";
    public static String FaturaGeradaComSucesso(String matricula) {
        return " Fatura gerada com sucesso na matricula: " + matricula;
        
    }
    public static String FaturaNaoGerada(String matricula) {
        return " Erro!! Este carro não está em nossa ofica ";
    }

        

}
