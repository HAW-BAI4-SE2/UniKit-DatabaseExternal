package net.unikit.database.external.interfaces;

import net.unikit.database.external.interfaces.managers.*;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface ExternalDatabaseManager {
    CourseGroupAppointmentModelManager getCourseGroupAppointmentModelManager();
    CourseGroupModelManager getCourseGroupModelManager();
    CourseLectureAppointmentModelManager getCourseLectureAppointmentModelManager();
    CourseLectureModelManager getCourseLectureModelManager();
    CourseModelManager getCourseModelManager();
    FieldOfStudyModelManager getFieldOfStudyModelManager();
    StudentModelManager getStudentModelManager();
}
