package mdkni.svc.MandakiniService.Controller;

import mdkni.svc.MandakiniService.ObjBean.Item;
import mdkni.svc.MandakiniService.ObjBean.Product;
import mdkni.svc.MandakiniService.ObjBean.ProductCategory;
import mdkni.svc.MandakiniService.ServiceInterface.impl.ExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
    
    @RestController
    public class Mdkni_ServiceController {

        @Autowired
        private ExecutionService executionService;


        @GetMapping("/defaultView") //
        public List<Product>  getMostSearchedProduct() {
            return executionService.getMostSearchedProduct();
        }



        @GetMapping("/itemByPid")
        public List<Item> getItemByPid(@RequestParam(value = "pid") int pid)  {
            return executionService.getItemByPid(pid);
        }


        @GetMapping("/itemById")
        public List<Item> getItemById(@RequestParam(value = "id") int id) {
            return executionService.getItemById(id);
        }

        @GetMapping("/itemByName")
        public List<Item> getItemByName(@RequestParam(value = "nm")String nm) {
            return executionService.getItemByName(nm);
        }

        @GetMapping("/itemByCategory")
        public List<Item> getItemByCategory(@RequestParam(value = "ctgy")String ctgy) {
            return executionService.getItemByCategory(ctgy);
        }

        @GetMapping("/allProduct")
        public List<Product> getAllProductBy() {
            return executionService.getAllProductBy();
        }

        @GetMapping("/productByPCid")
        public List<Product> getProductByPCid(@RequestParam(value = "pcid") String pcid) {
            return executionService.getProductByPCid(pcid);
        }

        @GetMapping("/productByTag")
        public List<Product> getProductByTag(@RequestParam(value = "tags")String tags) {
            return executionService.getProductByTag(tags);
        }

        @GetMapping("/allProductCategory")
        public List<ProductCategory> getAllProductCategory() {

            return executionService.getAllProductCategory();
        }

        @GetMapping("/pingService")
        public String checkService() {
                return "success";
        }



    }

