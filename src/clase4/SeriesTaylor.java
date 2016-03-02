package clase4;

public class SeriesTaylor {

    public static void main(String[] args) {        
        System.out.println(cosX_N(6));
    }

    public static String cosX_N(long n) {
        String s = "";
            for (int k = 0; k <= n; k++) {  
                if(k==0){
                    s+="1 ";
                }else{
                    s+=evaluarSigno(k)+" ((X^"+(2*k)+")/"+(2*k)+"!) ";
                }
            }
        return s;
    }
    
    public static String evaluarSigno(int k){
        //<editor-fold defaultstate="collapsed" desc="CUERPO">      
        if (k==0) {
            return "";
        } else {
            if (potencia(-1,k)>0) {
                return "+";
            } else {
                return "-";
            }
        }
        //</editor-fold>
    }

    public static long potencia(long base, long exp) {
        //<editor-fold defaultstate="collapsed" desc="CUERPO">
        //        long r = 1;
        //        for (long i = 1; i <= exp; i++) {
        //            r *= base;
        //        }
        //        return r;

        if (exp == 0) {
            return 1;
        } else {
            return base * potencia(base, exp - 1);
        }
        //</editor-fold>
    }

    public static long factorial(long n) {
        //<editor-fold defaultstate="collapsed" desc="CUERPO">
        //        long r = 1;
        //        if (n == 0) {
        //            return 1;
        //        } else {
        //            for (int i = 1; i <= n; i++) {
        //                r *= i;
        //            }
        //            return r;
        //        }

        //        while (n != 0) {
        //            r = r * n;
        //            n--;
        //        }
        //        
        //        return r;
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
        //</editor-fold>
    }

}
