package mdkni.svc.MandakiniService.ServiceInterface.impl;

import mdkni.svc.MandakiniService.ObjBean.Item;

import java.util.List;

public interface ItemServices {
    // Get Item byId
    public Item getItemById() ;


    // Get AllItemList
    public List<Item> getAllItem();

    // Get ItemByCategory
    public List<Item> getItemByCategory();

    // Get ItemByType
    public List<Item> getItemByType(String ItemType);

    // Get ItemListByOrderId
    public List<Item> getItemListByOrderId() ;
}
