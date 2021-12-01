import java.util.Scanner;
/* important notes:-
    >>without database i can only able to store temprory data in this code,
    >>everytime you need to signup first after you can book the ticket,
    >>in user class i used abstraction where i made variable private and implement the get and set method.
    >>tourist class inherited from regular class and implemented inheritance concept.
    >> many times i taken static data because absent of database.*/


import java.lang.reflect.Constructor;
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

class Login {
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
            System.out.println("~~~~~~~~~~~~~~~~~~~~logged in sucessfully!!~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        else{
            System.out.println("username or password invalid");
        }
    }
    public void sign_up(){
        System.out.println("$$$$$$$$$$$$ Enter Username $$$$$$$$$$$$$$");
        one.setUserName(sc.next());
        System.out.println("~~~~~~~~~~~~~~~Enetr password:(in int)~~~~~~~~~~~~`");
        one.setPassword(sc.nextInt());
        System.out.println("Enter Address:");
        one.setAddress(sc.next());
        System.out.println("Enter Contact No.:");
        one.setContactNumber(sc.nextLong());
        System.out.println("Enter Emaid_id:");
        one.setUserMail(sc.next());

        System.out.println("#################### this detail is saved..########################");
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
        System.out.println("---------------Your account is sucessfully created now you can try to Login...---------------");
        this.validate();

        // System.out.println(user_arr[0]);
        // System.out.println(user_pass[0]);
        // System.out.println(user_address[0]);
        // System.out.println(user_contact[0]);2
        // System.out.println(user_mail[0]);
    }
    public void detail_1(){
        System.out.println(one.getUserName() + one.getUserMail());
    }
    
}

class Regular_Booking{
    int pnr_no = 2342;
    int seatNo;
    int payment;
    int fligtht_no = 3234;
    String airline = "air asia";
    String special_services;
    int confirm_regular1 = 0;
    Scanner sc = new Scanner(System.in);
    public String departurePlace;
    String destinationPlace;
    String tripDate;

    


    public void show_regular(){    
        Login two = new Login();
        // String ticket_type;
        // String[] departure = new String[20];
        // String[] destination = new String[20];
        // String[] date = new String[20];
        // String[] ticketType = new String[20];
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>Enter Departure place:<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        departurePlace = sc.next();
        //departure[two.count] = departurePlace;
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>Enter destination place:<<<<<<<<<<<<<<<<<<<<<<<");        
        destinationPlace = sc.next();
        //destination[two.count] = destinationPlace;
        System.out.println(">>>>>>>>>>>>Enter Trip Date<<<<<<<<<<<<");
        tripDate = sc.next();
        //date[two.count] = tripDate;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~ we are searching flight for  you...~~~~~~~~~~~~~~~~~~~~~~~~~~");
   
        int[] seatList = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        System.out.println("as per your requirement 1 flight is sheduled on this date"+"\n"+"departure time is 9:15AM");
        System.out.println("approx. 10 - 15 seats are available in division A" + "\n"+"********************kindly choose seat no. from below list:************"+"\n"+"-------------fare will be RS.2000----------");
        for(int i = 0;i < seatList.length;i++){
            System.out.print(seatList[i] + " ");}
        System.out.println("choose your seat number"+"\n"+"by clicking confirm your seat will be confirmed followed by paying payment:");
        System.out.println("Enter Seat Number");
        seatNo = sc.nextInt();
        System.out.println("----------Enter any special service:--------- ");
        special_services = sc.next();
        System.out.println("$$$$$$$$$$$$$$$$$ Enter amount : 2000 $$$$$$$$$$$$$$$$$$$$$");
        payment = sc.nextInt();
        System.out.println("~~~~~~~~~~~~~~payment sucessfull~~~~~~~~~~~~~~~~~~~");
        this.confirm_regular1++;
        System.out.println(confirm_regular1); 

        if(payment == 2000){
            System.out.println("your seat is sucessfully booked");
        }else{
            System.out.println("!!!!!!!!!!!!!!sorry,invalid amount !!!!!!!!!!!!!");
        }
        
    }
}
class Tourist_Booking extends Regular_Booking{
    int[] seatList = {16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
    String hotel_address;
    int fligtht_no = 3233;
    int pnr_no = 9786;
    int confirm_tourist1 = 0;
    int option_1;
    String departurePlace;
    String destinationPlace;
    FlightReservation six = new FlightReservation();

    Scanner sc = new Scanner(System.in);

    public void show_tourist(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>Enter Departure place:<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        departurePlace = sc.next();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>Enter destination place:<<<<<<<<<<<<<<<<<<<<<<<");        
        destinationPlace = sc.next();
        System.out.println(">>>>>>>>>>>>Enter Trip Date<<<<<<<<<<<<");
        tripDate = sc.next();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~ we are searching flight for  you...~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("as per your requirement 1 flight is sheduled on this date"+"\n"+"-----------departure time is 9:15AM------------");
        System.out.println("approx. 15 seats are available in division A" + "\n"+"kindly choose seat no. from below list:"+"\n"+"~~~~~~~~~~~~~~~~~fare will be RS.3000~~~~~~~~~~~~~~~~");
        
        for(int i = 0;i < seatList.length;i++){
            System.out.print(seatList[i] + " ");
        }
        System.out.println("choose your seat number"+"\n"+"by clicking confirm your seat will be confirmed followed by paying payment:");
        System.out.println("Enter Seat Number");
        seatNo = sc.nextInt();
        System.out.println("Enter Hotel Address");
        hotel_address = sc.next();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~Enter Amount~~~~~~~~~~~~~~~~~~~~~");
        payment = sc.nextInt();

        if(payment == 3000){
            System.out.println("your seat is sucessfully booked");
            this.confirm_tourist1++;
            for (int i=seatNo-15;i<seatList.length - 1;i++){
                seatList[i] = seatList[i+1];
            }
        }else{
            System.out.println("!!!!!!!!!!!!!!!!!!!!!sorry,invalid amount paid!!!!!!!!!!!!!!!!");
        }   
    }
}


class Ticket_Details {
    Regular_Booking final_3;
    Ticket_Details(Regular_Booking four) {
        final_3 = four;
    }
    Tourist_Booking final_4;
        Ticket_Details(Tourist_Booking five) {
            final_4 = five;
        }
    
