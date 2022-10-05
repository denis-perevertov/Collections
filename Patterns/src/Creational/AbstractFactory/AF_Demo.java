package Creational.AbstractFactory;

public class AF_Demo {

    public static void main(String[] args) {

        TerrainAbstractFactory factory;

        factory = new TerrainDesertFactory();

        createTerrain(factory);

        factory.getInfoOnTerrain();

        factory = new TerrainForestFactory();

        createTerrain(factory);

        factory.getInfoOnTerrain();

    }

    public static void createTerrain(TerrainAbstractFactory factory) {

        factory.createFlora();
        factory.createFauna();
        factory.createGround();

    }

}
