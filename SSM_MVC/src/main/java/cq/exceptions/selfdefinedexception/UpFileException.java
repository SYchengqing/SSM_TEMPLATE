package cq.exceptions.selfdefinedexception;

public class UpFileException extends Exception {
    private String message;
    public UpFileException(String message) {
        super(message);
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
