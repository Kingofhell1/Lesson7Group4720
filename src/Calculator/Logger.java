package Calculator;

public class Logger implements Loggable{
    @Override
    public void saveLog(String str) {
        System.out.println("Log message: " + str);
    }
}
