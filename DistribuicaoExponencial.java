public class DistribuicaoExponencial extends Distribuicao{
    int y;

    DistribuicaoExponencial(int entrada){
        //Construtor recebendo os parâmetros de entrada
        y = entrada;
    }

    @Override
    public double Calcular(double x) {
        //super.Calcular(Double x);
        double valorDistrib = y * Math.exp((-1)*x*y);
        return valorDistrib;
    }

}
