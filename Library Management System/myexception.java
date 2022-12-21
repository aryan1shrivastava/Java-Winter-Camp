public class myexception extends Exception {
    myexception(){}
    myexception(String msg){

        super(msg+ "Try Again!");
    }
}
