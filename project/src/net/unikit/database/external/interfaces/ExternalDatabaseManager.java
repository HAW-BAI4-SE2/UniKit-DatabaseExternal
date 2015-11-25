package net.unikit.database.external.interfaces;

import net.unikit.database.external.interfaces.managers.*;

/**
 * A manager which grants access to all database managers of the external database.
 * @author Andreas Berks
 * @since 1.2.1
 */
public interface ExternalDatabaseManager {
    /**
     * Getter for the manager for the course group appointments.
     * @return The manager for the course group appointments
     */
    CourseGroupAppointmentModelManager getCourseGroupAppointmentModelManager();

    /**
     * Getter for the manager for the course groups.
     * @return The manager for the course groups
     */
    CourseGroupModelManager getCourseGroupModelManager();

    /**
     * Getter for the manager for the course lecture appointments.
     * @return The manager for the course lecture appointments
     */
    CourseLectureAppointmentModelManager getCourseLectureAppointmentModelManager();

    /**
     * Getter for the manager for the course lectures.
     * @return The manager for the course lectures
     */
    CourseLectureModelManager getCourseLectureModelManager();

    /**
     * Getter for the manager for the courses.
     * @return The manager for the courses
     */
    CourseModelManager getCourseModelManager();

    /**
     * Getter for the manager for the field of studies.
     * @return The manager for the field of studies
     */
    FieldOfStudyModelManager getFieldOfStudyModelManager();

    /**
     * Getter for the manager for the students.
     * @return The manager for the students
     */
    StudentModelManager getStudentModelManager();
}
