import java.util.Scanner;
class User{
    private String userName;
    private String userMail;
    private int password;
    private int contactNumber;
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
    public void setContactNumber(int contactNumber){
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
    public int getContactNumber(){
        return contactNumber;
    }
    public String getAddress(){
        return address;
    }
}


 public class FlightReservation{
    public static void main(String[] args) {
        System.out.println("Welcome to flight reservation system:" + " " + "choose the correct option:-");
        System.out.println("1.Login" +"  "+"2.Sign up");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        User one = new User();


        if(option == 1)
        {
            System.out.println("Please enter your username:");
            String userName = sc.next();
            System.out.println("Please enter your password:");
            int password = sc.nextInt();

            if((userName.equals("bhado")) && password == 97274){
                System.out.println("Verifying.....");
                System.out.println("sucessfully logged in");
            }
            else{
                System.out.println("username or password invalid");
            }
        }
        else if(option == 2){
            System.out.println("Enter username");
            one.setUserName(sc.next());
            System.out.println("Enetr password:");
            one.setPassword(sc.nextInt());
            System.out.println("Enter Address:");
            one.setAddress(sc.next());
            System.out.println("Enter Contact No.:");
            one.setContactNumber(sc.nextInt());
            System.out.println("Enter Emaid_id:");
            one.setUserMail(sc.next());

            System.out.println("this detail is saved..");
            System.out.println(one.getUserName());
            System.out.println(one.getUserMail());
            System.out.println(one.getPassword());
            System.out.println(one.getContactNumber());

        }

        
    }

}

