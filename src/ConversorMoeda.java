public class ConversorMoeda implements ConversaoFinanceira {
    double valorEmReal;

    public double converterDolarParaReal(double valorEmDolar){
        double taxaDeCambio = 5.25; // Taxa de câmbio hipotética
        return valorEmDolar * taxaDeCambio;
    }
}
