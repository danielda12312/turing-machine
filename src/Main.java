public class Main {

    public static void main(String[] args) {
        //4 + 9 = 13
        UnaryAdditionTM turingMachine = new UnaryAdditionTM("000010000000");

        turingMachine.run();
        System.out.println("Result: " + turingMachine.getResult());
    }

}
