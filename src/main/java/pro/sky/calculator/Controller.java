package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping(path = "/calculator")
    public String answerCalculator() {
        return service.answerCalculator();
    }
    @GetMapping
    public String localHost8080() {
        return service.localHost8080();
    }
    @GetMapping("/calculator/plus")
    public String sumNumb(@RequestParam int num1, @RequestParam int num2){
        int result = service.sum(num1, num2);
        return giveResponses(num1, num2, '+', result);
    }
    @GetMapping("/calculator/minus")
    public String substractNumb(@RequestParam int num1, @RequestParam int num2){
        int result = service.subtract(num1, num2);
        return giveResponses(num1, num2, '-', result);
    }
    @GetMapping("/calculator/multiply")
    public String multiplyNumb(@RequestParam int num1, @RequestParam int num2){
        int result = service.multiply(num1, num2);
        return giveResponses(num1, num2, '*', result);
    }
    @GetMapping("/calculator/divide")
    public String divideNumb(@RequestParam int num1, @RequestParam int num2){
        if (num2 == 0) {
            return "<h1>Деление на 0 невозможно.</h1>";
        }
        int result = service.divide(num1, num2);
        return giveResponses(num1, num2, '/', result);
    }
    private String giveResponses (int num1, int num2,char action, int result) {
        return String.format("<h1>%d %c %d = %d</h1>",num1,action,num2,result);

    }
}





