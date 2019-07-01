
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andre
 */
public class inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner teclado = new Scanner(System.in);
        Persona p = new Persona();
        int suma1 = 0;
        int suma2 = 0;
        int numH = 0;
        int numM = 0;
        int numMayores = 0;
        int numMenores = 0;
        double pPromedioH = 0;
        double pPromedioM = 0;
        System.out.println("Cordial saludo, a continuación se muestran los registros:\n");
        System.out.println("Edad\t nombre \tpeso \testatura \t\tsexo \tid");

        Persona ListaPersonas[] = p.Listapersonas();

        for (int i = 0; i < ListaPersonas.length; i++) {
            System.out.println(ListaPersonas[i].toString());
        }

        for (int i = 0; i < ListaPersonas.length; i++) {
            if (ListaPersonas[i].getSexo() == 'H') {
                suma1 = suma1 + ListaPersonas[i].getPeso();
                numH++;
            }
        }
        pPromedioH = suma1 / numH;

        System.out.println("\nEl promedio del peso de los hombres es: " + pPromedioH);

        for (int i = 0; i < ListaPersonas.length; i++) {
            if (ListaPersonas[i].getSexo() == 'M') {
                suma2 = suma2 + ListaPersonas[i].getPeso();
                numM++;
            }
        }
        pPromedioM = suma2 / numM;

        System.out.println("\nEl promedio del peso de las mujeres es: " + pPromedioM);

        System.out.println("\nEl número de mujeres es: " + numM);

        System.out.println("\nEl número de hombres es: " + numH);

        for (int i = 0; i < ListaPersonas.length; i++) {

            if (ListaPersonas[i].esMayor()) {

                numMayores++;

            } else {
                numMenores++;
            }

        }

        System.out.println("\nEl número de personas mayores de edad es: " + numMayores);

        System.out.println("\nEl número de personas menores de edad es: " + numMenores);

        System.out.println("\nLas personas que tienen un peso mayor a 85 kilos son: ");

        System.out.println("\nEdad\t nombre \tpeso \testatura \t\tsexo \tid");

        for (int i = 0; i < ListaPersonas.length; i++) {

            if (ListaPersonas[i].getPeso() > 85) {

                System.out.println(ListaPersonas[i].toString());

            }

        }

        System.out.println("*************************************************************************\n");
        //System.out.println("\n");
        System.out.println("A continuación se muestra el IMC de cada persona: \n");

        for (int i = 0; i < ListaPersonas.length; i++) {

            System.out.println("El IMC de " + ListaPersonas[i].getNombre() + "es " + ListaPersonas[i].calcularIMC(ListaPersonas[i].getPeso(), ListaPersonas[i].getAltura()));

            // System.out.println( ListaPersonas[i].calcularIMC(ListaPersonas[i].getPeso(), ListaPersonas[i].getAltura()));
        }

        ArrayList<Persona> pesoNormal = new ArrayList<Persona>();
        ArrayList<Persona> sobrepeso = new ArrayList<Persona>();
        ArrayList<Persona> pesoBajo = new ArrayList<Persona>();
        ArrayList<Persona> auxiliar = new ArrayList<Persona>();

        for (int i = 0; i < ListaPersonas.length; i++) {

            if (ListaPersonas[i].getImc() > 16 && ListaPersonas[i].getImc() <= 18.4) {
                pesoBajo.add(ListaPersonas[i]);

            } else if (ListaPersonas[i].getImc() > 18.5 && ListaPersonas[i].getImc() <= 24.9) {

                pesoNormal.add(ListaPersonas[i]);

            } else if (ListaPersonas[i].getImc() >= 25) {

                sobrepeso.add(ListaPersonas[i]);

            }

        }
        ordenarLista(pesoBajo);
        ordenarLista(pesoNormal);
        ordenarLista(sobrepeso);

        System.out.println("\nLas personas que tienen un IMC por debajo de lo normal son: \n");
        System.out.println("Edad\t nombre \tpeso \testatura \t\tsexo \tid");

        for (int i = 0; i < pesoBajo.size(); i++) {

            System.out.println(pesoBajo.get(i));
        }

        System.out.println("\nLas personas que tienen un IMC ideal son: \n");
        System.out.println("Edad\t nombre \tpeso \testatura \t\tsexo \tid");
        for (int i = 0; i < pesoNormal.size(); i++) {

            System.out.println(pesoNormal.get(i));
        }

        System.out.println("\nLas personas que tienen un IMC por encima de lo normal son: \n");
        System.out.println("Edad\t nombre \tpeso \testatura \t\tsexo \tid");
        for (int i = 0; i < sobrepeso.size(); i++) {

            System.out.println(sobrepeso.get(i));
        }

    }

    public static void ordenarLista(ArrayList<Persona> list) {
        ArrayList<Persona> auxiliar = new ArrayList<Persona>();

        int j = list.size();
        for (int i = 1; i < j; i++) {
            for (int k = j - 1; k >= i; k--) {

                if (list.get(k).getNombre().compareTo(list.get(k - 1).getNombre()) < 0) {
                    auxiliar.add(list.get(k));
                    list.set(k, list.get(k - 1));
                    list.set(k - 1, auxiliar.get(0));
                    auxiliar.clear();

                }

            }

        }

    }

}
