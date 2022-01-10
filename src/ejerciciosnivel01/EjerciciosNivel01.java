
package ejerciciosnivel01;

import java.util.Arrays;

/**
 *
 * @author David Cabrero
 */
public class EjerciciosNivel01 {
    
    public int[] maximos(int[] lista){
        int[] arrayMaximos = {lista[0], lista[0]};
        for (int i=0; i<lista.length; i++){
            if (lista[i] > arrayMaximos[0]){
                arrayMaximos[1] = arrayMaximos[0];
                arrayMaximos[0] = lista[i];
            }
            else if (lista[i] > arrayMaximos[1]){
                arrayMaximos[1] = lista[i];
            }
        }
        
        return arrayMaximos;
    }
    //Segundo ejercicio PALINDROMO
    //Para hacer este ejercicio necesito hacer primero una función que "limpie" el string para quitarle los acentos y los espacios en blanco.
    
    private String limpiaFrase(String frase){
        frase = frase.toLowerCase(); //Paso la frase a minúsculas.
        frase = frase.replace('á', 'a');
        frase = frase.replace('é', 'e');
        frase = frase.replace('í', 'i');
        frase = frase.replace('ó', 'o');
        frase = frase.replace('ú', 'u');
        //Quito los espacios en blanco
        frase = frase.replace(" ", "");
        
        return frase;
    }
    
    public boolean esPalindromo(String frase){
        frase = limpiaFrase(frase); //Quita acentos y espacios en blanco.
        
        int indiceIzquierdo = 0;
        int indiceDerecho = frase.length()-1;
        
        while (frase.charAt(indiceIzquierdo) == frase.charAt(indiceDerecho) && indiceIzquierdo <= indiceDerecho){
            indiceIzquierdo++;
            indiceDerecho--;
        }
        if (indiceIzquierdo > indiceDerecho){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        int[] numeros = {99,37,7,54,13};
        int[] numeros2 = {-1,100,8,84,103,100005,77};
        int[] numeros3 = {-10,-100,-8,-84,-103,-100005,-77};
        EjerciciosNivel01 e = new EjerciciosNivel01();
        System.out.println(Arrays.toString(e.maximos(numeros)));
        System.out.println(Arrays.toString(e.maximos(numeros2)));
        System.out.println(Arrays.toString(e.maximos(numeros3)));
        
        System.out.println(e.esPalindromo("Acaso hubo buhos acá"));
    }
    
}
