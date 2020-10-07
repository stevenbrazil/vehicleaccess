public class Driver {


    private String fullName;
    private int age;
    private String userID;
    private String passWord;

    public void setOwner(String firstName, String lastName){

        this.fullName = firstName + " " + lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setUserID(String user){
        this.userID = user;
    }

    public void setPassWord(String pass){

        this.passWord = pass;
    }

    public String getOwner(){

        return this.fullName;
    }

    public int getAge(){

        return this.age;
    }

    public String getUserID(){

        return this.userID;
    }

    public String getPassWord(){

        return this.passWord;
    }

    public boolean AttemptLogin(String userAttempt, String passAttempt, String user, String pass){

        this.userID = user;
        this.passWord = pass;
        if(userAttempt.equals(this.userID) &&  passAttempt.equals(this.passWord)){

            System.out.println("Access Granted!");
            return true;
        }
        else{
            System.out.println("Access Denied");
            return false;
        }

    }


}


