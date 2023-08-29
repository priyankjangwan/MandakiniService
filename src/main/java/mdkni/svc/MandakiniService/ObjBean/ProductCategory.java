package mdkni.svc.MandakiniService.ObjBean;

/**
 * Defines unique category for products
 * :Grocery : Fruits & Vegetables,DailyNeed,Bakery , Dairy ,Staples
 * Example : "Staples" : Product
 * <p>
 * insert into table productcategory ('PC01','Grocery','Grocery.png','Grocery Item');
 */
public class ProductCategory {

    private String pcid; // PC01
    private String ctryNm; //Staples , Dairy & Baikry , Fruits & Veg
    private String href; // image :- only jpg fileName to be store
    private String desc;

    public ProductCategory() {

    }

    public ProductCategory(String pcid, String ctryNm) {
        this.pcid = pcid;
        this.ctryNm = ctryNm;
    }

    public String getPcid() {
        return pcid;
    }

    public void setPcid(String pcid) {
        this.pcid = pcid;
    }

    public String getCtryNm() {
        return ctryNm;
    }

    public void setCtryNm(String ctryNm) {
        this.ctryNm = ctryNm;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "pcid='" + pcid + '\'' +
                ", ctryNm='" + ctryNm + '\'' +
                ", href='" + href + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
