package clase4;

public class TrianguloPascal {

    public static void main(String[] args) {
        System.out.println(trianguloPascal(8));
    }

    public static String trianguloPascal(int n) {
        String r = "";
        int[] array1 = null,array2=null;
        for (int i = 0; i < n; i++) {            
            array2= new int[i];
            if(i==1){
                array1 = new int[]{1,1};
            }
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == (i-1)) {
                    array2[j] = 1;
                    r += array2[j] + " ";
                } else {
                    array2[j]=array1[j - 1] + array1[j];                    
                    r += array2[j]+" ";
                }
            }
            array1 = array2;
            r += "\n";
        }
        return r;
    }
}
