package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * A model for a course lecture which is associated to a course.
 * @author Andreas Berks
 * @since 1.2.1
 */
public interface CourseLectureModel extends AbstractModel<Integer> {
    /**
     * Getter for the internal identifier in the database.
     * @return The internal identifier in the database
     */
    Integer getId();

    /**
     * Getter for the course that is associated with the course lecture.
     * @return The course that is associated with the course lecture
     */
    CourseModel getCourse();

    /**
     * Setter for the course that is associated with the course lecture.
     * @param course The course that is associated with the course lecture
     */
    void setCourse(CourseModel course);

    /**
     * Getter for the appointments of the course lecture.
     * Returns a immutable list of {@link CourseLectureAppointmentModel}.
     * @return The appointments of the course lecture
     */
    List<CourseLectureAppointmentModel> getAppointments();
}
