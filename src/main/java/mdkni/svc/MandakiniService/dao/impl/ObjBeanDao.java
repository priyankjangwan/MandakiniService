package mdkni.svc.MandakiniService.dao.impl;

import mdkni.svc.MandakiniService.ObjBean.Item;
import mdkni.svc.MandakiniService.ObjBean.Product;
import mdkni.svc.MandakiniService.ObjBean.ProductCategory;

import java.util.List;

public interface ObjBeanDao {
    // Item-------------------

    List<Item> getAllItem();
    List<Item> getItemByPid(int pid);
    List<Item> getItemById(int id);
    List<Item> getItemByName(String nm);
    List<Item> getItemByCategory(String ctgy);

    // Product-------------------
    List<Product> getAllProductBy();
    List<Product> getProductByPCid(String pcid); //pcid
    List<Product> getProductByTag(String tags);
    List<Product> getMostSearchedProduct();


    // ProductCategory-------------------
    List<ProductCategory> getAllProductCategory();

}