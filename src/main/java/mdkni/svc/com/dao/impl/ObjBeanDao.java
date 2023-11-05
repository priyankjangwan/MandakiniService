package mdkni.svc.com.dao.impl;

import mdkni.svc.com.ObjBean.Item;
import mdkni.svc.com.ObjBean.Product;
import mdkni.svc.com.ObjBean.ProductCategory;

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