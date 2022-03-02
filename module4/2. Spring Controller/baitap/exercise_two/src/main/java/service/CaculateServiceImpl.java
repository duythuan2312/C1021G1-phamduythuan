package service;

public class CaculateServiceImpl implements CaculaterService{
    @Override
    public String Calculate(double number1, double number2, String caculate) {
           String result ="";
            switch (caculate) {
                case "+":
                    result = number1 + number2+"";
                    break;
                case "-":
                    result = number1 - number2+"";
                    break;
                case "X":
                    result = number1 * number2+"";
                    break;
                case "/":
                    result = number1 / number2+"";
                    break;
            }
            return result;
        }
    }