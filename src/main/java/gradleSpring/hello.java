package gradleSpring;

public class hello {
    private String message;
    public void setMessage(String message){
        this.message=message;
    }
    public void getMessage(){
        System.out.println("Message: "+message);
    }
}
