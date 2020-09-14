import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
    static int result;
    static String z, w;

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int getFirstResult() throws IOException {
        int x = Integer.parseInt(reader.readLine());
        String z = reader.readLine();
        int y = Integer.parseInt(reader.readLine());

        if (z.equals("+") || z.equals("-")  || z.equals("*")  || z.equals("/")){
            switch (z){
                case "+":
                    result=x+y;
                    //System.out.println(result);
                    break;
                case "-":
                    result=x-y;
                    //System.out.println(result=x-y);
                    break;
                case "*":
                    result=x*y;
                    //System.out.println(result=x*y);
                    break;
                case "/":
                    result=x/y;
                    // System.out.println(result=x/y);
                    break;
            }
        }
        return result;
    }

    public static int getSecondResult() throws IOException {
        while (true) {
            w = reader.readLine();

            if (w.equals("+") || w.equals("-") || w.equals("*") || w.equals("/")) {  //этот знак не вычисляется
                int v = Integer.parseInt(reader.readLine());
                switch (w) {                         //сначала распознаем z, чтобы вычислить первую операцию
                    case "+":
                        result = result + v;
                        break;
                    case "-":
                        result = result - v;
                        break;
                    case "*":
                        result = result * v;
                        break;
                    case "/":
                        result = result / v;
                        break;
                }
            }
            else if (w.equals("=")) {
                //System.out.println(result);
                break;
            }
        }
        return result;
    }

    public static void main (String [] args) throws IOException {

        getFirstResult();
        getSecondResult();
        System.out.println(result);

    }
}