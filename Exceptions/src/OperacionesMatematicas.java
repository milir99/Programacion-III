public class OperacionesMatematicas <T extends Number> {
    public T division(T num1, T num2)throws ArithmeticException {
        T div = null;
        if(num2.doubleValue() == 0){
            throw new ArithmeticException("no se puede dividir por 0");
        }

        if (num1 instanceof Integer && num1 instanceof Integer)
        {
            div = (T) Integer.valueOf( num1.intValue() / num2.intValue());
        } else if (num1 instanceof Double&& num1 instanceof Double) {
            div = (T) Double.valueOf( num1.doubleValue() / num2.doubleValue());
        } else if (num1 instanceof  Float&& num1 instanceof Float) {
            div = (T) Float.valueOf( num1.floatValue() / num2.floatValue());

        }
        return div;
    }
}

