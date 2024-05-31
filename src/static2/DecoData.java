package static2;

public class DecoData
{
    private int instanceValue;
    private static int staticValue;

    public static void staticCall()
    {
        //instanceValue++;
        //instanceMethod(); 인스턴스 변수와 메소드는 접근 불가
        staticValue++;//정적 변수 접근
        staticMethod();//정적 메소드 접근
    }

    public static void staticCall(DecoData data)
    {
        data.instanceValue++;
        data.instanceMethod();
        staticValue++;//정적 변수 접근
        staticMethod();//정적 메소드 접근
    }

    public void instanceCall()
    {
        instanceValue++;
        instanceMethod();

        DecoData.staticValue++;//자기 클래스이기 때문에 생략가능 클래스명
        DecoData.staticMethod();
    }

    private void instanceMethod()
    {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod()
    {
        System.out.println("staticValue=" + staticValue);
    }
}
