import java.util.Scanner;
import java.util.ArrayList;
class User{
    private String userName;
    private String userMail;
    private int password;
    private long contactNumber;
    private String address;

    public void setUserName(String name){
        this.userName = name;
    }
    public void setUserMail(String mail){
        this.userMail = mail;
    }
    public void setPassword(int password){
        this.password = password;
    }
    public void setContactNumber(long contactNumber){
        this.contactNumber = contactNumber;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getUserName(){
        return userName;
    }
    public String getUserMail(){
        return userMail;
    }
    public int getPassword(){
        return password;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public String getAddress(){
        return address;
    }
}

class login {
    User one = new User();
    Scanner sc = new Scanner(System.in);


    int count = 0;
    String[] user_arr = new String[20];
    int[] user_pass = new int[20];
    String[] user_address = new String[20];
    long[] user_contact = new long[20];
    String[] user_mail = new String[20];
    int check = 0;

    public void validate(){
        System.out.println("Please enter your username:");
        String userName = sc.next();
        System.out.println("Please enter your password:");
        int password = sc.nextInt();
        for(int i=0;i<=count;i++){
            if(userName.equals(user_arr[i]) && password == user_pass[i]){
                check++;
            }
        }
        if((userName.equals("bhado")) && password == 97274 || check>=1){
            System.out.println("Verifying.....");
            System.out.println("logged in sucessfully!!");
        }
        else{
            System.out.println("username or password invalid");
        }
    }
    public void sign_up(){
        System.out.println("Enter username");
        one.setUserName(sc.next());
        System.out.println("Enetr password:");
        one.setPassword(sc.nextInt());
        System.out.println("Enter Address:");
        one.setAddress(sc.next());
        System.out.println("Enter Contact No.:");
        one.setContactNumber(sc.nextLong());
        System.out.println("Enter Emaid_id:");
        one.setUserMail(sc.next());

        System.out.println("this detail is saved..");
        System.out.println(one.getUserName());
        user_arr[count] = one.getUserName();
        System.out.println(one.getUserMail());
        user_mail[count] = one.getUserMail();
        System.out.println(one.getPassword());
        user_pass[count] = one.getPassword(); 
        System.out.println(one.getContactNumber());
        user_contact[count] = one.getContactNumber();
        System.out.println(one.getAddress());
        user_address[count] = one.getAddress();
        count++;
        System.out.println("account sucessfully created ow you can try to login...");
        this.validate();

        // System.out.println(user_arr[0]);
        // System.out.println(user_pass[0]);
        // System.out.println(user_address[0]);
        // System.out.println(user_contact[0]);2
        // System.out.println(user_mail[0]);
    }
    
}
class travel_details{
    String departurePlace;
    String destinationPlace;
    int travellerNumber;
    int tripDate;
    

}


 public class FlightReservation{
    public static void main(String[] args) {
        System.out.println("Welcome to flight reservation system:"+ "\n" + "choose the correct option:-");
        System.out.println("1.Login" +"  "+"2.Sign up");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        login two = new login();


        if(option == 1)
        {two.validate();
        }
        else if(option == 2){
            two.sign_up();
        }



        
    }

}

