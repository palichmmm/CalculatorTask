public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Ints calc = new IntsCalculator();

        // Старый вариант калькулятора
        System.out.println(
                calculator.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        // Новый вариант калькулятора
        System.out.println(calc.sum(2, 2));
        System.out.println(calc.mult(10, 22));
        System.out.println(calc.pow(2, 10));
    }
}