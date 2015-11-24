package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface StudentModel extends AbstractModel<String> {
    /**
     * Getter for the student number which identifies the student.
     * @return The student number which identifies the student
     */
    String getStudentNumber();

    /**
     * Setter for the student number which identifies the student.
     * @param studentNumber The student number which identifies the student
     */
    void setStudentNumber(String studentNumber);

    String getFirstName();
    void setFirstName(String firstName);

    String getLastName();
    void setLastName(String lastName);

    String getEmail();
    void setEmail(String email);

    FieldOfStudyModel getFieldOfStudy();
    void setFieldOfStudy(FieldOfStudyModel fieldOfStudy);

    int getSemester();
    void setSemester(int semester);

    List<CourseModel> getCompletedCourses();
}
