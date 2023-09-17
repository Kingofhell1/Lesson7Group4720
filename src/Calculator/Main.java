package Calculator;

public class Main {
    public static void main(String[] args) {
        CalculatorF calculatorF = new CalculatorF1();
        ViewCalculator view = new ViewCalculator(calculatorF);
        view.run();
    }
}