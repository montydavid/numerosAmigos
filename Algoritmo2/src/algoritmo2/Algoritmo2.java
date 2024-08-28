
package algoritmo2;

import java.util.Random;
public class Algoritmo2 {

    
    public static void main(String[] args) {
        int size = 10000;
        Random random = new Random();
        int [][] matriz = new int[size][size];
        long inicioEjecucion = System.currentTimeMillis();
        for(int i=0; i<size; i++){
           for(int k=0; k<size; k++){
               matriz[i][k] = random.nextInt(100);
           } 
        }
        long finEjecucion = System.currentTimeMillis();
        System.out.println(finEjecucion - inicioEjecucion);
    }
    
}
