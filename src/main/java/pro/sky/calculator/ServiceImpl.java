package pro.sky.calculator;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    public String answerCalculator() {
        return "<b>Добро пожаловать в калькулятор</b> ";
    }
    public String localHost8080() {
        return "<b>добавь /calculator</b> ";
    }

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
