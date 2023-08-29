package mdkni.svc.MandakiniService.ServiceInterface.impl;

import mdkni.svc.MandakiniService.ObjBean.Item;
import mdkni.svc.MandakiniService.ObjBean.Product;
import mdkni.svc.MandakiniService.ObjBean.ProductCategory;

import java.util.List;

public interface ExecutionService{
    // Item-------------------

  public  List<Item> getAllItem();
    public   List<Item> getItemByPid(int pid);
    public List<Item> getItemById(int id);
    public List<Item> getItemByName(String nm);
    public List<Item> getItemByCategory(String ctgy);

    // Product-------------------
    public List<Product> getAllProductBy();
    public List<Product> getProductByPCid(String pcid); //pcid
    public List<Product> getProductByTag(String tags);
    public List<Product> getMostSearchedProduct();

    // ProductCategory-------------------
    public List<ProductCategory> getAllProductCategory();

}
