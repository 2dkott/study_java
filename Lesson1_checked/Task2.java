public class Task2 {

    public static void main(String[] args){
        System.out.println("Вывести все простые числа от 1 до 1000");
        for(int i = 1; i<=1000; i++){
            if(isSimeplNumber(i)) System.out.println(i);
        }
    }

    static boolean isSimeplNumber(int initNumber){
        if (initNumber<2) return false;
        for(int i = 2; i < initNumber; i++){
            if(initNumber%i==0) return false;
        }
        return true;
    }
}
