package poly.ex1;


public class AbstarctMain
{
    public static void main(String[] args)
    {
        //추상클래스와 추상메소드는 제약이 추가된 것이다.
        // 좋은 프로그램은 제약이 추가된. 실수를 막기 위해
        //추상적인 클래스를 생성 못 하게 -> 다형적 참조를 위한 클래스를 생성하는 경우
        // 필요한 불완전 클래스를 만들게끔 -> 실수로 필요한 메소드를 오바라이딩 하지 않을 경우
        //AbstractAnimal animal = new AbstractAnimal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(dog);

        moveAnimal(cat);
        moveAnimal(caw);
        moveAnimal(dog);

    }

    private static void soundAnimal(AbstractAnimal animal)
    {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal)
    {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
