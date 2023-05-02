package pro.sky.volkov.volkov.skypro.spring.calculator;

public interface CalculatorServiceInterface {
    String startDisplay();
    String resultPlus(String num1, String num2);
    String resultMinus(String num1, String num2);
    String resultMultiply(String num1, String num2);
    String resultDivide(String num1, String num2);
}
