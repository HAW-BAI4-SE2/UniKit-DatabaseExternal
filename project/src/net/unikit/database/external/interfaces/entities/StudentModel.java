package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface StudentModel {
    String getStudentNumber();
    void setStudentNumber(String studentNumberField);
    String getFirstName();
    void setFirstName(String firstNameField);
    String getLastName();
    void setLastName(String lastNameField);
    String getEmail();
    void setEmail(String emailField);
    FieldOfStudyModel getFieldOfStudy();
    void setFieldOfStudy(FieldOfStudyModel fieldOfStudyField);
    int getSemester();
    void setSemester(int semesterField);
    List<CompletedCourseModel> getCompletedCourses();
    void setCompletedCourses(List<CompletedCourseModel> completedCourseModels);
}
