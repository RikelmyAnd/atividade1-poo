package org.principal;

import org.model.Marca;
import org.model.Modelo;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Modelo modelo1 = new Modelo(1,"Ford RAM","luxo",new Date(),10);
        Modelo modelo2 = new Modelo();
        Marca marca = new Marca();

        marca.setId(1);
        marca.setNome("FORD");
        marca.setModelos(modelo1);
        System.out.println("Marca: ");
        System.out.println("id: " + marca.getId());
        System.out.println("nome: " + marca.getNome());
        System.out.println("modelo: " + marca.getModelos().getNome());
    }
}
