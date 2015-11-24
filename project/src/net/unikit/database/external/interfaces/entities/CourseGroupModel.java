package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface CourseGroupModel extends AbstractModel<Integer> {
    /**
     * Getter for the internal identifier in the database.
     * @return The internal identifier in the database
     */
    Integer getId();

    CourseModel getCourse();
    void setCourse(CourseModel course);

    int getGroupNumber();
    void setGroupNumber(int groupNumber);

    int getMaxGroupSize();
    void setMaxGroupSize(int maxGroupSize);

    List<CourseGroupAppointmentModel> getAppointments();
}
