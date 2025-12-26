package week7;


public class GradeCalculator {

    public static double calculateAverage(int[] grades) {
        if (grades.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Optional main for testing
    public static void main(String[] args) {
        int[] grades = {80, 85, 90};
        System.out.println("Average Grade: " + calculateAverage(grades));
    }
}
