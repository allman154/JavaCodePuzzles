import java.util.LinkedList;

public class Students {

    private LinkedList studentList = new LinkedList<Student>();
    private Student firstStudent;

    public Students() {

    }

    public void addStudentToList(int inId) {
        Student studentToAdd = new Student(inId);
        if (firstStudent == null) {
            firstStudent = studentToAdd;
        } else {
            Student currentStudent = firstStudent;
            while (currentStudent.nextStudent != null) {
                currentStudent = currentStudent.nextStudent;
            }
            currentStudent.nextStudent = studentToAdd;
        }
    }

    public void displayStudentList() {
        Student currentStu = firstStudent;
        while (currentStu != null) {
            System.out.println(currentStu.studentId + " -> ");
            currentStu = currentStu.nextStudent;
        }
        System.out.println(" -> NULL");
    }

    public void removeItem(int inId) {
        if (firstStudent == null) {
            return;
        }
        if (firstStudent.studentId == inId) {
            firstStudent = firstStudent.nextStudent;
            return;
        }
        Student prevStu = firstStudent;
        Student curStu = firstStudent;
        while (curStu != null && curStu.studentId != inId) {
            prevStu = curStu;
            curStu = curStu.nextStudent;
        }
        if (curStu == null) {
            return;
        }
        prevStu.nextStudent = curStu.nextStudent;
    }

    public void reverseList() {
        Student prevStu = null;
        Student curStu = firstStudent;
        Student nextStu;
        while (curStu != null) {
            //assign next variable
            nextStu = curStu.nextStudent;
            //swap the pointer, have current point to previous, not next. 
            curStu.nextStudent = prevStu;
            //now that the pointers are swapped...
            //we move down the list - previous = current
            prevStu = curStu;
            //then move current = next
            curStu = nextStu;
        }
        //out of the loop we reassign HEAD to the last PREV in the recursion.
        firstStudent = prevStu;
    }
}
