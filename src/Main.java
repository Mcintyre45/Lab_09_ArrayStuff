import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int Input = SafeInput.getRangedInt(scanner, "Please enter an integer between 1 and 100", 1, 100);

        System.out.println("You entered: " + Input);

        int[] dataPoints = new int[100];
        Random random = new Random();

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        System.out.print("Random data points: ");
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (i < dataPoints.length - 1)
            {
                System.out.print(dataPoints[i] + " | ");
            }
            else
            {
                System.out.print(dataPoints[i]);
            }
        }
        System.out.println();

        int count = 0;

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == Input)
            {
                count++;
            }
        }

        if (count > 0)
        {
            System.out.println("The value " + Input + " was found " + count + " times in the array.");
        }
        else
        {
            System.out.println("The value " + Input + " was not found in the array.");
        }

        int newValue = SafeInput.getRangedInt(scanner, "Please enter a new integer between 1 and 100 to search for", 1, 100);

        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == newValue)
            {
                System.out.println("The value " + newValue + " was found at array index " + i + ".");
                found = true;
                break;
            }
        }

        if (!found)
        {
            System.out.println("The value " + newValue + " was not found in the array.");
        }

        int sum = 0;
        double average;

        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }

        average = (double) sum / dataPoints.length;

        System.out.println("The sum of the values in the array is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++)
        {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
    }

    public static double getAverage(int values[])
    {
        double sum = 0;

        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }

        return sum / values.length;
    }
}
