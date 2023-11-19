/*

We want make a package of goal kilos of chocolate.
We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars.
Return -1 if it can't be done.


makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
 */

public class makeChocolate {
    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));
    }
    public static int makeChocolate(int small, int big, int goal) {
        int maxBig = goal / 5; // Oblicz maksymalną liczbę dużych tabliczek potrzebnych
        if (maxBig <= big) {
            // Jeśli potrzebnych dużych tabliczek jest mniej lub tyle samo, ile dostępnych,
            // używamy wszystkich dostępnych dużych tabliczek
            goal -= maxBig * 5;
        } else {
            // W przeciwnym razie używamy wszystkich dostępnych dużych tabliczek
            goal -= big * 5;
        }
        if (goal <= small) {
            // Jeśli po użyciu dużych tabliczek pozostały do użycia małe tabliczki
            // w ilości wystarczającej do osiągnięcia celu, zwracamy tę ilość
            return goal;
        }
        // Jeśli nie jest możliwe osiągnięcie celu, zwracamy -1
        return -1;
    }
}
