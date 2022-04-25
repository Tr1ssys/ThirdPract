package thirdPractice;

public class thirdPractice {
    public static void main(String[] args) {
        int mult = 1;
        int[] numbers = {2,3,4,5};
        for(int i = 0; i< numbers.length; i++){
            mult *= numbers[i];
        }
        System.out.println(mult);
    }
}
