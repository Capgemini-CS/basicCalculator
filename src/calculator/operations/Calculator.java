package calculator.operations;


public class Calculator {
    public static void main(String[] args) {

        validateDate(args.length, args[0], args[1], args[2]);
        System.out.println(executeOperation(args[0], args[1], args[2]));
    }

    public static void validateDate(int parametersNumber, String firstNumber, String secondNumber, String operationType) {

        if (parametersNumber != 3) {
            System.exit(0);
        }
        if (firstNumber == null || !firstNumber.matches("[0-9]+")) {

            System.exit(0);
        }
        if (secondNumber == null || !secondNumber.matches("[0-9]+")) {
            System.exit(0);
        }
        if (!operationType.matches("[-+*/]+")) {
            System.exit(0);
        }
    }


    public static int executeOperation(String firstNumber, String secondNumber, String operationType) {
        int result = 0;
        switch (operationType) {
            case "+":
                result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
                break;
            case "-":
                result = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
                break;
            case "*":
                result = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
                break;
            case "/":
                if (Integer.parseInt(secondNumber) != 0) {
                    result = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber);
                }
                break;
        }
        return result;
    }


}


