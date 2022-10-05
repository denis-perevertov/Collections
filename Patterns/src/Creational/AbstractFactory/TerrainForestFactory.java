package Creational.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class TerrainForestFactory implements TerrainAbstractFactory {

    public List<Flora> floraObjects;
    public List<Fauna> faunaObjects;
    Ground dirt;

    TerrainForestFactory() {
        floraObjects = new ArrayList<>();
        faunaObjects = new ArrayList<>();
    }
    @Override
    public void createGround() {
        dirt = new ForestDirt();
        dirt.compress();
    }

    @Override
    public void createFlora() {
        Flora tree = new ForestTree();
        Flora bush = new ForestBush();
        floraObjects.add(tree);
        floraObjects.add(bush);
    }

    @Override
    public void createFauna() {
        Fauna bear = new ForestBear();
        Fauna wolf = new ForestWolf();
        faunaObjects.add(bear);
        faunaObjects.add(wolf);
    }

    public void getInfoOnTerrain() {

        System.out.println("Info on this forest: \n-----------\n");

        System.out.println("GROUND");
        System.out.println(dirt.toString()+"\n");

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
