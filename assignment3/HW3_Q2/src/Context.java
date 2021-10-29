public class Context {
    MathOperation operation;


    public Context( MathOperation operation) {
        this.operation = operation;
    }

    public int execute( int n1, int n2){

        return operation.performOperation(n1,n2);

    }
}

