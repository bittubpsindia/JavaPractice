package practiceQuestions;

public class Parameter {
    public static void main(String[] args) {
        int num = sumTwoNumber(5 ,  8);
        System.out.println("Sum is : " +num);
    }
    public static int sumTwoNumber(int first, int second){
        System.out.println("First number received : " +first);
        System.out.println("Second number received :  " + second);
        int sum = first + second;
        return sum ;

}
}