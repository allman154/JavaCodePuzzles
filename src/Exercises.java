public class Exercises {

    public Exercises() {

    }

    public void runExercise(String exercise) {
        try {
            switch (exercise) {
                case "linked":
                    linkedList();
                case "node":

                default:
                    System.out.println("Nothing to Run.");
            }
        } catch (NullPointerException npe) {
            System.out.println("No exercise to run.");
        }
    }

    private void linkedList() {
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
