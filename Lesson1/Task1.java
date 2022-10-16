public class Task1 {

    public static void main(String[] args){
        for(int i = 0; i<=4; i++){
            System.out.println(getTringleNumber(i));
        }
    }

    static int getTringleNumber(int initNumber){
        if(initNumber > 1){
            return initNumber + getTringleNumber(initNumber-1);
        } else {
            return initNumber;
        }
    }
}
