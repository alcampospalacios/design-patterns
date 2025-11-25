package com.kreitek.pets.controllers;

import java.util.List;

import com.kreitek.pets.Controller;
import com.kreitek.pets.domain.Dog;
import com.kreitek.pets.infraestructure.bd.DbService;
import com.kreitek.pets.infraestructure.logger.LoggerService;

public class DogController implements Controller {

    private static final LoggerService logger = LoggerService.getInstance();

    public String executePut(String petName, String ownerName, String telephone) {
        logger.debug("DogController.executePut " + petName + "," + ownerName + "," + telephone); // TODO Changed
        Dog dog = new Dog(petName, ownerName, telephone);
        DbService dbService = DbService.getInstance();
        dbService.addNewDog(dog);
        return "New dog has been added";
    }

    @Override
    public String executeGet() {
        logger.debug("DogController.executeGet DOGS"); // TODO Changed
        DbService dbService = DbService.getInstance();
        List<Dog> dogs = dbService.getDogs();
        String response = "";
        for (Dog dog:dogs) {
            response += dog.toString() + "\r\n";
        }
        return response;
    }
}
