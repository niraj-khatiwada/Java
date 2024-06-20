import java.lang.String;

class FizzBuzz {
    public static void main(String[] args) {
        int givenNumber = 15;

        String finalValue = "";

        int divisibleCount = 0;
        if (givenNumber % 3 == 0) {
            finalValue += "Fizz";
            divisibleCount++;
        }

        if (givenNumber % 5 == 0) {
            finalValue += "Buzz";
            divisibleCount++;
        }

        if (divisibleCount == 0) {
            finalValue = String.format("%s", givenNumber);
        }

        System.out.printf("Final value is = %s\n", finalValue);

    }
}