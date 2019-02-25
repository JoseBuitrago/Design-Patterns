package ingsw.pdd.factorymethod1;

import java.sql.SQLException;
import java.util.List;
import ingsw.pdd.factorymethod.dao.ProductDAO;
import ingsw.pdd.factorymethod.entity.Product;

public class FactoryMain {

    public static void main(String[] args) throws SQLException {
        //Creamos los nuevos productos a registrar
        Product productA = new Product(1L, "Product A", 100);
        Product productB = new Product(2L, "Product B", 100);
        
        //Creation of the DAO instance  
        ProductDAO productDAO = new ProductDAO();
        
        //Product persist  
        productDAO.saveProduct(productA);
        productDAO.saveProduct(productB);
        
        //Create the products  
        List<Product> products = productDAO.findAllProducts();
        System.out.println("Product size ==> " + products.size());
        for(Product product : products){
            System.out.println(product);
        }
    }
}
