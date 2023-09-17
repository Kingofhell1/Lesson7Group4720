package Calculator;

public class LogCal implements Calculable{
    protected Calculable calc;
    Loggable logger= new Logger();


    public LogCal(Calculable calc) {
        logger.saveLog("" + calc.getResult());
        this.calc = calc;
    }


    @Override
    public Calculable sum(int arg) {
       logger.saveLog(calc.getResult() + " + " + arg);
        return this.calc.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.saveLog(calc.getResult() + " * " + arg);
        return this.calc.multi(arg);
    }

    @Override
    public int getResult() {
        int result = this.calc.getResult();
        logger.saveLog(" = " + result);
        return this.calc.getResult();
    }
}

