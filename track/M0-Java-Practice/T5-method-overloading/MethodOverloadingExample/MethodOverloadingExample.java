class Aman{
    String name = "Aman"; // instantaneous variable

    void displayData(String Newname){
        name = Newname;
        System.out.println(name);
    }
}


public class MethodOverloadingExample {
    public static void main(String[] args) {
        
        Aman an = new Aman();

        // an.name = "Aman new";

        an.displayData("Aman new");

    }
}

// ambiguity happens in non primitive type

// when to use this keyword ?
/*
    1. when we want to change the instantaneous variable value using the local variable which is in the method
    2. while also using the same name of the local and the instantanrous variable
    3. why same name this is the industry standards as using different names can make it confusing
    4. so when we use this keyword in the function on the local variable while keeping the same name
    5. that local variable will know we are taking about the above instantaneous variable for wchich we need to make tha value changed
    

*/