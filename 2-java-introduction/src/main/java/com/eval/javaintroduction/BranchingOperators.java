package com.eval.javaintroduction;

/*IF, if-else, if-else-if, switch*/
public interface BranchingOperators {

    int getAIfALessThanBOtherwiseB(int a, int b);

    String getStringIfNotNullOtherwiseEmpty(String str);

    /*if a>b return A-B else B-A*/
    int get(int a, int b);

    /*if a>b and a>c return a+c, if b>a and b>c return b+a, if c>a and c>b return c+c*/
    int get(int a, int b, int c);


}
