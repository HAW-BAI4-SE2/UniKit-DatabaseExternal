package net.unikit.database.external.interfaces.entities;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface CourseToFieldOfStudyModel {
    Integer getId();

    CourseModel getCourse();
    void setCourse(CourseModel course);

    FieldOfStudyModel getFieldOfStudy();
    void setFieldOfStudy(FieldOfStudyModel fieldOfStudy);
}
