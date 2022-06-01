public class Cats {
    String name;
    int age;
    public static int counter=0;
    public Cats(String name,int age){
        this.name=name;
        this.age=age;
        counter++;
    }
    public static void getNumberOfCats(){
        for (int i = counter; i > 5; i--) {
            System.out.println("You have too many cats");
        }
        System.out.println(counter);
    }
}

