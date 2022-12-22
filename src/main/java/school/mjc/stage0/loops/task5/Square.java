package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        if (sideLength <= 2 && sideLength >= 1)
        for (int i = 0; i < sideLength; i++) {
            if (sideLength == 0) {
                System.out.println("");
            }
            System.out.println(88);
        } else if (sideLength >= 2) {
            for (int i = 2; i < sideLength; i++) {
                System.out.println(88 + " " + 88);
            }
        }
    }
}
