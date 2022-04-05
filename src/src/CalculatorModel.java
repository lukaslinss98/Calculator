public class CalculatorModel {

    private double firstNumber;

    private double secondNumber;

    private double result;



    public void add() {
        result = this.firstNumber + this.secondNumber;
    }

    public void subtract() {
        result = this.firstNumber - this.secondNumber;
    }

    public void multiply() {
        result = this.firstNumber * this.secondNumber;
    }

    public void divide() {
        if(this.secondNumber == 0) {
            System.out.println("Cannot divide by 0!");
        }
        result = this.firstNumber / this.secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double getResult() {
        return this.result;
    }
}
