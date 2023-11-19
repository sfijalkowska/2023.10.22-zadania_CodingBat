/*

For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5,
so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values.
To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times.
Write the helper entirely below and at the same indent level as roundSum().


roundSum(16, 17, 18) → 60
roundSum(12, 13, 14) → 30
roundSum(6, 4, 4) → 10
 */

public class roundSum {
    public static void main(String[] args) {
        System.out.println(roundSum(16, 17, 18));
        System.out.println(roundSum(12, 13, 14));
        System.out.println(roundSum(6, 4, 4));
    }
    public static int roundSum (int a, int b, int c){
        return round10(a) + round10(b) + round10(c);
    }
    /*
    Oblicz resztę z dzielenia num przez 10, aby uzyskać ostatnią cyfrę liczby. Zapisz to jako num % 10.
Jeśli reszta jest mniejsza niż 5, zaokrąglij w dół, odejmując resztę od liczby num.
W przeciwnym razie zaokrąglij w górę, dodając do liczby num różnicę między 10 a resztą.
     */
    public static int round10(int num) {
        if (num % 10 <5){
            return num - num % 10;
        } else {
            return num + (10 - num % 10);
        }
    }
}






