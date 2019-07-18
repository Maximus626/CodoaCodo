package Ejemplos_Varios;

public class For_Each {

    public static void main(String[] args) {

        String a[] = {"Buenos Aires", "Santa Fé", "Córdoba", "Mendoza", "Jujuy", "Chubut"};
        System.out.println("Recorrer forma normal");
        System.out.println("=====================");

        for (int x = 0; x < a.length; x++) {

            System.out.println(a[x]);

        }

        System.out.println("");
        System.out.println("Recorrer con formato For Each");
        System.out.println("=============================");

        for (String elemento : a) {

            System.out.println(elemento);

        }

    }

}




