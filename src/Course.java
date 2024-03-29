class Course {

    private String courseTitle;
    private String courseCode;
    private int credits;
    private String instructorName;

    public Course(String Title, String Code, int ECTScredits, String instructorName){

        courseTitle = Title;
        courseCode = Code;
        credits = ECTScredits;
        this.instructorName = instructorName;
    }

    public String getCourseTitle(){
        return courseTitle;
    }

    public String getCourseCode(){
        return courseCode;
    }

    public int getCredits(){
        return credits;
    }

    public String getInstructorName(){
        return instructorName;
    }

    public void setCourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCredits(int credits) {
        this.credits=credits;
    }

    public void setInstructorName(String instructorName){
        this.instructorName = instructorName;
    }

    public String toString(){
        String result = "Course Title: " + getCourseTitle() + ", Course Code: " + getCourseCode() + ", Credits: " + getCredits() + ", Instructor Name: " + getInstructorName();
        return result;
    }
}
