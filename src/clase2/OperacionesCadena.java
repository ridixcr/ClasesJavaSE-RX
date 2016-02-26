package clase2;

public class OperacionesCadena {
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="OPERACIONES">        
        //<editor-fold defaultstate="collapsed" desc="DE CADENAS">
        String ref = "   Operaciones Cadena JavaSE  Cadena  ",result;
        int rsp;
        boolean r;
        char c;
        
        result=ref.toUpperCase();//MAYUSCULAS
        System.out.println(result);
        
        result=ref.toLowerCase();//MINISCULAS
        System.out.println(result);
        
        result=ref.trim();//QUITAR ESPACIOS AL INICIO Y FINAL
        System.out.println(result);
        
        result=ref.replaceAll("a","U");//REEMPLAZAR CARACTERES(Tiene Variaciones)
        System.out.println(result);
        
        result=ref.replaceAll(" ","");//QUITA TODOS LOS ESPACIOS EN BLANCO
        System.out.println(result);
        
        rsp=ref.length();//CANTIDAD DE CARACTERES
        System.out.println(rsp);
        
        rsp=ref.indexOf("Cadena");//BUSCAR CADENAS(NO ENCONTRADO=-1, ENCONTRADO=Pos )
        System.out.println(rsp);
        
        r=ref.contains("Mundo");//CONTIENE UNA DETERMINADA CADENA (SI/NO)
        System.out.println(r);
        
        r=ref.equals("Pruebas de programcion?");//COMPARACION
        System.out.println(r);
        
        r=ref.isEmpty();//ESTA VACIA
        System.out.println(r);
        
        result = String.valueOf(123);//CONVERSION A CADENA(OBJETOS,NUMEROS,BOOLEANS,ETC)
        System.out.println(result);
        
        c = ref.charAt(20);//OBTENCION DE CARACTER POR POSICION
        System.out.println(c);
         
        result = ref.substring(10, 20);//SUB CADENAS
        System.out.println(result);        
        
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="DE ARRAYS/MATRICES">
        //MATRICES DECLARADAS CON DATOS
        int[] datos = new int[]{};//VACIO SIN ESPACIOAS DEFINIDOS
        datos = new int[]{1,5,16};
        Double[][] info = new Double[][]{{1.0,2.0,6.0}
                                        ,{2.0,3.0,4.0}};
        String[][][] cad = new String[][][]{{{"A","B","C"},{"1","2","3"},{"#","!","%"}}
                                           ,{{"<",">","="},{";",".",":"},{"@","&","$"}}};
        //MATRIZ DE N DIMENSIONES
        //...
        //MATRICES VACIAS DECLARADAS
        datos = new int[10];//ARRAY VACIO CON TAMAÑO DEFINIDO
        info = new Double[20][10];//MATRIZ
        cad = new String[20][10][5];//MATRIZ
        //MATRIZ DE N DIMENSIONES
        
        //ASIGNACION DE DATOS
        datos[0]=123;//ARRAY        
        System.out.println(datos[0]);
        System.out.println(datos[1]);
        
        info[0][0]=45.0;//MATRIZ  
        System.out.println(info[0]);
        System.out.println(info[1]);
        System.out.println(info[0][0]);        
        //</editor-fold>        
        //</editor-fold>
    }
}
