package clase3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructurasControl {

    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="ESTRUCTURAS DE CONTROL">
        //IF-ELSE,WHILE,DO WHILE,FOR,SWITH,
        //<editor-fold defaultstate="collapsed" desc="IF-ELSE">        
        int var1 = 3, var2 = 4;
        if (var1 == var2) {
            System.out.println("Son iguales");
        } else if (var1 < var2) {
            System.out.println("V1 es menor que v2");
        } else if (var1 > var2) {
            System.out.println("var1 es mayor que v2");
        } else {
            System.out.println("no definido");
        }
        //</editor-fold>      
        //<editor-fold defaultstate="collapsed" desc="WHILE">
        int n1 = 0, n2 = 12;
        while (n1 < n2) {
            System.out.println("N1=" + n1 + " N2=" + n2);
            n1++;//n1=n1+1;n1+=1;
        }
        System.out.println("N1 = N2");
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="DO-WHILE">
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese una opción del menú");
        
        int rsp = -1;
        do {
            System.out.println("1 : Registrar");
            System.out.println("2 : Listar");
            System.out.println("3 : Eliminar");
            System.out.println("0 : Salir");
            System.out.print("Opcion = ");
            
            //<editor-fold defaultstate="collapsed" desc="BLOQUE LECTURA Y VALIDACION">
            boolean bandera = false;
            while (bandera == false) {
                try {
                    rsp = Integer.parseInt(bf.readLine().trim());
                    bandera = true;
                } catch (Exception e) {
                    bandera = false;
                }
            }
            //</editor-fold>
            
        } while ((rsp < 1 || rsp > 4) && rsp != 0);
        //</editor-fold>
        //</editor-fold>
    }
}
