import java.util.Random;

public class Estatisticas<T extends Distribuicao>  {
    T distribution;
    double media, variancia, desvPadrao;

    public Estatisticas(T dist) {
        distribution = dist;
        if (distribution instanceof DistribuicaoNormal) {
            media = ((DistribuicaoNormal) distribution).m;
            desvPadrao = ((DistribuicaoNormal) distribution).desvPadrao;
            variancia = Math.pow(desvPadrao, 2);
        }
        else if (distribution instanceof DistribuicaoUniforme) {
            double a = ((DistribuicaoUniforme) distribution).a;
            double b = ((DistribuicaoUniforme) distribution).b;
            media = (a+b)/2;
            desvPadrao = (b-a)/Math.sqrt(12);
            variancia = Math.pow(desvPadrao, 2);
        }
        else if (distribution instanceof  DistribuicaoExponencial) {
            media = 1.0 /((DistribuicaoExponencial) distribution).y;
            desvPadrao = media;
            variancia = Math.pow(desvPadrao, 2);
        } else {
            media = ((DistribuicaoPoisson) distribution).y;
            variancia = media;
            desvPadrao = Math.sqrt(media);
        }
    }

    public void imprimirValoresGerados(int x) {
        Random r = new Random();
        for (int i = 0; i < x; i++) {
            int valor = r.nextInt(5);
            System.out.println("Valor aleatório gerado: "+
                    valor+
                    "\nValor na distribuição: "+distribution.Calcular(valor));
        }
    }
    public void imprimirMedia() {
        System.out.println("Média: "+media);
    }
    public void imprimirVariancia() {
        System.out.println("Variância: "+variancia);
    }
}