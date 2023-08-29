package mdkni.svc.MandakiniService.ObjBean;

/**
 * Defines unique Product : TootPaste , Tea
 * Example : Staples :  "Rice & Rice Products"
 */
public class Product {

    private int pid;
    private String pcid; // Multiple pcid , PC01,PC02  ?
    //private String ctrySet; // (Groceries,Rice , Basmati) : Product Can have more than 1 Category
    private String prdtNm; // Channa Daal, Tour Daal
    private String brand; // Britania, ParleG
    private String desc;  //
    private String tag; // Search tag #daal , peeli daal
    private String href; //Prodcut Image

    public Product() {

    }

    public Product(int pid, String prdtNm, String href) {
        this.pid = pid;
        this.prdtNm = prdtNm;
        this.href = href;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPcid() {
        return pcid;
    }

    public void setPcid(String pcid) {
        this.pcid = pcid;
    }

    public String getPrdtNm() {
        return prdtNm;
    }

    public void setPrdtNm(String prdtNm) {
        this.prdtNm = prdtNm;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }


}

/*
insert into product values (1001, 'PC01','Groceries','Channa Daal','local','Channa Daal local','daal','chana.png');


 */