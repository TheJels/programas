package PROGRAMAS_3PARCIAL;

import java.util.Random;
import java.util.Scanner;

public class Random_Burbuja {
    public static void main(String[] args) {
           int ta;
           Scanner lec = new Scanner(System.in);
           Random random = new Random();
           Random_Burbuja ORD = new Random_Burbuja();
           System.out.print("Ingresa el tamaño del arreglo: ");
           ta=lec.nextInt();
           int [] ARRE = new int[ta];
           for(int i =0;i < ta;i++){
           ARRE[i]= random.nextInt(100);
           
           }
           System.out.println("El Arreglo generado es: ");
        for (int i = 0; i < ARRE.length; i++) {
            System.out.print(ARRE[i] + " ");
        }
           ORD.OrdenamientoBurbuja(ARRE);   
            System.out.println(" ");
            System.out.println("Los números ordenados son:");
        for (int i = 0; i < ARRE.length; i++) {
            System.out.print(ARRE[i] + " ");
        }
    }
    public void OrdenamientoBurbuja(int[] Arreglo_B){
        int tamaño = Arreglo_B.length;
        for (int i=0;i<tamaño-1;i++){
            for( int j=0;j<tamaño-i-1;j++){
            if(Arreglo_B[j]>Arreglo_B[j+1]){
                int aux = Arreglo_B[j];
                Arreglo_B[j]=Arreglo_B[j+1];
                Arreglo_B[j+1]=aux;
            }
            }
        }
  }
}

