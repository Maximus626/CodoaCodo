
package Ejercicio_Clases_03092019_Agregacion_Composicion;

public class TestConcesionario {

    public static void main(String[] args) {
        
      Gerente matias = new Gerente("posobon matias");
      Vendedores nicol = new Vendedores("nicol sanchez");
      Vendedores pepe = new Vendedores("pepe");
      
      Concesionaria concesionaria = new Concesionaria("POSOBON",matias);
      concesionaria.addvendedores(nicol);
      concesionaria.addvendedores(pepe);
      
      concesionaria.addcar(new Carro("POSOBON"));
      concesionaria.addcar(new Carro("GMC"));
      concesionaria.addcar(new Carro("DODGE"));
        concesionaria.imprimirconc();
    }
    
}
