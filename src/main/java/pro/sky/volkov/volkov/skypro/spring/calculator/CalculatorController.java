package pro.sky.volkov.volkov.skypro.spring.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
//    private final;

    @GetMapping(path = "/calculator")
    public String startDisplay(){
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }
}
