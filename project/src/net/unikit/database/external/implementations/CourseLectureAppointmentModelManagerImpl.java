package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseLectureAppointmentModel;
import net.unikit.database.external.interfaces.managers.CourseLectureAppointmentModelManager;
import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
final class CourseLectureAppointmentModelManagerImpl
        extends AbstractModelManagerImpl<CourseLectureAppointmentModel, Integer, CourseLectureAppointmentModelImpl, Integer>
        implements CourseLectureAppointmentModelManager {
    private CourseLectureAppointmentModelManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public static CourseLectureAppointmentModelManager create(SessionFactory sessionFactory) {
        return new CourseLectureAppointmentModelManagerImpl(sessionFactory);
    }

    @Override
    public CourseLectureAppointmentModel createEntity() {
        return new CourseLectureAppointmentModelImpl();
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
        return CourseLectureAppointmentModelImpl.class;
    }

    @Override
    protected void updateDatabaseFields(CourseLectureAppointmentModelImpl entityOld, CourseLectureAppointmentModelImpl entityNew) {

    }
}