package clase4;

public class TrianguloFloyd {

    public static void main(String[] args) {
        System.out.println(trianguloFloyd(20));
    }

    public static String trianguloFloyd(int n) {
        int c1 = 0, c2 = 0;
        String r = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                r += j + c1 + " ";
            }
            c2++;
            c1 = c2 + c1;
            r+="\n";
        }
        return r;
    }
}
