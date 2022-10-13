public class FizzBuzz {
    public static void main (String[]args) {
        double c;
        double d;

        for (int a = 1; a <= 100 ; a++) {
            c = (double) a / 3; 
            d = (double) a / 5;

            if (c == (int)c && d == (int)d) {
                System.out.println("FizzBuz");
            } else if (c == Math.round(c)) {
                System.out.println("Fizz");
            } else if (d == Math.round(d)) {
                System.out.println("Buzz");
            } 
            else {
                System.out.println(a);
            }
        }
    }
}

