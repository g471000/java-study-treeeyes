package ch11.Exercises;

class Student05 implements Comparable {
    String name;
    int numClass;
    int num;
    int kor, eng, math;

    Student05(String name, int numClass, int num, int kor, int eng, int math) {
        this.name = name;
        this.numClass = numClass;
        this.num = num;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.1) / 10f;
    }

    public String toString() {
        return name + ", " + numClass + ", " + num + ", " + kor + ", " + eng + ", " + math;
    }

    public int compareTo(Object o) {
        if (o instanceof Student05) {
            Student05 tmp = (Student05) o;
            return name.compareTo(tmp.name);
        }
        return -1;
    }
}
