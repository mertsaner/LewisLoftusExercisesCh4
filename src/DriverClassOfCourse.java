class DriverClassOfCourse {
     public void someMethod() {
        Course math, physics;

        //MAKE MAIN WORK IN ITS STANDALONE FUNCTION/CLASS
        //math and physics objects of the
        math = new Course("Calculus", "MATH101", 6, "Okan Tekman");
        physics = new Course("General Physics I", "PHYS101", 6, "Ahmet Mehmet");


        physics.setInstructorName("Mehmet Ali");
        math.setCourseCode("MATH102");

        System.out.println("First Course; " + math);
        System.out.println("Second Course; " + physics);
    }


//    public static void main(String[] args) {
//        someMethod();       //Private olup olmamasi ayni Classin icindekileri baglamaz
//                            //Bu adam Her turlu onu Cagirir
//    }
}