    Login final_1 = new Login();
    User final_five = new User();
    public void status_regular(){
        if(final_3.confirm_regular1>=1){
            System.out.println("Here is complete detail");
        
            System.out.println("DeparturePlace: "+final_3.departurePlace+"\n"+"DestinationLocation: "+final_3.destinationPlace +"\n" + "ticket type:"+"regular" + "\n" +"trip date:" + "24/9" + "\n" + "PNR NO." + final_3.pnr_no + "\n" + "Seat number"+ " "+final_3.seatNo + "\n" +"Airline:" + final_3.airline+ "\n" +"Flight number:"+final_3.fligtht_no+ "Amount paid:"+final_3.payment);}

        }
        public void status_tourist(){ 
        if(final_4.confirm_tourist1>=1){
            System.out.println("Here is complete detail");
            System.out.println("DeparturePlace: "+final_4.departurePlace +"\n"+"DestinationLocation: "+ final_4.departurePlace +"\n" + "ticket type:"+"tourist"+"\n"+ "trip date:" + "24/9" + "\n" + "PNR NO." + final_4.pnr_no + "\n" + "Seat number: "+final_4.seatNo + "\n" +"Airline:" +final_4.airline+ "\n" +"Flight number:"+final_4.fligtht_no+ "Amount paid:"+final_4.payment);

        }
        
        else{
            System.out.println("not booked any tickets");
        }

    }

}

 public class FlightReservation{
    public static void main(String[] args) {
        System.out.println("--------Welcome to flight reservation system:-------------"+ "\n" + "choose the correct option:-");
        System.out.println("1.Login" +"  "+"2.Sign up");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        Login two = new Login();
        Regular_Booking four = new Regular_Booking();
        Tourist_Booking five = new Tourist_Booking();
        Ticket_Details six = new Ticket_Details(four);
        Ticket_Details seven = new Ticket_Details(five);


        if(option == 1)
        {two.validate();
        }
        else if(option == 2){
            two.sign_up();
        }
        System.out.println("choose correct option:"+"\n"+ "1.BOOK TICKET" + "\n" + "2.see your booking status");
        int option2 = sc.nextInt();
        if(option2 == 1){
            System.out.println("choose Ticket type"+"\n"+"1.Regular ticket"+"\n"+"2.Tourist Ticket");
            int option3 = sc.nextInt();
            if(option3 == 1){
                four.show_regular();
            }else if(option3 == 2){
                five.show_tourist();
            }
            System.out.println("1.Status(Regular) 2.Status(Tourist) 3.Exit");
            int option_1 = sc.nextInt();
            if(option_1 == 1){
                six.status_regular();
            }else if(option_1 == 2){
                seven.status_tourist();
            }else{System.out.println("Thank you for visiting" + "for exit type Ctrl+C");}

        }else if(option2 == 3){
            six.status_regular();
            seven.status_tourist();

        }

    }

}














