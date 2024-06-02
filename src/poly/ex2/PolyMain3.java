package poly.ex2;

public class PolyMain3
{
    public static void main(String[] args)
    {
        //애니멀 배열로
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};

        //변하지 않는 부분
        for (Animal animal : animalArr)
            soundAnimal(animal);
    }
    //변하지 않는 부분
    private static void soundAnimal(Animal animal)
    {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
