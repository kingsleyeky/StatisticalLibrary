import java.util.ArrayList;
import java.util.Collections;

/**
 * Library of Statistical Calculations.
 * Includes functions for finding the minimum value, maximum value, median value, and mean.
 */
public class StatisticalLibrary {

    /**
     * Calculates the mean of the given Array list.
     * @param values List of double values.
     * @param min Minimum value to consider when cutOff is true.
     * @param cutOff If true, only values greater than or equal to the minimum are evaluated.
     * @return The mean of the values.
     */
    public static double calculateTheMean(ArrayList<Double> values, double min, boolean cutOff) {
        double sum = 0;
        int count = 0;
        for (double value : values) {
            if (cutOff) {
                if (value >= min) {
                    sum += value;
                    count++;
                }
            } else {
                sum += value;
                count++;
            }
        }
        return sum / count;
    }

    /**
     * Calculates the median of the given Array list.
     * @param values List of double values.
     * @return The median value.
     */
    public static double calculateTheMedian(ArrayList<Double> values) {
        double median;
        Collections.sort(values);
        if (values.size() % 2 == 1) {
            median = values.get(values.size() / 2);
        } else {
            median = (values.get((values.size() / 2) - 1) + values.get(values.size() / 2)) / 2;
        }
        return median;
    }

    /**
     * Finds the minimum value from the Array list.
     * @param values List of double values.
     * @return The minimum value.
     */
    public static double findMinValue(ArrayList<Double> values) {
        double min = values.get(0);
        for (double value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    /**
     * Finds the maximum value from the Array list.
     * @param values List of double values.
     * @return The maximum value.
     */
    public static double findMaxValue(ArrayList<Double> values) {
        double max = values.get(0);
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Double> data = new ArrayList<>();
        Collections.addAll(data, 25.5, 29.4, 36.7, 43.1, 57.9, 88.3, 99.9, 100.0);

        System.out.println("Mean: " + calculateTheMean(data, 0, true));
        System.out.println("Median: " + calculateTheMedian(data));
        System.out.println("Min: " + findMinValue(data));
        System.out.println("Max: " + findMaxValue(data));
    }
}
