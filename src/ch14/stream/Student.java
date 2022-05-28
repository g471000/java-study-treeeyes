package ch14.stream;

class Student implements Comparable<Student> {

    String name;
    int numClass;
    int totalScore;



    Student(String name, int classNum, int totalScore) {
        this.name = name;
        this.numClass = classNum;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, numClass, totalScore);
    }

    String getName() {
        return name;
    }

    int getNumClass() {
        return numClass;
    }

    int getTotalScore() {
        return totalScore;
    }

    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
