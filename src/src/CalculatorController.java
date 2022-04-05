import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorView calculatorView;
    private CalculatorModel calculatorModel;

    public CalculatorController(CalculatorView calculatorView, CalculatorModel calculatorModel){
        this.calculatorView = calculatorView;
        this.calculatorModel = calculatorModel;

        this.calculatorView.addActionListener(calculatorView.getAddButton(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorModel.setFirstNumber(calculatorView.getFirstNumber());
                calculatorModel.setSecondNumber(calculatorView.getSecondNumber());
                calculatorModel.add();
                calculatorView.setAnswerLable(calculatorModel.getResult());
                System.out.println("add action being performed.");
            }
        });

        this.calculatorView.addActionListener(calculatorView.getSubtractButton(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorModel.setFirstNumber(calculatorView.getFirstNumber());
                calculatorModel.setSecondNumber(calculatorView.getSecondNumber());
                calculatorModel.subtract();
                calculatorView.setAnswerLable(calculatorModel.getResult());
                System.out.println("subtraction action being performed.");
            }
        });

        this.calculatorView.addActionListener(calculatorView.getMultiplyButton(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorModel.setFirstNumber(calculatorView.getFirstNumber());
                calculatorModel.setSecondNumber(calculatorView.getSecondNumber());
                calculatorModel.multiply();
                calculatorView.setAnswerLable(calculatorModel.getResult());
                System.out.println("multiply action being performed.");
            }
        });

        this.calculatorView.addActionListener(calculatorView.getDivideButton(), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorModel.setFirstNumber(calculatorView.getFirstNumber());
                calculatorModel.setSecondNumber(calculatorView.getSecondNumber());
                calculatorModel.divide();
                calculatorView.setAnswerLable(calculatorModel.getResult());
                System.out.println("divide action being performed.");
            }
        });
    }

}
