package PROGRAMAS_3PARCIAL;
import java.util.Scanner;
public class ARREGLOS {

    public static void main(String[] args) {
        System.out.println("Ingresa los numeros enteros uno a uno");    
        Scanner lec = new Scanner(System.in);
        int [] arreglo = new int [20];
        
        arreglo[0]=lec.nextInt();
        arreglo[1]=lec.nextInt();
        arreglo[2]=lec.nextInt();
        arreglo[3]=lec.nextInt();
        arreglo[4]=lec.nextInt();
        arreglo[5]=lec.nextInt();
        arreglo[6]=lec.nextInt();
        arreglo[7]=lec.nextInt();
        arreglo[8]=lec.nextInt();
        arreglo[9]=lec.nextInt();
        arreglo[10]=lec.nextInt();
        arreglo[11]=lec.nextInt();
        arreglo[12]=lec.nextInt();
        arreglo[13]=lec.nextInt();
        arreglo[14]=lec.nextInt();
        arreglo[15]=lec.nextInt();
        arreglo[16]=lec.nextInt();
        arreglo[17]=lec.nextInt();
        arreglo[18]=lec.nextInt();
        arreglo[19]=lec.nextInt();
        System.out.print("El arreglo es: ");
        for(int i=0;i<arreglo.length;i++){
        System.out.print(arreglo[i]+" ");
        }
                        
    }
    
}
