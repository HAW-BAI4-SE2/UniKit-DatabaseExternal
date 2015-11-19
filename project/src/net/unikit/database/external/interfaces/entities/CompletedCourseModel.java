package net.unikit.database.external.interfaces.entities;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface CompletedCourseModel {
    Integer getId();

    StudentModel getStudent();
    void setStudent(StudentModel student);

    CourseModel getCourse();
    void setCourse(CourseModel course);
}
