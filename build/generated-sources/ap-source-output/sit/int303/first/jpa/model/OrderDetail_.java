package sit.int303.first.jpa.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sit.int303.first.jpa.model.OrderDetailPK;
import sit.int303.first.jpa.model.Orders;
import sit.int303.first.jpa.model.Product;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-06T18:56:22")
@StaticMetamodel(OrderDetail.class)
public class OrderDetail_ { 

    public static volatile SingularAttribute<OrderDetail, Product> product;
    public static volatile SingularAttribute<OrderDetail, BigDecimal> priceeach;
    public static volatile SingularAttribute<OrderDetail, Orders> orders;
    public static volatile SingularAttribute<OrderDetail, Short> orderlinenumber;
    public static volatile SingularAttribute<OrderDetail, Integer> quantityordered;
    public static volatile SingularAttribute<OrderDetail, OrderDetailPK> orderDetailPK;

}