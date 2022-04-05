import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {

    private final JPanel panel = new JPanel();

    private final JButton addButton = new JButton("+");
    private final JButton subtractButton = new JButton("-");
    private final JButton multiplyButton = new JButton("x");
    private final JButton divideButton = new JButton("/");

    private final JTextField firstNumberField = new JTextField();
    private final JTextField secondNumberField = new JTextField();

    private final JLabel answerLable = new JLabel("Your answer is: ");

    public CalculatorView() {

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5, 5));

        panel.add(firstNumberField);
        panel.add(secondNumberField);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(answerLable);
        this.add(panel, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.pack();
        this.setVisible(true);
    }

    public int getFirstNumber(){
        return Integer.parseInt(firstNumberField.getText());
    }

    public int getSecondNumber(){
        return Integer.parseInt(secondNumberField.getText());
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getSubtractButton() {
        return subtractButton;
    }

    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    public JButton getDivideButton() {
        return divideButton;
    }

    public void setAnswerLable(double answer){
        answerLable.setText("Your answer is: " + answer);
    }

    public void addActionListener(JButton button, ActionListener action){
        button.addActionListener(action);
    }

}
