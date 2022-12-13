package controllers;

import model.*;

public class ViewController{

    public Calculator<ComplexNumber> getComplexCalculator(String stringNumberA, String stringNumberB) throws Exception {
        return new Calculator<>(ComplexNumberMapper.map(stringNumberA), ComplexNumberMapper.map(stringNumberB));
    }

    public Calculator<RationalNumber> getRationalCalculator(String stringNumberA, String stringNumberB) throws Exception {
        return new Calculator<>(RationalNumberMapper.map(stringNumberA), RationalNumberMapper.map(stringNumberB));
    }
}
