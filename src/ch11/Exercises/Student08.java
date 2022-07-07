package ch11.Exercises;

class Student08 implements Comparable {
    String name;
    int numClass;
    int num;
    int kor, eng, math;

    int total;
    int schoolRank;

    Student08(String name, int numClass, int num, int kor, int eng, int math) {
        this.name = name;
        this.numClass = numClass;
        this.num = num;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total = getTotal();
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
        if (o instanceof Student08) {
            Student08 tmp = (Student08) o;
            return tmp.getTotal() - this.getTotal();
        }
        return -1;
    }
}
