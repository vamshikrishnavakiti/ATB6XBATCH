package EX_25052024_Collections;

public class HttpStatus {
    public static void main(String[] args) {
        HTTPStatus status =HTTPStatus.OK;
        System.out.println(status.getCode()+"__"+status.getMessage());


    }
}
enum HTTPStatus{
    OK(200,"OK"),
    Created(201,"Created"),
    Accepted(202,"Accepted"),
    No_Content(204,"No Content"),
    Bad_Request(400,"Bad Request"),
    Not_Fount(404,"Not Found");

    private  int code;
    private String message;

    HTTPStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
