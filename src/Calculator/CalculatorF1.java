package Calculator;

public class CalculatorF1 implements CalculatorF {
    public Calculable create(int primaryArg, boolean logFlag) {
        if (logFlag) {
            Calculable calculator =  new Calculator(primaryArg);
            return new LogCal(calculator);
        }
        return new Calculator(primaryArg);
    }
}