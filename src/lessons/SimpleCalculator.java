package lessons;

public class SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult() {
        double result = getFirstNumber() - getSecondNumber();
        return result;
    }

    public double getMultiplicationResult() {
        return getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult() {
        //cannot divide 0
        if (secondNumber == 0 || firstNumber == 0) {
            return 0;
        }
        return getSecondNumber() / getFirstNumber();
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {

    }

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add="  +  calculator.getAdditionResult());
        System.out.println("subtract = "+  calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " +  calculator.getMultiplicationResult() );
        System.out.println("divide = " +  calculator.getDivisionResult());

    }

}



