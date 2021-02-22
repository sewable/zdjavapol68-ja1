package functional;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface FunctionWithTwoOperands {
    double oeprator(double a, double b);
}

class Addition implements FunctionWithTwoOperands {

    @Override
    public double oeprator(double a, double b) {
        return a + b;
    }
}

public class FunctionalDemo {

    public static void main(String[] args) {

        FunctionWithTwoOperands add = new Addition();
        FunctionWithTwoOperands diff = new FunctionWithTwoOperands() {
            @Override
            public double oeprator(double a, double b) {
                return a - b;
            }
        };
        List<FunctionWithTwoOperands> commands = new ArrayList<>();
        commands.add(add);
        commands.add(diff);
        //wyrażenie lambda: (a, b) -> a * b
        commands.add((a, b) -> a * b);
        //równoważnik lambdy w postaci klasy anonimowej
        commands.add(new FunctionWithTwoOperands() {
            @Override
            public double oeprator(double a, double b) {
                return a * b;
            }

            @Override
            public String toString() {
                return "Multiplication function";
            }
        });

        int[] c = new int[]{10};
        //lambda nie ma this, w przeciwieństwie do klas anonimowych
        //this wskazuje na obiekt w którym definiujemy lambdę (w tym przypadku FunctionalDemo)
        commands.add((a, b) -> {
            c[0] = 12;
            double result = c[0] * Math.pow(a, b);
            return result;
        });

        for(FunctionWithTwoOperands f : commands) {
            System.out.println(f.oeprator(20, 4));
            System.out.println(f);
        }
    }

}
