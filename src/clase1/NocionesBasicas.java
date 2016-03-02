 package clase1;


public class NocionesBasicas {

    public static void main(String[] args) {
        System.out.println("Hola Mundo Java".toCharArray());
        //<editor-fold defaultstate="collapsed" desc="PRIMITIVOS">        
        //byte,short,int,long
        byte nb = 127;
        short ns = 32767;
        int ni = 2147483647;
        long nl = 888888888L;
        //float,double
        float nf = 1.5F;
        double nd = 1.5;
        //boolean
        boolean c = true;
        //char
        char ch = 'A';
        //</editor-fold>        
        //<editor-fold defaultstate="collapsed" desc="ENVOLTORIO">
        //Byte,Short,Int,Long
        Byte wnb = 88;
        Short wns = 8888;
        Integer wni = 888888888;
        Long wnl = 888888888L;
        //Float,Double
        Float wnf = 1.8F;
        Double wnd = 1.8;
        //Character,String
        Character wch = 'A';
        String st = "Mensaje Java";
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="OPERACIONES">
        //<editor-fold defaultstate="collapsed" desc="ARITMETICAS">
        //+,-,*,/.%
        int n1 = 1, n2 = 3, r = 0;
        float n1f = 1.5f, rf = 0.0f;
        //SUMA
        r = n1 + n2;
        System.out.println(n1 + "+" + n2 + " = " + r);
        //RESTA
        r = n1 - n2;
        System.out.println(n1 + "-" + n2 + " = " + r);
        //MULTIPLICACION
        r = n1 * n2;
        System.out.println(n1 + "*" + n2 + " = " + r);
        //DIVISION
        r = n1 / n2;
        System.out.println(n1 + "/" + n2 + " = " + r);
        //RESIDUO
        r = n1 % n2;
        System.out.println(n1 + "%" + n2 + " = " + r);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="DE CONVERSION">
        rf = ((float) n1) / ((float) n2);
        System.out.println(((float) n1) + "/" + ((float) n2) + " = " + rf);

        rf = ((float) n1) % ((float) n2);
        System.out.println(((float) n1) + "%" + ((float) n2) + " = " + rf);

        String n1s = "63", n2s = "15.4", n3s = "12,6";
        System.out.println(n1s + "," + n2s + "," + n3s);

        int ncsti;
        ncsti = Integer.parseInt(n1s);
        System.out.println(ncsti);

        double ncstd;
        ncstd = Double.parseDouble(n2s);
        System.out.println(ncstd);

        //double ncstd_tst;            
        //ncstd_tst = Double.parseDouble(n3s);
        //System.out.println(ncstd_tst);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="BOOLEANAS">
        boolean rspt1 = true, rspt2 = false, rb;
        //&&(AND),||(OR),!(NOT),^(XOR)
        rb = rspt1 && rspt2;
        System.out.println(rspt1 + " AND " + rspt2 + " = " + rb);

        rb = rspt1 || rspt2;
        System.out.println(rspt1 + " OR " + rspt2 + " = " + rb);

        rb = !rspt2;
        System.out.println("NOT " + rspt2 + " = " + rb);

        rb = rspt1 ^ rspt2;
        System.out.println(rspt1 + " XOR " + rspt2 + " = " + rb);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="DE COMPARACION/RELACIONALES">
        //<,<=,==,!=,>,>=
        int n1c = 1, n2c = 3;
        boolean rbc;

        rbc = n1c < n2c;
        System.out.println(n1c + " < " + n2c + " = " + rbc);

        rbc = n1c <= n2c;
        System.out.println(n1c + " <= " + n2c + " = " + rbc);

        rbc = n1c == n2c;
        System.out.println(n1c + " == " + n2c + " = " + rbc);

        rbc = n1c > n2c;
        System.out.println(n1c + " > " + n2c + " = " + rbc);

        rbc = n1c >= n2c;
        System.out.println(n1c + " >= " + n2c + " = " + rbc);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="DE EXCEPCION/MANEJADORES DE ERROR">
        //throw,try,catch
        int in1 = 0, in2 = 12, rin;

        rin = in1 / in2;
        System.out.println(in1 + " / " + in2 + " = " + rin);
        
        try {
            rin = in2 / in1;
            System.out.println(in2 + " / " + in1 + " = " + rin);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(in2 + " / " + in1 + " = " + "Infinito");
        } finally {
            in1 = 1;
            rin = in2 / in1;
            System.out.println(in2 + " / " + in1 + " = " + rin);
        }
        //</editor-fold>        
        //</editor-fold>
    }
}
