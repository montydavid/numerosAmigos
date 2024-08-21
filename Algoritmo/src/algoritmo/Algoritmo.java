
package algoritmo;


public class Algoritmo {

    
    public static void main(String[] args) {
        
        long inicioEjecucion = System.nanoTime();
        int valor1 = 66928;
        int valor2 = 66992;
        double division = 0;
        int suma =0;
        for(int i=1; i<=valor1/2;i++){
            division = valor1%i;
            if(division ==0){
                suma+=i;
            }
        }
        if(suma == valor2){
            suma = 0;
            for(int i=1; i<=valor2/2;i++){
            division = valor2%i;
            if(division ==0){
                suma+=i;
            }
            }
            if(suma==valor1){
            System.out.println("los valores son amigos");
        }
        }else{
            System.out.println("los numeros no son amigos");
        }
        long finEjecucion = System.nanoTime();
        System.out.println(finEjecucion - inicioEjecucion);
        
    }
    
}
