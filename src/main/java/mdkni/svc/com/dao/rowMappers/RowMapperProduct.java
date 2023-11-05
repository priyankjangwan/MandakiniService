package mdkni.svc.com.dao.rowMappers;

import mdkni.svc.com.ObjBean.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperProduct implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setPid(resultSet.getInt(1));
        product.setPcid(resultSet.getString(2));
        product.setPrdtNm(resultSet.getString(4));
        product.setBrand(resultSet.getString(5));
        product.setDesc(resultSet.getString(6));
        product.setTag(resultSet.getString(7));
        return product;
    }
}
