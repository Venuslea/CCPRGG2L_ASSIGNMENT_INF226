public class App {
    public static void main(String[] args) throws Exception {

        Person Me = new Person("Delebat", 23);

        Person Friend = new Person("crafts", 24 );

        Me.addFriend(Friend);

        Pet pug = new Pet("Potatoe", 3, Me);
        pug.showOwner();

        Person Classmate = new Person("dan", 25);

        Person Classmate1 = new Person("dhan", 25);

        Person Classmate2 = new Person("den", 25);


        Me.addClassmate(Classmate);
        Me.addClassmate(Classmate1);
        Me.addClassmate(Classmate2);

        Car miniMPV= new Car ("Bb", "Black", 0, Me);
        miniMPV.myCar();

    }
}