class Main{

    public static void main(String[] args) {

        Scanner output = new Scanner(System.in);

        System.out.println("SIMPLE TEXT RPG");

     
        System.out.println("\nChoose Difficulty:");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");

        int worldChoice = output.nextInt();

        World world;

        if (worldChoice == 1) {
            world = new Easy();
        } else if (worldChoice == 2) {
            world = new Medium();
        } else {
            world = new Hard();
        }

        world.start();
