package au.com.digitary.userdata.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-27T06:24:36")
@StaticMetamodel(UserData.class)
public class UserData_ { 

    public static volatile SingularAttribute<UserData, String> lastName;
    public static volatile SingularAttribute<UserData, String> country;
    public static volatile SingularAttribute<UserData, String> town;
    public static volatile SingularAttribute<UserData, String> postalCode;
    public static volatile SingularAttribute<UserData, Integer> phoneNumber1;
    public static volatile SingularAttribute<UserData, Integer> phoneNumber2;
    public static volatile SingularAttribute<UserData, Integer> phoneNumber3;
    public static volatile SingularAttribute<UserData, String> firstName;
    public static volatile SingularAttribute<UserData, Date> receivedTime;
    public static volatile SingularAttribute<UserData, String> addressLine1;
    public static volatile SingularAttribute<UserData, String> addressLine2;
    public static volatile SingularAttribute<UserData, Integer> id;
    public static volatile SingularAttribute<UserData, String> email;

}