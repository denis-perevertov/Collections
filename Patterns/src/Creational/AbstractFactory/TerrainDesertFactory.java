package Creational.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class TerrainDesertFactory implements TerrainAbstractFactory {

    public List<Flora> floraObjects;
    public List<Fauna> faunaObjects;
    Ground sand;

    TerrainDesertFactory() {
        floraObjects = new ArrayList<>();
        faunaObjects = new ArrayList<>();
    }

    @Override
    public void createGround() {
        sand = new DesertSand();
        sand.compress();
    }

    @Override
    public void createFlora() {
        Flora aloe = new DesertAloe();
        Flora cactus = new DesertCactus();
        floraObjects.add(aloe);
        floraObjects.add(cactus);
    }

    @Override
    public void createFauna() {
        Fauna camel = new DesertCamel();
        Fauna snake = new DesertSnake();
        faunaObjects.add(camel);
        faunaObjects.add(snake);
    }

    public void getInfoOnTerrain() {

        System.out.println("Info on this desert: \n-----------\n");

        System.out.println("GROUND");
        System.out.println(sand.toString()+"\n");

        System.out.println("FLORA");
        for(Flora flora : floraObjects) {
            System.out.println(flora.toString());
        }
        System.out.println("");

        System.out.println("FAUNA");
        for(Fauna fauna : faunaObjects) {
            System.out.println(fauna.toString());
        }
        System.out.println("");
    }
}
