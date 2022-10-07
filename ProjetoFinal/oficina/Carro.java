package oficina;

import java.util.ArrayList;
import java.util.HashMap;

public class Carro {
    // Atributos
    private String matricula;
    private String marca;
    private String modelo;
    private String avaria;
    private Cliente dono;
    

    // getters e Setters

    public Cliente getDono() {
        return this.dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAvaria() {
        return this.avaria;
    }

    public void setAvaria(String avaria) {
        this.avaria = avaria;
    }


    public Carro(String nextCarro, String matricula, String marca, String modelo, String avaria) {

        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.avaria = avaria;

    }

    @Override
    public String toString() {
        return  " Matricula: " +this.matricula + " | Marca: "+ this.marca +" | Modelo: "+ this.modelo + " | Avaria: "+ this.avaria;
    }

}
