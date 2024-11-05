package lecture;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double sumGrades = 0;
        int poorGradesCount = 0;

        int year = 1;

        while (year <= 12) {

            if (poorGradesCount > 1) {
                break;
            }

            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                poorGradesCount++;
                continue;
            }
            sumGrades = sumGrades + grade;

            year++;
        }

        if (poorGradesCount > 1) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            double avgGrade = sumGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
        }
    }
}
