package ingsw.pdd.abstractfactory.ws;

import ingsw.pdd.abstractfactory.service.IProductsService;

public class ProductServiceWSImpl implements IProductsService {

    private static final String[] PRODUCTS = new String[]{"Soda", "Juice", "Fruit"};

    public String[] getProducts() {
        System.out.println("WebServices");
        return PRODUCTS;
    }
}