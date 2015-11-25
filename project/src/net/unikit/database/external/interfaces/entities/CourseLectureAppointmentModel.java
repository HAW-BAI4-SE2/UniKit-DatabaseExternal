package net.unikit.database.external.interfaces.entities;

import java.util.Date;

/**
 * A model for a appointment which is associated to a course lecture.
 * @author Andreas Berks
 * @since 1.2.1
 */
public interface CourseLectureAppointmentModel extends AbstractModel<Integer> {
    /**
     * Getter for the internal identifier in the database.
     * @return The internal identifier in the database
     */
    Integer getId();

    /**
     * Getter for the course lecture that is associated with the appointment.
     * @return The course lecture that is associated with the appointment
     */
    CourseLectureModel getCourseLecture();

    /**
     * Setter for the course lecture that is associated with the appointment.
     * @param courseLecture The course lecture that is associated with the appointment
     */
    void setCourseLecture(CourseLectureModel courseLecture);

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
