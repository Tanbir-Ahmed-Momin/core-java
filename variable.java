public class variable {

    public static void main(String[] args) {

        int myNum = 5;
        System.out.println(myNum);

        float myFloatNum = 5.9f;
        System.out.println(myFloatNum);

        double myDoubleNum = 6.99;
        System.out.println(myDoubleNum);

            // If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
        final int Num = 56;
        System.out.println(Num);

        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        // To combine both text and a variable, use the + character:
        String name = "tanbir";
        System.out.println("Hello " + name);
        



    }
    
}
