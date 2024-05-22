package access.ex;

public class MaxCounter
{
    private int count=0;
    private int max;
    public MaxCounter(int max)
    {
        this.max = max;
    }
    public void increment()
    {
        //검증 로직
        if (count>=max )
        {
            System.out.println("최대값을 초과할 수 없습니다.");
            return; //return을 해서 날리는 조건 , 명확하게 분기
        }
        //실행 로직
        count++;
    }

//    private boolean isCountVaild()
//    {
//        return max > count ;
//    }

    public int getCount(){
        return count;
    }
}
