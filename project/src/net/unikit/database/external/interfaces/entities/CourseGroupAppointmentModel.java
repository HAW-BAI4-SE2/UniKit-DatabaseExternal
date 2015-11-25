package net.unikit.database.external.interfaces.entities;

import java.util.Date;

/**
 * A model for a appointment which is associated to a course group.
 * @author Andreas Berks
 * @since 1.2.1
 */
public interface CourseGroupAppointmentModel extends AbstractModel<Integer> {
    /**
     * Getter for the internal identifier in the database.
     * @return The internal identifier in the database
     */
    Integer getId();

    /**
     * Getter for the course group that is associated with the appointment.
     * @return The course group that is associated with the appointment
     */
    CourseGroupModel getCourseGroup();

    /**
     * Setter for the course group that is associated with the appointment.
     * @param courseGroup The course group that is associated with the appointment
     */
    void setCourseGroup(CourseGroupModel courseGroup);

    /**
     * Getter for the start date of the appointment.
     * @return The start date of the appointment
     */
    Date getStartDate();

    /**
     * Setter for the start date of the appointment.
     * @param startDate The start date of the appointment
     */
    void setStartDate(Date startDate);

    /**
     * Getter for the end date of the appointment.
     * @return The end date of the appointment
     */
    Date getEndDate();

    /**
     * Setter for the end date of the appointment.
     * @param endDate The end date of the appointment
     */
    void setEndDate(Date endDate);
}
