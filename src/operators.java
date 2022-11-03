public class operators {
    public static void main(String[] args) {
        double val1 = 20.00d;
        double val2 = 80.00d;
        double val3 = (val1 + val2) * 100.00d;

        double rem = val3 % 40.00d;

        boolean iszero = rem == 0 ? true : false;
        System.out.println(iszero);
        if(!iszero) System.out.println("Got some remainder");
    }
}
