package net.unikit.database.external.interfaces.entities;

import java.util.Date;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface AppointmentModel {
    Integer getId();
    DidacticUnitModel getDidacticUnit();
    void setDidacticUnit(DidacticUnitModel didacticUnitField);
    Date getStartDate();
    void setStartDate(Date startDateField);
    Date getEndDate();
    void setEndDate(Date endDateField);
}
