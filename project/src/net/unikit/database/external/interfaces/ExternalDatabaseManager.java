package net.unikit.database.external.interfaces;

import net.unikit.database.external.interfaces.managers.*;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface ExternalDatabaseManager {
    AppointmentModelManager getAppointmentModelManager();
    CourseGroupModelManager getCourseGroupModelManager();
    CourseLectureModelManager getCourseLectureModelManager();
    CourseModelManager getCourseModelManager();
    DidacticUnitModelManager getDidacticUnitModelManager();
    FieldOfStudyModelManager getFieldOfStudyModelManager();
    StudentModelManager getStudentModelManager();
}
