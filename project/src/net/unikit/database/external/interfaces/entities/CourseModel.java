package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface CourseModel {
    Integer getId();
    String getName();
    void setName(String name);
    String getAbbreviation();
    void setAbbreviation(String abbreviation);
    Integer getSemester();
    void setSemester(Integer semester);
    int getMinTeamSize();
    void setMinTeamSize(int minTeamSize);
    int getMaxTeamSize();
    void setMaxTeamSize(int maxTeamSize);
    List<DidacticUnitModel> getDidacticUnits();
    void setDidacticUnits(List<DidacticUnitModel> didacticUnits);
    List<CourseToFieldOfStudyModel> getCourseToFieldOfStudies();
    void setCourseToFieldOfStudies(List<CourseToFieldOfStudyModel> courseToFieldOfStudies);
    List<CompletedCourseModel> getCompletedCourses();
    void setCompletedCourses(List<CompletedCourseModel> completedCourses);
}
