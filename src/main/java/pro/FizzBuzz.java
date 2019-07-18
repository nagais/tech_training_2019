package pro;

class FizzBuzz {

    String response(int num) {
        StringBuilder result = new StringBuilder();

        if (num < 1 || num > 100) {
            throw new IndexOutOfBoundsException();
        }

        if (num % 3 == 0) {
            result.append("Fizz");
        }

        if (num % 5 == 0) {
            result.append("Buzz");
        }

        if (result.length() == 0) {
            result.append(num);
        }

        return result.toString();
    }
}
