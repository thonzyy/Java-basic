package access.ex;

public class MaxCountMain
{
    public static void main(String[] args)
    {
        MaxCounter mc=new MaxCounter(3);
        mc.increment();
        mc.increment();
        mc.increment();
        mc.increment();
        int count=mc.getCount();
        System.out.println(count);
    }
}
