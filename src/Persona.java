
import java.util.ArrayList;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andre
 */
public class Persona {

    Persona arrayObjetos[] = new Persona[30];
    private int edad;
    private String nombre;
    private int peso;
    private double altura;
    private char sexo;
    private String id;
    private double imc;

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public Persona(int edad, String nombre, int peso, double altura, char sexo) {
        password pass = new password();
        this.id = "";
        for (int i = 0; i < 8; i++) {
            this.id = this.id + pass.generarPassword();
        }
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        if (sexo == 'H' && sexo == 'h') {
            this.sexo = '-';
        }
        this.sexo = sexo;
        this.id = id;
    }

    public Persona(int edad, String nombre, char sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Persona() {
        password pass = new password();
        this.id = "";
        for (int i = 0; i < 8; i++) {
            this.id = this.id + pass.generarPassword();
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'H' && sexo == 'h') {
            this.sexo = '-';
        }
        this.sexo = sexo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String calcularIMC(int peso, double altura) {

        double calculo = (peso / (altura * altura));
        String resultado = "";

        if (calculo > 16.0 && calculo <= 18.4) {
            String calculo1 = String.format("%.2f", calculo);
            resultado = calculo1 + ": por debajo de lo normal.";
            imc = calculo;
        }

        if (calculo > 18.5 && calculo <= 24.9) {
            String calculo1 = String.format("%.2f", calculo);
            resultado = calculo1 + ": en el rango normal y saludable.";
            imc = calculo;
        }

        if (calculo >= 25.0) {
            String calculo1 = String.format("%.2f", calculo);
            resultado = calculo1 + ": por encima de lo normal.";
            imc = calculo;
        }

        return resultado;

    }

    public boolean esMayor() {
        if (this.edad >= 18) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
//       if (sexo == 'm' || sexo == 'M') {
//            sexo = '-';
//        }

        return "" + edad + "\t" + nombre + "\t" + peso + "\t" + altura + "\t\t\t" + sexo + "\t" + id;
    }

    private void llenarLista() {
        this.arrayObjetos[0] = new Persona(18, "Diana       ", 90, 1.70, 'M');
        this.arrayObjetos[1] = new Persona(27, "Maria       ", 75, 1.60, 'M');
        this.arrayObjetos[2] = new Persona(15, "Camilo      ", 32, 1.40, 'H');
        this.arrayObjetos[3] = new Persona(32, "Daniel      ", 50, 1.60, 'H');
        this.arrayObjetos[4] = new Persona(28, "David       ", 45, 1.55, 'H');
        this.arrayObjetos[5] = new Persona(15, "Marcela     ", 62, 1.70, 'M');
        this.arrayObjetos[6] = new Persona(19, "Hugo        ", 78, 1.60, 'H');
        this.arrayObjetos[7] = new Persona(19, "Daniela     ", 80, 1.67, 'M');
        this.arrayObjetos[8] = new Persona(20, "Henry       ", 45, 1.55, 'H');
        this.arrayObjetos[9] = new Persona(18, "Cristiano   ", 62, 1.65, 'H');
        this.arrayObjetos[10] = new Persona(12, "Mario      ", 84, 1.90, 'H');
        this.arrayObjetos[11] = new Persona(13, "Catalina   ", 67, 1.65, 'M');
        this.arrayObjetos[12] = new Persona(22, "Oscar      ", 91, 1.80, 'H');
        this.arrayObjetos[13] = new Persona(19, "Enrique    ", 43, 1.50, 'H');
        this.arrayObjetos[14] = new Persona(25, "Mariana    ", 55, 1.65, 'M');
        this.arrayObjetos[15] = new Persona(29, "Matilda    ", 65, 1.70, 'H');
        this.arrayObjetos[16] = new Persona(45, "Michael    ", 75, 1.90, 'H');
        this.arrayObjetos[17] = new Persona(52, "Michel     ", 85, 1.75, 'M');
        this.arrayObjetos[18] = new Persona(50, "Sofia      ", 95, 1.85, 'M');
        this.arrayObjetos[19] = new Persona(16, "Fernanda   ", 105, 1.80, 'M');
        this.arrayObjetos[20] = new Persona(25, "Fernando   ", 125, 1.90, 'H');
        this.arrayObjetos[21] = new Persona(26, "Fabio      ", 78, 1.70, 'H');
        this.arrayObjetos[22] = new Persona(32, "Sandra     ", 75, 1.70, 'M');
        this.arrayObjetos[23] = new Persona(16, "Salomon    ", 76, 1.80, 'H');
        this.arrayObjetos[24] = new Persona(24, "Pedro      ", 71, 1.65, 'H');
        this.arrayObjetos[25] = new Persona(26, "Juan       ", 69, 1.72, 'H');
        this.arrayObjetos[26] = new Persona(30, "Magdalena  ", 73, 1.69, 'M');
        this.arrayObjetos[27] = new Persona(11, "Jose       ", 75, 1.72, 'H');
        this.arrayObjetos[28] = new Persona(24, "Emilia     ", 68, 1.68, 'M');
        this.arrayObjetos[29] = new Persona(20, "Marcela    ", 69, 1.69, 'M');
    }

    public Persona[] Listapersonas() {
        llenarLista();
        return this.arrayObjetos;
    }

}
