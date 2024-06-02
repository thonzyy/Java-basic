package poly.ex1;

public class Caw extends AbstractAnimal
{
    @Override
    public void sound()
    {
        System.out.println("음메");
    }

    @Override
    public void move()
    {
        System.out.println("소가 이동합니다.");
    }
}
