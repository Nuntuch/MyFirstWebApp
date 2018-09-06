package sit.int303.first.jpa.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sit.int303.first.jpa.model.Employee;
import sit.int303.first.jpa.model.Orders;
import sit.int303.first.jpa.model.Payment;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-06T18:56:22")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Integer> customernumber;
    public static volatile SingularAttribute<Customer, String> country;
    public static volatile SingularAttribute<Customer, String> contactfirstname;
    public static volatile SingularAttribute<Customer, String> city;
    public static volatile SingularAttribute<Customer, String> contactlastname;
    public static volatile ListAttribute<Customer, Payment> paymentList;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, String> postalcode;
    public static volatile SingularAttribute<Customer, String> addressline2;
    public static volatile SingularAttribute<Customer, String> addressline1;
    public static volatile SingularAttribute<Customer, Employee> salesrepemployeenumber;
    public static volatile SingularAttribute<Customer, String> state;
    public static volatile SingularAttribute<Customer, String> customername;
    public static volatile SingularAttribute<Customer, BigDecimal> creditlimit;
    public static volatile ListAttribute<Customer, Orders> ordersList;

}