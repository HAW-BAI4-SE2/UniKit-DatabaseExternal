package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface CourseModel {
    Integer getId();
    String getName();
    void setName(String nameField);
    String getAbbreviation();
    void setAbbreviation(String abbreviationField);
    Integer getSemester();
    void setSemester(Integer semesterField);
    int getMinTeamSize();
    void setMinTeamSize(int minTeamSizeField);
    int getMaxTeamSize();
    void setMaxTeamSize(int maxTeamSizeField);
    List<DidacticUnitModel> getDidacticUnits();
    void setDidacticUnits(List<DidacticUnitModel> didacticUnitModels);
    List<CourseToFieldOfStudyModel> getCourseToFieldOfStudies();
    void setCourseToFieldOfStudies(List<CourseToFieldOfStudyModel> courseToFieldOfStudyModels);
    List<CompletedCourseModel> getCompletedCourses();
    void setCompletedCourses(List<CompletedCourseModel> completedCourseModels);
}
