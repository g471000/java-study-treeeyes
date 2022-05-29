package ch14.stream;

public class CSStudent {
    String name;
    boolean isMale;
    int year;
    int classNumber;
    int score;

    CSStudent(String name, boolean isMale, int year, int classNumber, int score) {
        this.name = name;
        this.isMale = isMale;
        this.year = year;
        this.classNumber = classNumber;
        this.score = score;
    }

    String getName() {
        return name;
    }

    boolean isMale() {
        return isMale;
    }

    int getYear() {
        return year;
    }

    int getClassNumber() {
        return classNumber;
    }

    int getScore() {
        return score;
    }

    public String toString() {
        return String.format("[%s, %b, %d-%d, Score: %3d]", name, isMale, year, classNumber, score);
    }

    enum Level {HIGH, MID, LOW,}
}
