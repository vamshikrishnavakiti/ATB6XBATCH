package EX_25052024_Collections;

public class lab205 {
    public static void main(String[] args) {
        personATB Amit = new personATB(1223, 9885621221l);
        System.out.println(Amit.getPhoneNum());
        Amit.setPhoneNum(9885621321l);
        System.out.println(Amit.getPhoneNum());
        System.out.println(Amit.getRollNo());
Amit.setRollNo(3333,false);
        System.out.println(Amit.getRollNo());
    }
}


class personATB{
    Integer rollNo;
    Long phoneNum;

    public personATB(Integer rollNo, Long phoneNum) {
        this.rollNo = rollNo;
        this.phoneNum = phoneNum;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo, boolean isAuth) {
        if(isAuth){
            this.rollNo = rollNo;
        }
        else {
            System.out.println("Not allowed");
        }
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }
}