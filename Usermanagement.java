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

import java.util.Date;import exceptionHandling.BadFormatException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;import exceptionHandling.BadFormatException;public class UserManager {
Scanner sc = new Scanner(System.in); Map<Integer, User> obj = new HashMap();
User u1 = new User();// UserManager u2 = new Use rManager();
public void createNewUser() throws UserAlreadyExistExceptioin {// throws UserAlreadyExistExceptioin {
// User u1 = new User();
for(int i=0;i<2;i++)
{
try{
System.out.println("enter the user Id:");
u1.userId = sc.nextInt();
if (isUserExists(u1.userId)) {
System.out.println(" user alreay exists:");
throw new UserAlreadyExistExceptioin("");
}
}
catch(UserAlreadyExistExceptioin u) {
//throw new UserAlreadyExistExceptioin("")
return ;
}
try{
System.out.println("enter the user Password:");
u1.userPassword = sc.next();
System.out.println("enter the user name: ");
u1.userName = sc.next();
System.out.println("enter the user Role: ");
u1.userRole = sc.next();
System.out.println("enter the user created date: ");
u1.userCreation = (new Date()).toString();
System.out.println("enter the is user active: ");
u1.isUserActive = sc.nextBoolean();
}
catch (InputMismatchException e) {
System.out.println(" please write input match data: ");
}
//
obj.put(u1.userId, u1);
System.out.println(obj);
}
}
public boolean isUserExists(int userId) {
return obj.containsKey(userId);
} public void printDetails() {
System.out.println(u1.userId + " " + u1.userPassword + " " + u1.userName + " " + u1.userRole + " "
+ u1.userCreation + " " + u1.isUserActive);
} public User getUserById() throws BadFormatException { System.out.println("enter the user id: ");int userId1 = sc.nextInt();


try {
if (u1.userId == userId1) {
System.out.println("access allowed");
printDetails();
}
else {
throw new Exception();
}
}
catch(Exception e) {
System.out.println("program Terminated");
System.out.println("Input miss match");
return null;
}
return u1;
}
public boolean updateUserById()
{
System.out.println("enter the UserId");
try
{
int userId2=sc.nextInt();
if (u1.userId == userId2) {
System.out.println("access allowed");
System.out.println("enter the details u want to add below");
String gender = sc.next();
}
else {
throw new Exception();
}
}catch(Exception e) {
System.out.println("program Terminated");
System.out.println("Input miss match");
return false;
}
return true;
}
}

import exceptionHandling.BadFormatException;public class UserManagementModule
{
public static void main(String[] args) throws UserAlreadyExistExceptioin,BadFormatException
{
UserManager u = new UserManager();
u.createNewUser();
u.getUserById();
u.updateUserById();
}
}

