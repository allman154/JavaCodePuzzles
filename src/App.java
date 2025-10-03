public class App {
    public static void main(String[] args) throws Exception {
        Students studentList = new Students();
        studentList.addStudentToList(10);
        studentList.addStudentToList(20);
        studentList.addStudentToList(30);
        studentList.addStudentToList(40);
        studentList.addStudentToList(50);
        studentList.addStudentToList(60);

        studentList.displayStudentList();

        studentList.removeItem(30);

        studentList.displayStudentList();

        studentList.reverseList();

        studentList.displayStudentList();
    }
}
