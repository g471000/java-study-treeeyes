package ch11.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex08 {
    public static void main(String[] args) {
            ArrayList list = new ArrayList();
            list.add(new Student08("이자바",2,1,70,90,70));
            list.add(new Student08("안자바",2,2,60,100,80));
            list.add(new Student08("홍길동",1,3,100,100,100));
            list.add(new Student08("남궁성",1,1,90,70,80));
            list.add(new Student08("김자바",1,2,80,80,90));
            calculateSchoolRank(list);
            Iterator it = list.iterator();
            while(it.hasNext())
                System.out.println(it.next());
    }

    public static void calculateSchoolRank(List list) {
        Collections.sort(list);

        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();

        for (int i = 0; i < list.size(); i++) {
            Student08 s = (Student08) list.get(i);

            if (s.getTotal() == prevTotal) {
                s.schoolRank = prevRank;
            } else {
                s.schoolRank = i + 1;

                prevRank = s.schoolRank;
                prevTotal = s.total;
            }
        }
    }
}
