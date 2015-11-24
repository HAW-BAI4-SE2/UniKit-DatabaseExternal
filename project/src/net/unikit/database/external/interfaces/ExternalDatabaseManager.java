package net.unikit.database.external.interfaces;

import net.unikit.database.external.interfaces.managers.*;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface ExternalDatabaseManager {
    /**
     * Getter for the manager of the course group appointments.
     * @return The manager of the course group appointments
     */
    CourseGroupAppointmentModelManager getCourseGroupAppointmentModelManager();

    /**
     * Getter for the manager of the course groups.
     * @return The manager of the course groups
     */
    CourseGroupModelManager getCourseGroupModelManager();

    /**
     * Getter for the manager of the course lecture appointments.
     * @return The manager of the course lecture appointments
     */
    CourseLectureAppointmentModelManager getCourseLectureAppointmentModelManager();

    /**
     * Getter for the manager of the course lectures.
     * @return The manager of the course lectures
     */
    CourseLectureModelManager getCourseLectureModelManager();

    /**
     * Getter for the manager of the courses.
     * @return The manager of the courses
     */
    CourseModelManager getCourseModelManager();

    /**
     * Getter for the manager of the field of studies.
     * @return The manager of the field of studies
     */
    FieldOfStudyModelManager getFieldOfStudyModelManager();

    /**
     * Getter for the manager of the students.
     * @return The manager of the students
     */
    StudentModelManager getStudentModelManager();
}
