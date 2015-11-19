package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface CourseModel extends AbstractModel {
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

    CourseLectureModel getCourseLecture();
    void setCourseLecture(CourseLectureModel courseLecture);

    List<CourseGroupModel> getCourseGroups();

    List<FieldOfStudyModel> getFieldOfStudies();
}
