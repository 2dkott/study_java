package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComplexNumberMapper {

    public static ComplexNumber map(String number) throws Exception {
        try{
            Pattern pattern = Pattern.compile("\\d(-|\\+)\\d");
            Matcher matcher = pattern.matcher(number);
            if(matcher.find()) {
                String action = matcher.group(1);
                String[] temp = number.split(action.equals("+") ? String.format("\\%s",action) : action);
                int real = Integer.parseInt(temp[0]);
                int imaginary = Integer.parseInt(temp[1].replaceAll("\\D", ""));
                return new ComplexNumber(real,action,imaginary);
            }
            throw new Exception("Формат комплексного числа неверный");
        } catch (Exception e) {
            throw new Exception(String.format("Произашлаа ошибка обработки комплексного числа, которое Вы ввели: \n %s", e.getMessage()));
        }
    }
}
