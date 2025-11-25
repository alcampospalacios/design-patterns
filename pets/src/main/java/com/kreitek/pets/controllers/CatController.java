package com.kreitek.pets.controllers;

import java.util.List;

import com.kreitek.pets.Controller;
import com.kreitek.pets.domain.Cat;
import com.kreitek.pets.infraestructure.bd.DbService;
import com.kreitek.pets.infraestructure.logger.LoggerService;

public class CatController implements Controller {

    private static final LoggerService logger = LoggerService.getInstance();

    @Override
    public String executePut(String petName, String ownerName, String telephone) {
        logger.debug("CatController.executePut " + petName + "," + ownerName + "," + telephone); // TODO Changed
        Cat cat = new Cat(petName, ownerName, telephone);
        DbService dbService = DbService.getInstance();
        dbService.addNewCat(cat);
        return "New cat has been added";
    }

    @Override
    public String executeGet() {
       logger.debug("CatController.executeGet CATS"); // TODO Changed
        DbService dbService = DbService.getInstance();
        List<Cat> cats = dbService.getCats();
        String response = "";
        for (Cat cat:cats) {
            response += cat.toString() + "\r\n";
        }
        return response;
    }
}
