package ru.ivanov.java.basic.homeworks;

public class Application {
    public static void main(String[] args) {
        Man man = new Man("Валера", 10);
        man.info();
        Transport car = new Car("машинка", 50);
        Transport offRoader = new OffRoader("вездеход", 100);
        Transport bike = new Bicycle("велосипед");
        Transport horse = new Horse("лошадь", 100);
        man.info();
        System.out.println(man.move(10, TerrainTypes.равнина));
        man.info();
        man.setCurrentTransport(car);
        man.info();
        car.info();
        System.out.println(man.move(100, TerrainTypes.болото));
        System.out.println(man.move(10, TerrainTypes.равнина));
        car.info();
        man.setCurrentTransport(offRoader);
        System.out.println(man.move(10, TerrainTypes.болото));
        offRoader.info();
        man.setCurrentTransport(bike);
        System.out.println(man.move(10, TerrainTypes.болото));
        System.out.println(man.move(10, TerrainTypes.густой_лес));
        man.setCurrentTransport(horse);
        System.out.println(man.move(10, TerrainTypes.болото));
        System.out.println(man.move(100, TerrainTypes.равнина));
        horse.info();


    }
}
