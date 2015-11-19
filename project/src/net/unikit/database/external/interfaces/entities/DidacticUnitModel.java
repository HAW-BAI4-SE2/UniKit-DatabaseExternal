package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface DidacticUnitModel {
    Integer getId();
    CourseModel getCourse();
    void setCourse(CourseModel courseField);
    List<AppointmentModel> getAppointments();
    void setAppointments(List<AppointmentModel> appointmentModels);
}
