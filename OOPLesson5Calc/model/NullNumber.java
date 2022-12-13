package model;

public class NullNumber extends BaseNumber<NullNumber>{
    @Override
    public NullNumber add(NullNumber number) {
        return null;
    }

    @Override
    public NullNumber subtract(NullNumber number) {
        return null;
    }

    @Override
    public String toString(){
        return "Ноль";
    }
}
