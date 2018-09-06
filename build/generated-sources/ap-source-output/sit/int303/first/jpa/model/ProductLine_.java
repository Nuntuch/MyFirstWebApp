package sit.int303.first.jpa.model;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sit.int303.first.jpa.model.Product;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-06T18:56:22")
@StaticMetamodel(ProductLine.class)
public class ProductLine_ { 

    public static volatile SingularAttribute<ProductLine, String> productline;
    public static volatile SingularAttribute<ProductLine, Serializable> image;
    public static volatile SingularAttribute<ProductLine, String> htmldescription;
    public static volatile SingularAttribute<ProductLine, String> textdescription;
    public static volatile ListAttribute<ProductLine, Product> productList;

}