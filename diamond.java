public class diamond {
    public static void main(String[] args) {
        int i = 4;
        while (--i > 0){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            for (int h = 0; h < 7 - 2 * i; h++){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        int y = 0;
        while (++y < 4){
            for (int j = 0; j < y; j++){
                System.out.print("*");
            }
            for (int f =0; f < 7 - 2 * y; f++){
                System.out.print(" ");
            }
            for (int g = 0; g < y; g++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}