package com.vertex.java.fortests;

import lombok.AllArgsConstructor;
import lombok.Data;

public interface SquareEquationResolver {

    @Data
    @AllArgsConstructor
    public static class Solution {
        private double first;
        private double second;
    }

    Solution resolveEquation(double a, double b, double c);
}
