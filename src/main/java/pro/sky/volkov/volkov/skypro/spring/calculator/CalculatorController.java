package pro.sky.volkov.volkov.skypro.spring.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceInterface calculatorServiceInterface;

    public CalculatorController(CalculatorServiceInterface calculatorServiceInterface) {
        this.calculatorServiceInterface = calculatorServiceInterface;
    }

    @GetMapping
    public String startDisplay(){
        return calculatorServiceInterface.startDisplay();
    }

    @GetMapping(path = "/plus")
    public String resultPlus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorServiceInterface.resultPlus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String resultMinus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorServiceInterface.resultMinus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String resultMultiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2) throws NullPointerException{
        return calculatorServiceInterface.resultMultiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String resultDivide(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculatorServiceInterface.resultDivide(num1, num2);
    }
}
