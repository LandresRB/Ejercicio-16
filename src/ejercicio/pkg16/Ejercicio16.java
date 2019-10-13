
package ejercicio.pkg16;

import java.util.Scanner;


public class Ejercicio16 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String passc="hola";
        String pass="";
        int intentos=4;
        int veces=1;
        
        System.out.println("Ingrese la contraseña");
        pass=sc.next();
        do{
            if(pass.equals(passc)){
            veces=veces+3;
            System.out.println("Enhorabuena");
            }else{
                intentos=intentos-1;
                System.out.println("Contraseña incorrecta, quedan "+intentos +" intentos");
                System.out.println("Ingrese nuevamente la contraseña");
                pass=sc.next();
                veces=veces+1;
            }    
        }while(veces<=3);
        if(veces==3){
            System.out.println("Fallido por cantidad de intentos");
        }
    }
    
}
