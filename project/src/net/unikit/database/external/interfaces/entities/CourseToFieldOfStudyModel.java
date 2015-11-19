package net.unikit.database.external.interfaces.entities;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface CourseToFieldOfStudyModel {
    Integer getId();
    void setId(Integer idField);
    CourseModel getCourse();
    void setCourse(CourseModel courseField);
    FieldOfStudyModel getFieldOfStudy();
    void setFieldOfStudy(FieldOfStudyModel fieldOfStudyField);
}
