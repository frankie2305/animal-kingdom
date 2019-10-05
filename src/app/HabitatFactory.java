package app;

public class HabitatFactory {

    private volatile static HabitatFactory uniqueHabitatFactory;

    private HabitatFactory() {}

    public static HabitatFactory getHabitatFactory() {
        if (uniqueHabitatFactory == null) {
            synchronized (HabitatFactory.class) {
                if (uniqueHabitatFactory == null) {
                    uniqueHabitatFactory = new HabitatFactory();
                }
            }
        }
        return uniqueHabitatFactory;
    }

    public Habitat createHabitat(String type, int x, int y) {
        if (type.equalsIgnoreCase("desert")) 
            return new Desert(x, y);
        if (type.equalsIgnoreCase("savannah")) 
            return new Savannah(x, y);
        if (type.equalsIgnoreCase("water")) 
            return new Water(x, y);
        if (type.equalsIgnoreCase("grassland"))
            return new Grassland(x, y);
        return null;
    }

}