package ch06.Exercise;

import org.w3c.dom.ls.LSOutput;

public class Student {
    String name;
    int classNum;
    int studentNum;
    int korScore;
    int engScore;
    int mathScore;

    Student() {
        this("pikachu", 1, 1, 0, 0, 0);
    }

    Student(String name, int classNum, int studentNum, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.classNum = classNum;
        this.studentNum = studentNum;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public int getTotal() {
        return korScore + engScore + mathScore;
    }

    public double getAverage() {
        return (int)(getTotal() / 3.0 * 10 + 0.5) / 10.0;
    }
}
