package mdkni.svc.com;

import mdkni.svc.com.ObjBean.ProductCategory;
import mdkni.svc.com.ServiceInterface.impl.ExecutionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ServiceApplicationTests {

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
