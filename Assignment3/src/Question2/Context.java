package Question2;

public class Context {
    iMathOperation operation;
    public Context(iMathOperation operation) {
        this.operation = operation;
    }
    public int execute(int num1, int num2) {
        return  operation.performOperation(num1,num2);
    }
}
