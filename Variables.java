public class Variables {
     static String Y ="ndne";
     static int Initial_Salary = 50000;
     String Employee_name = "sethu";
     static int Employee_ID = 5690;

    public static void main(String[] args) {
        String Employee_ID = "Wilmu_1789";
        long DOJ = 12122020;
        int Previous_Salary = 50000;
        String Current_salary = "$75000";
        boolean ispromoted = true;
        float Experience = 2.58f;
        System.out.println((Employee_ID +"\n"+DOJ+"\n"+Previous_Salary+"\n"+Current_salary+"\n"+ispromoted+"\n"+Experience+"\n"));

        //String salary = Integer.toString(Previous_Salary);

        Copy_datatypes(8, "Victor");
        Copy_datatypes1(8,4);
        //Copy_datatypes();//We need call the method name inside Main method() to print the output from other methods
        Employee();

    }
    // We can't use two main methods in a class
    // Passing an arguments in method
    public static void Copy_datatypes(int A, String D){
        //int YO = 5678;
        System.out.println( A + "\n"+ D);
        System.out.println(Y);
        String salary = Integer.toString(Initial_Salary);
        System.out.println(salary);

    }
    //Multiplying an arguments in method
    public static void Copy_datatypes1(int A, int D) {
        //int YO = 5678;
        System.out.println("\n"+A * D);
        //System.out.println(Y);
        String salary = Integer.toString(Initial_Salary);
        System.out.println(salary);

    }
    public static void Employee(){
        //Wrapper Classes from Int to String
        String Int_to_string = Integer.toString(Employee_ID);  //Wrapper Classes from Int to String
        System.out.println(Int_to_string);

        int String_to_int = Integer.parseInt(Int_to_string);    //Wrapper Classes String to INT
        System.out.println(String_to_int);

        double Int_to_Double = Employee_ID;                     // Widening Casting(int->Double)
        System.out.println(Int_to_Double);

        int Double_to_INT = (int)Int_to_Double;                 // Narrowing Casting(Double->int)
        System.out.println(Double_to_INT);
    }
}
