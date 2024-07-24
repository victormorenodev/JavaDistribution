public class DistribuicaoNormal extends Distribuicao{
    int m;
    int desvPadrao;

    DistribuicaoNormal(int x, int y){
        //Construtor recebendo os parâmetros de entrada
        m = x; 
        desvPadrao = y;
    }

    double partUm(double x){
        double resultado = Math.pow((x - m)/desvPadrao, 2) * 1/2;
        return resultado;
    }

    @Override
    public double Calcular(double x) {
        //super.Calcular(Double x);
        double valorDistrib = Math.pow(2.71828, partUm(x))/desvPadrao * Math.sqrt( 2 * 3.14159);
        return valorDistrib;
    }
    
}
