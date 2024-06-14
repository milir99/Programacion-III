public class OperacionesMatematicas<T extends Number> {

    public T suma(T num1, T num2) {
        T suma;
        if (num1 instanceof Integer) {
            suma = (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            suma = (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else if (num1 instanceof Float) {
            suma = (T) Float.valueOf(num1.floatValue() + num2.floatValue());
        } else {
            throw new IllegalArgumentException("Tipo de número no soportado");
        }
        return  suma;
    }

    public T resta(T num1, T num2) {
        T resta ;
        if (num1 instanceof Integer) {
             resta = (T) Integer.valueOf(num1.intValue() - num2.intValue());
        } else if (num1 instanceof Double) {
             resta = (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else if (num1 instanceof Float) {
             resta = (T) Float.valueOf(num1.floatValue() - num2.floatValue());
        } else {
            throw new IllegalArgumentException("Tipo de número no soportado");
        }
        return resta;
    }

    public T multiplicacion(T num1, T num2) {
        T multriplicacion ;
        if (num1 instanceof Integer) {
            multriplicacion = (T) Integer.valueOf(num1.intValue() * num2.intValue());
        } else if (num1 instanceof Double) {
            multriplicacion = (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else if (num1 instanceof Float) {
            multriplicacion = (T) Float.valueOf(num1.floatValue() * num2.floatValue());
        } else {
            throw new IllegalArgumentException("Tipo de número no soportado");
        }
        return multriplicacion;
    }

    public T division(T num1, T num2) {
        T division ;
        if (num2.doubleValue() == 0.0) {
            throw new ArithmeticException("División por cero");
        }

        if (num1 instanceof Integer) {
            division = (T) Integer.valueOf(num1.intValue() / num2.intValue());
        } else if (num1 instanceof Double) {
            division = (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else if (num1 instanceof Float) {
            division = (T) Float.valueOf(num1.floatValue() / num2.floatValue());
        } else {
            throw new IllegalArgumentException("Tipo de número no soportado");
        }
        return division;
    }
}
