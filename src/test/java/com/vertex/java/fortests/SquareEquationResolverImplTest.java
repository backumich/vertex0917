package com.vertex.java.fortests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SquareEquationResolverImplTest {

    private SquareEquationResolverImpl underTest;

    @Mock
    private DiscriminantCalculator discriminantCalculator;

    @Before
    public void snjbvbeijvvwkmwcl() throws Exception {
//        MockitoAnnotations.initMocks(this);
        underTest = new SquareEquationResolverImpl();
        underTest.setDiscriminantCalculator(discriminantCalculator);
    }

    @Test
    public void resolveEquationNotNull(){
        assertNotNull(underTest.resolveEquation(1,2,1));
    }

    @Test
    public void resolveEquationSunnyTest() {
        when(discriminantCalculator.calculateDiscriminant(1, -4, 3))
                .thenReturn(4.0);

        SquareEquationResolver.Solution solution = underTest.resolveEquation(1, -4, 3);
        assertThat(solution, anyOf(is(new SquareEquationResolver.Solution(1,3)),
                is(new SquareEquationResolver.Solution(3,1))));
    }

    @Test
    public void resolveEquationSunnyTestWithSameSolutions() {
        when(discriminantCalculator.calculateDiscriminant(1, 2, 1))
                .thenReturn(0.0);

        SquareEquationResolver.Solution solution = underTest.resolveEquation(1, 2, 1);
        assertEquals(new SquareEquationResolver.Solution(-1,-1), solution);
    }

    @Test(expected = ArithmeticException.class)
    public void resolveEquationWithDiscriminantLessThanZero() {
        when(discriminantCalculator.calculateDiscriminant(1,0,1))
                .thenThrow(new ArithmeticException("Test message"));

        underTest.resolveEquation(1, 0, 1);
        fail("resolveEquation should fail when discriminant less than zero");
    }

    @Test
    public void resolveEquationUsesDiscriminantCounter(){
        underTest.resolveEquation(1, 0, 0);
        verify(discriminantCalculator).calculateDiscriminant(anyDouble(), anyDouble(), anyDouble());
    }
}