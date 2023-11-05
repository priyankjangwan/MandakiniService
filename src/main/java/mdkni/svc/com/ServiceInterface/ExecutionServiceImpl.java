package mdkni.svc.com.ServiceInterface;

import mdkni.svc.com.ObjBean.Item;
import mdkni.svc.com.ObjBean.Product;
import mdkni.svc.com.ObjBean.ProductCategory;
import mdkni.svc.com.ServiceInterface.impl.ExecutionService;
import mdkni.svc.com.dao.ObjBeanDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ExecutionServiceImpl implements ExecutionService {

    @Autowired
    public ObjBeanDaoImpl objBeanDao;


    @Override
    public List<Item> getAllItem() {
        List<Item> itemList = objBeanDao.getAllItem();
        return itemList;
    }

    @Override
    public List<Item> getItemByPid(int pid) {
        return objBeanDao.getItemByPid(pid);
    }

    @Override
    public List<Item> getItemById(int id) {

        return objBeanDao.getItemById(id);
    }

    @Override
    public List<Item> getItemByName(String nm) {
        return objBeanDao.getItemByName(nm);
    }

    @Override
    public List<Item> getItemByCategory(String ctgy) {

        return objBeanDao.getItemByCategory(ctgy);
    }

    @Override
    public List<Product> getAllProductBy() {

        return objBeanDao.getAllProductBy();
    }

    @Override
    public List<Product> getProductByPCid(String pcid) {
        return objBeanDao.getProductByPCid(pcid);
    }

    @Override
    public List<Product> getProductByTag(String tags) {

        return objBeanDao.getProductByTag(tags);
    }

    @Override
    public List<Product> getMostSearchedProduct() {
        return objBeanDao.getMostSearchedProduct();
    }

    @Override
    public List<ProductCategory> getAllProductCategory() {
        return objBeanDao.getAllProductCategory();
    }
}
