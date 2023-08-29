package mdkni.svc.MandakiniService;

import mdkni.svc.MandakiniService.ObjBean.ProductCategory;
import mdkni.svc.MandakiniService.ServiceInterface.impl.ExecutionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class MandakiniServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private ExecutionService executionService;

	@Test
	public void getAllProductCategory() {
		List<ProductCategory> productCategoryList = executionService.getAllProductCategory();
		System.out.println(productCategoryList.get(1).toString());
	}



}
