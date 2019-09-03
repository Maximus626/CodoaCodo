
package Ejercicio_Clases_03092019_Agregacion_Composicion;

import java.util.ArrayList;

public class Concesionaria { // clase todo
    private final String compania;
    // una concesionaria tiene un gerente
    private final Gerente gerente; // cardinaidad 1 a 1
    // una concesionaria tiene muchos vendedores
    private final ArrayList<Vendedores> vendedor = new ArrayList<>();//cardinalidad de 1 a muchos
    //una concecionaria tiene muchos autos (carros)
    private final ArrayList<Carro> carros = new ArrayList<>();//carinalidad de 1 a muchos

    public Concesionaria(String compania, Gerente gerente) {
        this.compania = compania;
        this.gerente = gerente;
    }
    
    //Metodo para agregar autos
    public void addcar(Carro carro){//coloco mi refencia de autos
    carros.add(carro);
    
    }
    
    //agregar metodo para agregar vendedores
   
    public void addvendedores(Vendedores vendedores){// coloco mi refencia de vendedores
    vendedor.add(vendedores);
    
    }
    
    public void imprimirconc(){
        System.out.println(compania+"\t"+gerente.getNombre());
        for (Vendedores vendedores : vendedor) {
            System.out.println(vendedores.getNombre());   
        }
        
        for (Carro car : carros) {
            System.out.println(car.getMarca());
        }
    }
    
    
    
}
