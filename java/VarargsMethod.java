void main() {
    int averageGrade = getAverageGrade(98, 99, 97, 98, 95, 96, 92);
    IO.println("Average Grades: " + averageGrade);
}

// Variable-length Arguments (varargs) - Makes method accept varying amount of arguments
// No need for overloading like this one:
int getAverageGrade(double firstGrade) {
    return (int) Math.round(firstGrade);
}

int getAverageGrade(double firstGrade, double secondGrade) {
    return (int) Math.round((firstGrade + secondGrade) / 2.0);
}

int getAverageGrade(double firstGrade, double secondGrade, double thirdGrade) {
    return (int) Math.round((firstGrade + secondGrade + thirdGrade) / 3.0);
}

// Instead, you can just use varargs to accept any # of argument:
// Java will turn the arguments into an array like this:
int getAverageGrade(double... grades) {
    double averageGrade = 0;
    for (double grade : grades) {
        averageGrade += grade;
    }
    return (int) Math.round(averageGrade / grades.length);
}
