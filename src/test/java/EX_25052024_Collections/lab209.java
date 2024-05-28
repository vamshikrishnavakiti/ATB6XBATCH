package EX_25052024_Collections;

public class lab209 {
    public static void main(String[] args) {
        APIENDPOINTS e = APIENDPOINTS.LOGIN;
        week day = week.friday;

        System.out.println(e);
        switch (e){
            case LOGIN:
                System.out.println("Login Page ");
                break;
            case Home:
                System.out.println("Home Page");
            case DASHBOARD:
                System.out.println("Dash Board");
        }
    }
}
 enum APIENDPOINTS{
    Home,
     LOGIN,
     DASHBOARD
}
enum week{
    sunday, monday, tuesday,wednesday,thursday,friday,saturday
}