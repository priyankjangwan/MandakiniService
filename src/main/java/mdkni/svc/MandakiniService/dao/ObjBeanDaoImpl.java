package mdkni.svc.MandakiniService.dao;

import mdkni.svc.MandakiniService.ObjBean.Item;
import mdkni.svc.MandakiniService.ObjBean.Product;
import mdkni.svc.MandakiniService.ObjBean.ProductCategory;
import mdkni.svc.MandakiniService.dao.impl.ObjBeanDao;
import mdkni.svc.MandakiniService.dao.rowMappers.RowMapperItem;
import mdkni.svc.MandakiniService.dao.rowMappers.RowMapperProduct;
import mdkni.svc.MandakiniService.dao.rowMappers.RowMapperProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ObjBeanDaoImpl implements ObjBeanDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Item>  getAllItem() {
        return jdbcTemplate.query("SELECT * FROM Item",new RowMapperItem());

    }

    @Override
    public List<Item> getItemByPid(int pid) {
        return jdbcTemplate.query("SELECT * FROM Item where pid=?",new Object[]{pid},new RowMapperItem());
    }

    @Override
    public List<Item> getItemById(int id) {
        return jdbcTemplate.query("SELECT * FROM Item where id=?",new Object[]{id}, new RowMapper<Item>() {
            @Override
            public Item mapRow(ResultSet resultSet, int i) throws SQLException {
                Item item = new Item();
                item.setId(resultSet.getInt(1));
                item.setPid(resultSet.getInt(2));
                item.setNm(resultSet.getString(3));
                item.setCtgy(resultSet.getString(4));
                item.setTags(resultSet.getString(5));
                item.setDesc(resultSet.getString(6));
                item.setMrp(resultSet.getDouble(7));
                item.setCdMrp(resultSet.getDouble(8));
                item.setCnt(resultSet.getInt(9));
                return item;
            }
        });
    }

    @Override
    public List<Item> getItemByName(String nm) {
        return jdbcTemplate.query("SELECT * FROM Item where nm=?",new Object[]{nm},new RowMapperItem());
    }

    @Override
    public List<Item> getItemByCategory(String ctgy) {
        return jdbcTemplate.query("SELECT * FROM Item where ctgy=?",new Object[]{ctgy},new RowMapperItem());
    }

    @Override
    public List<Product> getAllProductBy() {
        return jdbcTemplate.query("SELECT * FROM Product ",new RowMapperProduct());
    }

    @Override
    public List<Product> getProductByPCid(String pcid) {
        return jdbcTemplate.query("SELECT * FROM Product where pcid=? ",new Object[]{pcid},new RowMapperProduct());
    }

    @Override
    public List<Product> getProductByTag(String tags) {
        return jdbcTemplate.query("SELECT * FROM Product where tag=?",new Object[]{tags},new RowMapperProduct());
    }

    @Override
    public List<Product> getMostSearchedProduct() {
        return jdbcTemplate.query("SELECT * FROM Product ",new RowMapperProduct());
    }

    @Override
    public List<ProductCategory> getAllProductCategory() {
        return jdbcTemplate.query("SELECT * FROM productcategory ", new RowMapperProductCategory());
    }

}

/*
        return jdbcTemplate.query("SELECT * FROM Product", new ResultSetExtractor<List>() {
            public List extractData(ResultSet resultSetObj) throws SQLException, DataAccessException {
                List productList = new ArrayList();
                while(resultSetObj.next()) {
                    Product product = new Product();
                    product.setProductId(resultSetObj.getInt(1));
                    product.setProductName(resultSetObj.getString("ProductName"));

                    productList.add(product);
                }
                return productList;
            }
        });
*/