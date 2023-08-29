package mdkni.svc.MandakiniService.ObjBean;

/**
 * Defines individual items.
 * Example : Staples :  Rice & Rice Products : "Daawat 2Kg Basmati"
 */


public class Item {

    private int id; //10001
    private int pid; //1001 :  From Product ID
    private String nm; //Name TajMahalTea
    private String ctgy; //Category > Grocery    ,DailyNeed
    private String tags;     // Type > Tea /Oil / fastFood :
    private String desc;  // 100 Gm Taj Mahal Tea
    private double mrp;  // 40 Rs
    private double cdMrp; // Special price, promo code
    private int cnt; // available count : 10 remaining

    public Item(int id, String nm) {
        this.id = id;
        this.nm = nm;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getCtgy() {
        return ctgy;
    }

    public void setCtgy(String ctgy) {
        this.ctgy = ctgy;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tp) {
        this.tags = tp;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getMrp() {
        return mrp;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public double getCdMrp() {
        return cdMrp;
    }

    public void setCdMrp(double cdMrp) {
        this.cdMrp = cdMrp;
    }
}

// insert into items values (1001,1001,'chana daal','Groceries','X','Chana daal 1 Kg',22,20,10);