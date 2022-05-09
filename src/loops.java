public class loops {
    public static void main(String[] args) {

//       for (initialize, condition; update)
//        for (int i = 0; i<=10; i++){
//            System.out.println("value of i: "+i);
//        }
        int [] number = {10, 20, 30};
//        for (int i = 0; i < number.length;i++){
//            System.out.println("the value of index " +i + "is: " +number [i]);
//        }
        //enhanced for loop
//        for (int numbers: number){
//            System.out.println("the value is: "+numbers);

//        }
        String[] names= {"john", "Maan", "Naan"};
        for (String name: names){
            System.out.println(name);
        }
    }
}