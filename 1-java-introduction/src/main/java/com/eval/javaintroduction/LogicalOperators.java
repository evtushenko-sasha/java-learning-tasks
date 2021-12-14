package com.eval.javaintroduction;

public interface LogicalOperators {

    boolean applyAndOperator(boolean a, boolean b);

    boolean applyOrOperator(boolean a, boolean b);

    boolean logicalNegation(boolean a);

    /*aOrBAndCOrD*/
    boolean apply(boolean a, boolean b, boolean c, boolean d);

    /*!a and c or !b*/
    boolean apply(boolean a, boolean b, boolean c);

}
