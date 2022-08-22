public class Teme {
    public static void main(String[] args) {
        String[] names = {"Andrei", "Alex", "Mircea", "Oana", "Maria", "", null};


    }

    //i.
    public static void printAllStartingWithA(String[] names){
        for (String name : names) {
            if(name != null && name.startsWith("A")) {
                System.out.println(name);
            }
        }
        //sooooo
    }
}
