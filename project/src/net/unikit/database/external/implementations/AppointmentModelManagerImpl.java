package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.AppointmentModel;
import net.unikit.database.external.interfaces.managers.AppointmentModelManager;
import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
final class AppointmentModelManagerImpl
        extends AbstractModelManagerImpl<AppointmentModel, Integer, AppointmentModelImpl, Integer>
        implements AppointmentModelManager {
    private AppointmentModelManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public static AppointmentModelManager create(SessionFactory sessionFactory) {
        return new AppointmentModelManagerImpl(sessionFactory);
    }

    @Override
    public AppointmentModel createEntity() {
        return new AppointmentModelImpl();
    }

    @Override
    protected Integer createIdFromBaseIdType(Integer id) {
        return id;
    }

    @Override
    protected Integer createBaseIdFromIdType(Integer id) {
        return id;
    }

    @Override
    protected Class getAnnotatedClass() {
        return AppointmentModelImpl.class;
    }

    @Override
    protected void updateDatabaseFields(AppointmentModelImpl entityOld, AppointmentModelImpl entityNew) {

    }
}
