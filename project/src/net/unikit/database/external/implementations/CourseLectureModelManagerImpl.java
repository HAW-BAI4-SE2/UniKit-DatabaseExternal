package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseLectureModel;
import net.unikit.database.external.interfaces.managers.CourseLectureModelManager;
import net.unikit.database.implementations.AbstractModelManagerImpl;
import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
final class CourseLectureModelManagerImpl
        extends AbstractModelManagerImpl<CourseLectureModel, Integer, CourseLectureModelImpl, Integer>
        implements CourseLectureModelManager {
    private CourseLectureModelManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public static CourseLectureModelManager create(SessionFactory sessionFactory) {
        return new CourseLectureModelManagerImpl(sessionFactory);
    }

    @Override
    public CourseLectureModel createEntity() {
        return new CourseLectureModelImpl();
    }

    @Override
    protected Class getAnnotatedClass() {
        return CourseLectureModelImpl.class;
    }

    @Override
    protected void updateDatabaseFields(CourseLectureModelImpl entityOld, CourseLectureModelImpl entityNew) {
        entityOld.setIdField(entityNew.getIdField());
        entityOld.setCourseField(entityNew.getCourseField());
        entityOld.setAppointmentModels(entityNew.getAppointmentModels());
    }
}
