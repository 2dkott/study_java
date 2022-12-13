package model;

public class RationalNumber extends BaseNumber<RationalNumber> {
    private final int numerator;
    private final int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public RationalNumber add(RationalNumber number) {
        int tempNumerator = numerator * number.denominator + number.numerator* denominator;
        int tempDenominator = denominator * number.denominator;
        if(tempNumerator!=0 && tempDenominator%tempNumerator==0){
            tempDenominator = tempDenominator/tempNumerator;
            tempNumerator = 1;
        }
        return new RationalNumber(tempNumerator, tempDenominator);
    }

    @Override
    public RationalNumber subtract(RationalNumber number) {
        int tempNumerator = numerator * number.denominator - number.numerator * denominator;
        int tempDenominator = denominator * number.denominator;
        if(tempNumerator!=0 && tempDenominator%tempNumerator==0){
            tempDenominator = tempDenominator/tempNumerator;
            tempNumerator = 1;
        }
        return new RationalNumber(tempNumerator,tempDenominator);
    }
    @Override
    public String toString(){
        if(numerator==0){
            return "0";
        }
        return String.format("%s/%s", numerator,denominator);
    }
}
