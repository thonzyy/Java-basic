package static2;

import static static2.DecoData.*;

public class DecoDataMain
{
    public static void main(String[] args)
    {
        System.out.println("1. 정적 호출");
        staticCall();// 클래스에서 바로 접근해서 사용하기 때문에 인스턴스의 참조값이 없어서
        //인스턴스 변수나 메소드를 사용할 수 없다.
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();


        System.out.println("2. 인스턴스 호출1");
        DecoData d1= new DecoData();
        d1.instanceCall();
        //static method에 참조값을 넘겨주면 사용이 가능하다.
        staticCall(d1);

        System.out.println("2. 인스턴스 호출2");
        DecoData d2= new DecoData();
        d2.instanceCall();

        System.out.println("2. 인스턴스 호출3");
        DecoData d3= new DecoData();

        d3.staticCall();
        staticCall();
        d3.instanceCall();
    }
}
