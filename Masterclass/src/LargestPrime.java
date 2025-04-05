public class LargestPrime {
    public static void main(String[] args) {
        /*
        Write a method named getLargestPrime with one parameter of type int named number.

If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.



The method should calculate the largest prime factor of a given number and return it.



EXAMPLE INPUT/OUTPUT:

getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)

getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)

getLargestPrime (0); should return -1 since 0 does not have any prime numbers

getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

getLargestPrime (-1); should return -1 since the parameter is negative



HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

NOTE: The method getLargestPrime ​should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.


Check for Validity: The first step is to check if the input number is valid. If the number is less than 1, return -1 as the result is not defined for such inputs.

Iterate Through Factors: Start a loop that iterates from 2 up to the square root of the input number. This is because the largest prime factor of a number cannot exceed its square root.

Check for Factors: Inside the loop, check if the current value of i is a factor of the input number. You can do this by checking if the remainder of number % i is zero. If it's not, move to the next iteration using continue.

Factorization: If i is a factor of the number, store its value in the factor variable. Then, perform factorization to remove all instances of i from the number. You can achieve this by repeatedly dividing the number by i as long as it's divisible.

Final Check: After the loop, if the number is equal to 1, it means the factorization has been completed successfully and the largest prime factor is stored in the factor variable. Return factor. If number is not 1, it means it is itself a prime number, so return number.



         */
    }
    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return number == 1 ? factor : number;

    }
}
