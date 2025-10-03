public class App {
    public static void main(String[] args) throws Exception {
        // Create and
        Students studentList = new Students();
        studentList.addStudentToList(10);
        studentList.addStudentToList(20);
        studentList.addStudentToList(30);
        studentList.addStudentToList(40);
        studentList.addStudentToList(50);
        studentList.addStudentToList(60);

        // display basic list
        studentList.displayStudentList();

        // remove and item
        studentList.removeItem(30);

        // display updated list
        studentList.displayStudentList();

        // invert the pointers
        studentList.reverseList();

        // display altered list
        studentList.displayStudentList();
    }
}
