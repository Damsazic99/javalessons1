public class Main {
    public static void main(String[] args) {
        System.out.println(getSquare(0, 0, 0, 3, 4, 0));
        System.out.println(getSquare(3, 4, 5, 7, 8, 0));
    }


    public static double getSquare(int x1, int y1, int x2, int y2, int x3, int y3) {
        double AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double BC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double AC = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double p = (AB + BC + AC) / 2;

        return Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));
    }


    public static int getZeroCount(int... numbers) {
        int tempZeroCount = 0;
        int zeroCount = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                tempZeroCount++;
            } else {
                zeroCount = (zeroCount > tempZeroCount) ? zeroCount : tempZeroCount;
                tempZeroCount = 0;
            }
            if (numbers.length - 1 == i) {
                zeroCount = (zeroCount > tempZeroCount) ? zeroCount : tempZeroCount;
                tempZeroCount = 0;
            }
        }

        return zeroCount;
    }
}


