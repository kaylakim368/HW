public class If {
    public static void main(String[] args) {
        int loop = 0;

        while (true) {
            System.out.println("Looping: " + loop);
            if(loop == 5) {
                break;
            }
            loop++;
            System.out.println("Running");
        }

//        int myInt = 30;
//
//        if(myInt < 10) {
//            System.out.println("Yes, it's true!");
//        }
//        else if(myInt < 20) {
//            System.out.println("No, it's false!");
//        }
//        else {
//            System.out.println("None of the above.");
//        }
    }
}
