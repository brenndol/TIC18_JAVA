class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}


class Calculadora {

    
    public int somar(int a, int b) {
        return a + b;
    }

    
    public int subtrair(int a, int b) {
        return a - b;
    }

    
    public int multiplicar(int a, int b) {
        return a * b;
    }

    
    public int dividir(int numerador, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return numerador / divisor;
    }

    
    public float dividir(float numerador, float divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return numerador / divisor;
    }
}

public class Calc {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        try {
            
            int resultadoSoma = calculadora.somar(5, 3);
            System.out.println("Resultado da soma: " + resultadoSoma);

            int resultadoSubtracao = calculadora.subtrair(8, 3);
            System.out.println("Resultado da subtração: " + resultadoSubtracao);

            int resultadoMultiplicacao = calculadora.multiplicar(4, 5);
            System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);

            int resultadoDivisaoInteira = calculadora.dividir(10, 2);
            System.out.println("Resultado da divisão inteira: " + resultadoDivisaoInteira);

            float resultadoDivisaoFloat = calculadora.dividir(5.0f, 2.0f);
            System.out.println("Resultado da divisão float: " + resultadoDivisaoFloat);

            // Tentativa de divisão por zero
            float resultadoDivisaoZero = calculadora.dividir(8.0f, 0.0f);
            System.out.println("Isso não será impresso, pois a exceção será lançada.");

        } catch (DivisionByZeroException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}