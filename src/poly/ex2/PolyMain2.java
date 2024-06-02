package poly.ex2;

public class PolyMain2
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();
        Duck duck = new Duck();
        //애니멀 배열로
        Animal[] animalArr = {dog,cat,caw,duck};

        //변하지 않는 부분
        for (Animal animal : animalArr)
        {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }

}
