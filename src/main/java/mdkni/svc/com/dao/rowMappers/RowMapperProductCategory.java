package mdkni.svc.com.dao.rowMappers;

import mdkni.svc.com.ObjBean.ProductCategory;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperProductCategory implements RowMapper<ProductCategory> {
    @Override
    public ProductCategory mapRow(ResultSet resultSet, int i) throws SQLException {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setPcid(resultSet.getString(1));
        productCategory.setCtryNm(resultSet.getString(2));
        productCategory.setHref(resultSet.getString(3));
        productCategory.setDesc(resultSet.getString(4));
        return productCategory;
    }
}
