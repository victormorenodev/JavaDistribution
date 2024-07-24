public class DistribuicaoPoisson extends Distribuicao{
    int y;
    DistribuicaoPoisson(int entrada){
        //Construtor recebendo os parâmetros de entrada
        y = entrada;
    }

    double Fatorial(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Fatorial não está definido para números negativos.");
        }
        if (x == 0 || x == 1) {
            return 1;
        }
        return x * Fatorial(x - 1);
    }

    @Override
    public double Calcular(double x) {
        //super.Calcular(Double x);
        double valorDistrib = (Math.pow(2.71828, ((-1)*y)) * (Math.pow(y,x))) / Fatorial(x);
        return valorDistrib;
    }
}