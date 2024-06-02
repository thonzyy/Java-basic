package poly.ex2;

public class PolyMain1
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();
        Duck duck = new Duck();
     /*   Animal dog = new Dog();
        Animal caw = new Caw();
        Animal cat = new Cat();*/
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }
    private static void soundAnimal(Animal animal)
    {//각각의 기능을 메소드 오버라이딩으로 호출
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
