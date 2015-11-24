package net.unikit.database.external.interfaces.entities;

import java.util.Date;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface CourseGroupAppointmentModel extends AbstractModel<Integer> {
    /**
     * Getter for the internal identifier in the database.
     * @return The internal identifier in the database
     */
    Integer getId();

    CourseGroupModel getCourseGroup();
    void setCourseGroup(CourseGroupModel courseGroup);

    Date getStartDate();
    void setStartDate(Date startDate);

    Date getEndDate();
    void setEndDate(Date endDate);
}
