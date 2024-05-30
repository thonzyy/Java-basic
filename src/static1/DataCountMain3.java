package static1;

import memory.Data;

public class DataCountMain3
{
    public static void main(String[] args)
    {
        Data3 data1=new Data3("A");
        System.out.println("A count="+Data3.count);

        Data3 data2=new Data3("B");
        System.out.println("B count="+Data3.count);

        Data3 data3=new Data3("C");
        System.out.println("C count="+Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4=new Data3("D");
        System.out.println(data4.count);
        //인스턴스에 있는 것을 사용하는 것이 아니고 힙 영역에서 확인 후
        //메소드 영역의 변수를 사용
        //권장하지 않음.

        //클래스를 통한 접근
        System.out.println(Data3.count);
        //바로 힙영역으로 이동

    }


}
