public class App {
    public static void main(String[] args) throws Exception {
        
        Person me = new Person();

        // name 
        me.setName("Ben Christian");

        String myName = me.getName();

        System.out.println("My name is " + myName);

        // cc 
        me.setNum(42069);

        int ccNum = me.getNum();

        System.out.println("My credit card number is " + ccNum);

        // Son 
        Son Me = new Son();

        System.out.println("My family name is " + Me.surname);

        Me.showLove();

    }
}
