import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        String[] arr = new String[3];
        arr = a.split("\\/");

        String dia = arr[0];
        String mes = arr[1];
        String ano = arr[2];

        System.out.println(mes + "/" + dia + "/" + ano);
        System.out.println(ano + "/" + mes + "/" + dia);
        System.out.println(dia + "-" + mes + "-" + ano);

    }
}
