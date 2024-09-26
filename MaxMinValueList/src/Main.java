
public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int min = list[0];
        int max = list[0];
        int min2 = list[1];
        int max2 = list[1];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            } for (int j : list) {
                if ( j < min2 && j > min){
                    min2 = j;
                } if ( j > max2 && j < max){
                    max2 = j;
                }

            }
        }
            System.out.println("Minimum: " + min2);
            System.out.println("Maximum: " + max2);

        }
    }
