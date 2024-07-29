public class DistribuicaoUniforme extends Distribuicao {
    int a;
    int b;

    DistribuicaoUniforme(int x, int y) {
        // Construtor recebendo os parâmetros de entrada
        a = x;
        b = y;
    }

    @Override
    public double Calcular(double x) {
        // usando a função calcular para retornar o valor para a distribuição
        double resultado;
        if ((a <= x) && (x <= b)) {
            resultado = 1 / (b - a);
        } else {
            resultado = 0;
        }
        return resultado;
    }

}
