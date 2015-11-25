package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * A model for a course.
 * A course can have one course lecture and multiple course group.
 * A course can be associated to any number of field of studies.
 * @author Andreas Berks
 * @since 1.2.1
 */
public interface CourseModel extends AbstractModel<Integer> {
    /**
     * Getter for the internal identifier in the database.
     * @return The internal identifier in the database
     */
    Integer getId();

    /**
     * Getter for the name of the course.
     * @return The name of the course
     */
    String getName();

    /**
     * Setter for the name of the course.
     * @param name The name of the course
     */
    void setName(String name);

    /**
     * Getter for the abbreviation of the course.
     * @return The abbreviation of the course
     */
    String getAbbreviation();

    /**
     * Setter for the abbreviation of the course.
     * @param abbreviation The abbreviation of the course
     */
    void setAbbreviation(String abbreviation);

    /**
     * Getter for the semester the course occurs.
     * @return The semester the course occurs
     */
    Integer getSemester();

    /**
     * Setter for the semester the course occurs.
     * @param semester The semester the course occurs
     */
    void setSemester(Integer semester);

    /**
     * Getter for the minimum size of a team.
     * @return The minimum size of a team
     */
    int getMinTeamSize();

    /**
     * Setter for the minimum size of a team.
     * @param minTeamSize The minimum size of a team
     */
    void setMinTeamSize(int minTeamSize);

    /**
     * Getter for the maximum size of a team.
     * @return The maximum size of a team
     */
    int getMaxTeamSize();

    /**
     * Setter for the maximum size of a team.
     * @param maxTeamSize The maximum size of a team
     */
    void setMaxTeamSize(int maxTeamSize);

    /**
     * Getter for the course lecture of the course.
     * @return The course lecture of the course
     */
    CourseLectureModel getCourseLecture();

    /**
     * Getter for the course group of the course.
     * Returns a immutable list of {@link CourseGroupModel}.
     * @return The course group of the course
     */
    List<CourseGroupModel> getCourseGroups();

    /**
     * Getter for the field of studies of the course.
     * Returns a immutable list of {@link FieldOfStudyModel}.
     * @return The field of studies of the course
     */
    List<FieldOfStudyModel> getFieldOfStudies();
}
