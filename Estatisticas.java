import java.util.Random;

public class Estatisticas<T extends Distribuicao>  {
    T distribution;
    public Estatisticas(T dist) {
        distribution = dist;
    }

    public void imprimirValoresGerados(int x) {
        Random r = new Random();
        for (int i = 0; i < x; i++) {
            int valor = r.nextInt(7)-3;
            System.out.println("Valor aleatório gerado: "+
                    valor+
                    "\nValor na distribuição: "+distribution.Calcular(valor));
        }
    }
    public void imprimirMedia() {

    }
    public void imprimirVariancia() {

    }
}