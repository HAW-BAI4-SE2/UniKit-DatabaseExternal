package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface FieldOfStudyModel {
    Integer getId();
    String getName();
    void setName(String nameField);
    String getAbbreviation();
    void setAbbreviation(String abbreviationField);
    List<CourseToFieldOfStudyModel> getCourseToFieldOfStudies();
    void setCourseToFieldOfStudies(List<CourseToFieldOfStudyModel> courseToFieldOfStudyModels);
    List<StudentModel> getStudents();
    void setStudents(List<StudentModel> studentModels);
}
