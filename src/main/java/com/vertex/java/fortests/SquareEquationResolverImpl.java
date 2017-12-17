package com.vertex.java.fortests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SquareEquationResolverImpl implements SquareEquationResolver {

    private DiscriminantCalculator discriminantCalculator;

    @Override
    public Solution resolveEquation(double a, double b, double c) {
        double discriminant;
        discriminant = discriminantCalculator.calculateDiscriminant(a,b,c);
//        discriminant = getDiscriminant(a, b, c);
        double discrSquareRoot = Math.sqrt(discriminant);
        return new Solution((0 - b - discrSquareRoot) / (2 * a), (0 - b + discrSquareRoot) / (2 * a));
    }


    private double getDiscriminant(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            throw new ArithmeticException("This equation does not resolvable in real numbers");
        }
        return discriminant;
    }
}
