public class PatternZeroTr {
    static void printSpace(int min, int max) {
        if (min > max)
            return;
        System.out.print(" ");
        printSpace(min + 1, max);
    }

    static void printStar(int min, int max, int Promax) {
        if (min > max)
            return;
        if (min == 1 || min == max || max == Promax) {
            System.out.print("* ");
        } else {
            if (min % 2 == 0)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }

        printStar(min + 1, max, Promax);
    }

    static void Pattern(int min, int max) {
        if (min > max)
            return;
        printSpace(1, max - min);
        printStar(1, min, max);
        System.out.println();
        Pattern(min + 1, max);
    }

    public static void main(String[] args) {
        int num = 9;
        Pattern(1, num);
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == num) {
                    System.out.print("* ");
                } else {
                    if (j % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }
    }

}
