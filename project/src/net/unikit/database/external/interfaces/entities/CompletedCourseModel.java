package net.unikit.database.external.interfaces.entities;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface CompletedCourseModel {
    Integer getId();
    StudentModel getStudent();
    void setStudent(StudentModel studentField);
    CourseModel getCourse();
    void setCourseField(CourseModel courseField);
}
