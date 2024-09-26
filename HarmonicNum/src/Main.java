public class Main {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        int sum =0;
        double component = 0.0;

        for (int n = 0; n < number.length; n++) {
            sum += number[n];
        }
        for ( double i = 1; i <= number.length; i++){
            component += (1.0 / i);
        }
        System.out.println(" Harmonik: " + component);

    }
}