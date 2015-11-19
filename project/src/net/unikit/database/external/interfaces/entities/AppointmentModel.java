package net.unikit.database.external.interfaces.entities;

import java.util.Date;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface AppointmentModel extends AbstractModel {
    Integer getId();

    DidacticUnitModel getDidacticUnit();
    void setDidacticUnit(DidacticUnitModel didacticUnit);

    Date getStartDate();
    void setStartDate(Date startDate);

    Date getEndDate();
    void setEndDate(Date endDate);
}
