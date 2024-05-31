package static2.ex;

import java.util.Arrays;

public class MathArrayUtils
{
    private MathArrayUtils(){

    }
    public static int sum(int[] values)
    {
        int sum = 0;
//        for (int i = 0; i < values.length; i++)
//            sum += values[i];
        for (int value : values)
            sum += value;
        return sum;
    }

    public static double average(int[] values)
    {
//        int sum = 0;
//        for (int value : values)
//            sum+=value;

        return (double) sum(values) / values.length;
    }

    public static int min(int[] values)
    {
        int min = values[0];
        for (int value : values)
        {
            if(value < min)
                min = value;
        }
        return min;
    }

    public static int max(int[] values)
    {
        int max = values[0];
        for (int value : values)
        {
            if(value > max)
                max = value;
        }
        return max;
    }


}
