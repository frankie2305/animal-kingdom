package app;

public class AnimalFactory {
    
    private volatile static AnimalFactory uniqueAnimalFactory;

    private AnimalFactory() {}

    public static AnimalFactory getAnimalFactory() {
        if (uniqueAnimalFactory == null) {
            synchronized (AnimalFactory.class) {
                if (uniqueAnimalFactory == null) {
                    uniqueAnimalFactory = new AnimalFactory();
                }
            }
        }
        return uniqueAnimalFactory;
    }

    public Animal createAnimal(String type, Habitat location) {
        if (type.equalsIgnoreCase("jackal")) 
            return new Jackal(location);
        if (type.equalsIgnoreCase("lion")) 
            return new Lion(location);
        if (type.equalsIgnoreCase("rabbit")) 
            return new Rabbit(location);
        if (type.equalsIgnoreCase("fish"))
            return new Fish(location);
        return null;
    }

}