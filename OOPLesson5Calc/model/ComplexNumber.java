package model;

public class ComplexNumber extends BaseNumber<ComplexNumber> {

    private int real;
    private int imaginary;
    private String sign;

    public ComplexNumber(int real, String sign, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
        this.sign = sign;
    }

    @Override
    public ComplexNumber subtract(ComplexNumber complexNumber) {
        int tempReal = real - complexNumber.real;
        int tempImaginary = setImaginary(sign,imaginary) - complexNumber.imaginary;
        return new ComplexNumber(tempReal, "+", tempImaginary);
    }

    @Override
    public ComplexNumber add(ComplexNumber complexNumber){
        int tempReal = real + complexNumber.real;
        int tempImaginary = setImaginary(sign,imaginary) + complexNumber.imaginary;
        return new ComplexNumber(tempReal, tempImaginary<0 ? "-" : "+", tempImaginary<0 ? tempImaginary*-1 : tempImaginary);
    }

    private int setImaginary(String sign, int imaginary){
        return sign.equals("+") ? imaginary : -imaginary;
    }

    @Override
    public String toString(){
        return String.format("%s%s%si", real,sign,imaginary);
    }
}
