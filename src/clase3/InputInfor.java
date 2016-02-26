package clase3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputInfor {

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese datos ? ");

        double dato = 0;
        boolean bandera = false;
        while (bandera == false) {
            try {
                dato = Double.parseDouble(b.readLine().trim());
                bandera=true;
            } catch (Exception e) {
                bandera=false;
            }
        }
        System.out.println("El numero ingresao es:" + dato);
    }
}
