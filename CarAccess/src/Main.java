import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Driver info = new Driver();
        Vehicle car = new Vehicle();
        System.out.println("Please Register...");
        System.out.println("Enter first name: ");
        String first_name = input.nextLine();
        System.out.println("Enter last name: ");
        String last_name = input.nextLine();
        System.out.println("Enter age: ");
        int age = input.nextInt();
        input.nextLine();
        info.setOwner(first_name, last_name);
        info.setAge(age);

        System.out.println("Create your user name: ");
        String user = input.nextLine();
        System.out.println("Create your password: ");
        String pass = input.nextLine();
        input.nextLine();
        info.setUserID(user);
        info.setPassWord(pass);
        System.out.println("THANK YOU!");
        System.out.println("WELCOME TO YOUR CAR ACCESS DATABASE");
        System.out.println("ENTER USERNAME and PASSWORD TO BEGIN\r");

        System.out.println("User Name: ");
        String userAttempt = input.nextLine();
        System.out.println("Password: ");
        String passAttempt = input.nextLine();
        input.nextLine();

        String testUser = info.getUserID();
        String testPass = info.getPassWord();
        boolean verification = info.AttemptLogin(userAttempt, passAttempt, testUser, testPass);
        if(verification){

            System.out.println("Hello " + testUser);
            System.out.println("Set Make of vehicle: ");
            String make = input.nextLine();
            System.out.println("Set Model of vehicle: ");
            String model = input.nextLine();
            System.out.println("Set Model Year of vehicle: ");
            long modelYear = input.nextLong();
            input.nextLine();
            System.out.println("Set Fuel Type gas, diesel, electric: ");
            String fuelType = input.nextLine();

            car.setMake(make);
            car.setModel(model);
            car.setModel_year(modelYear);
            car.setGasType(fuelType);

        }else{

            System.out.println("You have failed to enter credentials correctly..");
            System.exit(0);

        }

        System.out.println("Hello, " + info.getOwner() + " ID: " + info.getUserID() + " Driver Age: " + info.getAge() );
        System.out.println(car.getModel_year() + " " + car.getMake() + " " + car.getModel());
        System.out.println("Fuel Type: " + car.getGasType());

        input.close();


    }
}
