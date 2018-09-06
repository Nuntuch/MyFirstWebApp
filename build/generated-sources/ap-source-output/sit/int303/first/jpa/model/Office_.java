package sit.int303.first.jpa.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sit.int303.first.jpa.model.Employee;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-06T18:56:22")
@StaticMetamodel(Office.class)
public class Office_ { 

    public static volatile SingularAttribute<Office, String> country;
    public static volatile ListAttribute<Office, Employee> employeeList;
    public static volatile SingularAttribute<Office, String> city;
    public static volatile SingularAttribute<Office, String> phone;
    public static volatile SingularAttribute<Office, String> postalcode;
    public static volatile SingularAttribute<Office, String> officecode;
    public static volatile SingularAttribute<Office, String> addressline2;
    public static volatile SingularAttribute<Office, String> addressline1;
    public static volatile SingularAttribute<Office, String> state;
    public static volatile SingularAttribute<Office, String> territory;

}