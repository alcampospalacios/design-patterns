package com.kreitek.pets.infraestructure.bd;

import java.util.ArrayList;
import java.util.List;

import com.kreitek.pets.domain.Cat;
import com.kreitek.pets.domain.Dog;
import com.kreitek.pets.infraestructure.logger.LoggerService;

public class DbService {
    private static volatile DbService instance = null;
    private static final LoggerService logger = LoggerService.getInstance(); // TODO Changed
    
    private List<Cat> cats = new ArrayList<>();
    private List<Dog> dogs = new ArrayList<>();

    private DbService() {
        if (instance != null) {
            throw new RuntimeException("Usage getInstance() method to create");
        }
    }

    public static DbService getInstance() {
        if (instance == null) {
            synchronized(DbService.class) {
                if (instance == null) {
                    instance = new DbService();
                }
            }
        }
        return instance;
    }

    public void addNewDog(Dog dog) {
        dogs.add(dog);
        logger.debug("BdService.Dog added"); // TODO Changed
    }
    public void addNewCat(Cat cat) {
        cats.add(cat);
        logger.debug("BdService.Cat added"); // TODO Changed
    }

    public List<Cat> getCats() {
        logger.debug("BdService.Get " + cats.size() + " cats"); // TODO Changed
        return new ArrayList<>(cats);
    }

    public List<Dog> getDogs() {
        logger.debug("BdService.Get " + cats.size() + " dogs"); // TODO Changed
        return new ArrayList<>(dogs);
    }
}
