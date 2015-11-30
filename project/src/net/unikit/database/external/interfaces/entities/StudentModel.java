package net.unikit.database.external.interfaces.entities;

import net.unikit.database.interfaces.entities.AbstractModel;

import java.util.List;

/**
 * A model for a student.
 * @author Andreas Berks
 * @since 1.2.1
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

    /**
     * Getter for the first name of the student.
     * @return The first name of the student
     */
    String getFirstName();

    /**
     * Setter for the first name of the student.
     * @param firstName The first name of the student
     */
    void setFirstName(String firstName);

    /**
     * Getter for the last name of the student.
     * @return The last name of the student
     */
    String getLastName();

    /**
     * Setter for the last name of the student.
     * @param lastName The last name of the student
     */
    void setLastName(String lastName);

    /**
     * Getter for the email address of the student.
     * @return The email address of the student
     */
    String getEmail();

    /**
     * Setter for the email address of the student.
     * @param email The email address of the student
     */
    void setEmail(String email);

    /**
     * Getter for the field of study in which the student is enrolled.
     * @return The field of study in which the student is enrolled
     */
    FieldOfStudyModel getFieldOfStudy();

    /**
     * Setter for the field of study in which the student is enrolled.
     * @param fieldOfStudy The field of study in which the student is enrolled
     */
    void setFieldOfStudy(FieldOfStudyModel fieldOfStudy);

    /**
     * Getter for the semester in which the student is enrolled.
     * @return The semester in which the student is enrolled
     */
    int getSemester();

    /**
     * Setter for the semester in which the student is enrolled.
     * @param semester The semester in which the student is enrolled
     */
    void setSemester(int semester);

    /**
     * Getter for the completed courses of the student.
     * Returns a immutable list of {@link CourseModel}.
     * @return The completed courses of the student
     */
    List<CourseModel> getCompletedCourses();
}
