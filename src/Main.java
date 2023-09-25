public class Main {

    public static void main(String[] args) {

    }

    // 1. add
    public static int add(int a, int b){
        return a + b;
    }
    // 2. add
    public static int addTwo(int a, int b, int c, int d){
        int addAB = a + b;
        int addCD = c + d;
        return addAB + addCD;
    }
    // 3. morningGreeting
    public static String morningGreeting(String message){
        return ("早上好, " + message + "!");
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String message){
        return ("下午好, " + message + "!");
    }
    // 5. triple
    public static String triple(String message){
        return (message + message + message);
    }
    // 6. half
    public static double half(int a){
        return (double) a /2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        return (int) (a + 0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a){
        return (int) (a - 0.5);
    }
}
