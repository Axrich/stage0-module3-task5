package lang.print.gaps.task5;

public class TimeConvertor {
       public void convert(float minutes) {
        float second = minutes * 60;
        System.out.println(second);

    }

    public static void main(String[] args) {
        TimeConvertor timeConvertor = new TimeConvertor();
        timeConvertor.convert(2);
    }
}
