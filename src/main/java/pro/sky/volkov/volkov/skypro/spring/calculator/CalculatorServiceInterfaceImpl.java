package pro.sky.volkov.volkov.skypro.spring.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceInterfaceImpl implements CalculatorServiceInterface {
    public String startDisplay() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }

    public String resultPlus(String num1, String num2) {
        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        return num1 + " + " + num2 + " = " + result;
    }

    public String resultMinus(String num1, String num2) {
        int result = Integer.parseInt(num1) - Integer.parseInt(num2);
        return num1 + " - " + num2 + " = " + result;
    }

    public String resultMultiply(String num1, String num2) {
        int result = Integer.parseInt(num1) * Integer.parseInt(num2);
        return num1 + " * " + num2 + " = " + result;
    }

    public String resultDivide(String num1, String num2) {
        if (Integer.parseInt(num2) != 0) {
            int result = Integer.parseInt(num1) / Integer.parseInt(num2);
            return num1 + " / " + num2 + " = " + result;
        } else {
            return "На ноль делить нельзя";
        }
    }
}
