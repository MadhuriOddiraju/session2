import java.util.Date;

public class User
{
public User() {
super();
this.userId = userId;
this.userPassword = userPassword;
this.userName = userName;
this.userRole = userRole;
this.userCreation = userCreation;
this.isUserActive = isUserActive;
}
int userId;
String userPassword;
String userName;
String userRole;
String userCreation;
boolean isUserActive;

@Override
public String toString() {
return "User [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName + ", userRole="
+ userRole + ", userCreation=" + userCreation + ", isUserActive=" + isUserActive + "]";
}

}