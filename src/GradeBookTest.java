public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook myGradeBook1 = new GradeBook(
                "CS101"
        );
        GradeBook myGradeBook2 = new GradeBook(
                "CS50"
        );

        System.out.printf("myGradeBook1 course name is %s\n",
            myGradeBook1.getCourseName());
        System.out.printf("myGradeBook2 course name is %s\n",
                myGradeBook2.getCourseName());
    }
}
