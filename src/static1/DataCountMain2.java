package static1;

public class DataCountMain2
{
    public static void main(String[] args)
    {
        Counter c = new Counter();
        Data2 d1 = new Data2("A", c);
        System.out.println("A count=" + c.count);

        Data2 d2 = new Data2("B", c);
        System.out.println("B count=" + c.count);

        Data2 d3 = new Data2("C", c);
        System.out.println("C count=" + c.count);
    }
}
