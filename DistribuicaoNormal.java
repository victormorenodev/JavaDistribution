public class DistribuicaoNormal extends Distribuicao{
    double m;
    double desvPadrao;

    DistribuicaoNormal(int x, int y){
        //Construtor recebendo os parâmetros de entrada
        m = x; 
        desvPadrao = y;
    }

    @Override
    public double Calcular(double x) {
        //super.Calcular(Double x);
        double valorDistribuicao = (1 / (desvPadrao * Math.sqrt(2 * Math.PI))) * Math.exp(-0.5 * Math.pow((x - m) / desvPadrao, 2));
        return valorDistribuicao;
    }
    
}
