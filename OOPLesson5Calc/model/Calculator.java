package model;

import views.ActionTypes;

public class Calculator<T extends BaseNumber<T>> {

    private T numberA;
    private T numberB;

    public Calculator(T numberA, T numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public static Calculator<ComplexNumber> ofComplexNumber(String stringNumberA, String stringNumberB) throws Exception {
        return new Calculator<>(ComplexNumberMapper.map(stringNumberA), ComplexNumberMapper.map(stringNumberB));
    }

    public static Calculator<RationalNumber> ofRationalNumber(String stringNumberA, String stringNumberB) throws Exception {
        return new Calculator<>(RationalNumberMapper.map(stringNumberA), RationalNumberMapper.map(stringNumberB));
    }

    public T calculate(ActionTypes actionTypes) throws Exception {
        return switch (actionTypes) {
            case ADD -> numberA.add(numberB);
            case SUBTRACT -> numberA.subtract(numberB);
            default -> throw new Exception("Выражение не найдено");
        };
    }
}
