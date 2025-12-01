import java.io.*;

public class Script {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;

            int contador = 0;
            int inicio = 50;

            while ((line = br.readLine()) != null) {

                char letra = line.charAt(0);
                int valor = Integer.parseInt(line.substring(1));

                if (letra == 'R') {
                    inicio += valor;
                } else if (letra == 'L') {
                    inicio -= valor;
                }

                inicio = (inicio % 100 + 100) % 100;
                if(inicio == 0){
                    contador++;
                }

                System.out.println("Posição atual: " + inicio);
            }

            System.out.println("O resultado 0 apareceu " + contador + " vezes");

        } catch (IOException e){
            System.out.println("Erro");
        }
    }
}
