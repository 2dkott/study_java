package model;

public class RationalNumberMapper {

    public static RationalNumber map(String number) throws Exception {
        try{
            String[] numbers = number.split("/");
            int numerator = Integer.parseInt(numbers[0]);
            int denominator = Integer.parseInt(numbers[1]);
            return new RationalNumber(numerator,denominator);
        } catch (Exception e){
            throw new RuntimeException(String.format("Произашлаа ошибка обработки рационального исла, которое Вы ввели: \n %s", e.getMessage()));
        }
    }
}
