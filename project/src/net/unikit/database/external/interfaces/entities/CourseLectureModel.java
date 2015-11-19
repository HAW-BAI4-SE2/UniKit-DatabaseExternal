package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface CourseLectureModel extends DidacticUnitModel, AbstractModel<Integer> {
    Integer getId();

    CourseModel getCourse();
    void setCourse(CourseModel course);

    List<AppointmentModel> getAppointments();
}
