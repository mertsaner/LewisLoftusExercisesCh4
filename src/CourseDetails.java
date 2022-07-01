class anyname {
    public static void main(String[] args) {      //Set main at the end

        //THREE WAYS TO PUT MAIN IN DIFFERENT JAVA CLASS
        //1.  DIRECT CALL
         //DriverClassOfCourse.someMethod();  //Static Method invoked through its class name
        //2. CREATE NEW METHOD IN THE SAME CLASS AND CALL IT
        // anymethod();
        //3. CREATE OBJECT OF THE CLASS TO BE CALLED AND THEN CALL IT
        // DriverClassOfCourse object1;
        // object1 = new DriverClassOfCourse();
        // object1.someMethod();       //Called the method of the another class by creating its object
        //4.CREATE NEW CLASS AND CALL DIRECTLY FROM THERE, WHICH SAME WITH SAME LOGIC WITH STEP 1
        //  anyClass.mymethod();



        DriverClassOfCourse object1 = new DriverClassOfCourse();
        object1.someMethod(); //If method is NON STATIC Then you need to create its object like this
    }

//    public static void anymethod() {
//        DriverClassOfCourse.someMethod();
//    }
}
//class anyClass{
//    public static void mymethod(){
//        DriverClassOfCourse.someMethod();
//    }
