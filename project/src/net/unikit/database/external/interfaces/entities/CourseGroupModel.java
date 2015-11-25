package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * A model for a course group which is associated to a course.
 * @author Andreas Berks
 * @since 1.2.1
 */
public interface CourseGroupModel extends AbstractModel<Integer> {
    /**
     * Getter for the internal identifier in the database.
     * @return The internal identifier in the database
     */
    Integer getId();

    /**
     * Getter for the course that is associated with the course group.
     * @return The course that is associated with the course group
     */
    CourseModel getCourse();

    /**
     * Setter for the course that is associated with the course group.
     * @param course The course that is associated with the course group
     */
    void setCourse(CourseModel course);

    /**
     * Getter for the group number of the course group relevant to the course.
     * @return The group number of the course group relevant to the course
     */
    int getGroupNumber();

    /**
     * Setter for the group number of the course group relevant to the course.
     * @param groupNumber The group number of the course group relevant to the course
     */
    void setGroupNumber(int groupNumber);

    /**
     * Getter for the maximum number of participants of the course group.
     * @return The maximum number of participants of the course group
     */
    int getMaxGroupSize();

    /**
     * Setter for the maximum number of participants of the course group.
     * @param maxGroupSize The maximum number of participants of the course group
     */
    void setMaxGroupSize(int maxGroupSize);

    /**
     * Getter for the appointments of the course group.
     * Returns a immutable list of {@link CourseGroupAppointmentModel}.
     * @return The appointments of the course group
     */
    List<CourseGroupAppointmentModel> getAppointments();
}
