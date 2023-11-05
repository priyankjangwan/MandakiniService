package mdkni.svc.com.dao.rowMappers;

import mdkni.svc.com.ObjBean.Item;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperItem implements RowMapper<Item> {
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
}
