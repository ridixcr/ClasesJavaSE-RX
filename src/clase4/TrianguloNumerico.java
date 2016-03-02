package clase4;

public class TrianguloNumerico {
    public static void main(String[] args) {
         System.out.println(trianguloNumerico(20));
    }
    public static String trianguloNumerico(int n){
        String r="";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                r+=j+" ";                
            }
            r+="\n";
        }
        return r;
    }    
}
