import java.util.Date;

class Date_ {
    public static void main(String[] args) {
        Date today = new Date();
        System.err.println(today.getTime()); // -> This is like +(new Date()) in JavaScript
    }
}