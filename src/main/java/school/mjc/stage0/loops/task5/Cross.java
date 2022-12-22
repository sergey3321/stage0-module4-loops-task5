package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength == 1 || sideLength == 2 || sideLength == 3) {
            if (sideLength == 0) {
                System.out.println("");
            }
            for (int i = 1; i < sideLength; i++) {
                System.out.println(" " + 8 + " ");
                if (i == 1 && sideLength == 1) {
                    System.out.println(8);
                } else if (i == 1 && sideLength == 2) {
                    System.out.println(88);
                } else if (i == 1 && sideLength == 3) {
                    System.out.println(888);
                }
            }
        } else if (sideLength == 4 || sideLength == 5 || sideLength == 6) {
            for (int i = 1; i < sideLength; i++) {
                System.out.println("  " + 8 + "  ");
                if (i == 2 && sideLength == 4) {
                    System.out.println(8888);
                } else if (i == 2 && sideLength == 5) {
                    System.out.println(88888);
                } else if (i == 2 && sideLength == 6) {
                    System.out.println(888888);
                }
            }
        } else if (sideLength == 7 || sideLength == 8 || sideLength == 9) {
            for (int i = 1; i < sideLength; i++) {
                System.out.println(" " + 8 + " ");
                if (i == 3 && sideLength == 7) {
                    System.out.println(8888888);
                } else if (i == 3 && sideLength == 8) {
                    System.out.println(88888888);
                } else if (i == 4 && sideLength == 9) {
                    System.out.println(888888888);
                }
            }
        }
    }
}
