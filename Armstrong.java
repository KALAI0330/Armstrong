package week1.day2;

public class Armstrong {
	public static void main(String[] args) {

        int number = 153, originalNumber, rem, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            rem = originalNumber % 10;
            result += Math.pow(rem, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

