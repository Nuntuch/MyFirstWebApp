/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sit.int303.mockup.model.Product;

/**
 *
 * @author INT303
 */
public class ShoppingCart implements Serializable {

    private Map<String, LineItem> cart;
//    private Map<คีย์product,LineItem> cart;

    public ShoppingCart() {
        cart = new HashMap();
    }

    public void add(Product p) {
        LineItem line = cart.get(p.getProductCode());

        if (line == null) {//ถ้ายังไม่มีให้new objสินค้าขึ้นมาใหม่
            cart.put(p.getProductCode(), new LineItem(p));
        } else {
            line.setQuantity(line.getQuantity() + 1);

        }
    }

    public void removed(Product p) { //รับ p มา
        this.cart.remove(p.getProductCode()); //ดึงProductCodeออกมาจากp แล้วส่งไปเมตตอดล่าง
    }

    public void removed(String productCode) {
        cart.remove(productCode);
//     .removed คือฟังก์ชั่นลบชองMap
    }

    public double getTotalPrice() {

        double sum = 0;
        Collection<LineItem> lineItems = cart.values();
        for (LineItem lineItem : lineItems) {
            sum += lineItem.getTotalPrice();
        }

        return sum;
    }

    public int getTotalQuantity() {

        int sum = 0;
        Collection<LineItem> lineItems = cart.values();

        for (LineItem lineItem : lineItems) {
            sum += lineItem.getQuantity();
        }

        return sum;
    }

    public List<LineItem> getLineItems() {
        return new ArrayList(cart.values());

    }

}
