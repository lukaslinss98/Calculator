public class main {
    public static void main(String[] args) {
        CalculatorView calculatorView = new CalculatorView();
        CalculatorModel calculatorModel = new CalculatorModel();
        CalculatorController calculatorController = new CalculatorController(calculatorView, calculatorModel);
    }
}
