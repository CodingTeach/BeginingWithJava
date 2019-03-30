package Classes.OneDotTwo;

public class HowMethodsWork {
    /*
    methods are a way of dividing your work up.
    a good rule of thumb for methods if you think you can reuse you code do
     */
    public static void main(String[] args){
        int count = 1;

        //calling a method is easy
        // just state the name  and pass what you need to a method
        print(count);
        /*
        now you maybe can tell I have ++ on the next line of code
        this is to increase what count is before sending it into the method
         */
        print(++count);
        //this is to increase what count is after sending it into the method
        print(count++);
        print(count);

        print("Hello World");


        /*
        one big plus to methods is they can pass back information that may needed to be changed
        you can even call a method when already calling a different method
         */
        print(passBackLastTwoLettersOfString("String"));
        print(passBackLastTwoLettersOfString("math"));
    }

    //Now here is a reusable method
    //Note the name of whats in the method is different then what i passed
    //Void is a place holder that is your return value
    //for this method i don't want to return anything so i just place void
    public static void print(int number){
        System.out.println(number);
    }

    //We can even reuse methods names along and we change whats being passed in
    //This is called method Overloading
    //Again i could reused this if i want
    public static void print(String string){
        System.out.println(string);
    }

    /*
    we can pass back variable with using the name of the variable where void was before
    to return just say what your wanting to return then what your returning
     */
    private static String passBackLastTwoLettersOfString(String string) {
        return string.substring(string.length()-2);
    }
}
