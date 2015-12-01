package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseGroupAppointmentModel;
import net.unikit.database.external.interfaces.managers.CourseGroupAppointmentModelManager;
import net.unikit.database.implementations.AbstractModelManagerImpl;
import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
final class CourseGroupAppointmentModelManagerImpl
        extends AbstractModelManagerImpl<CourseGroupAppointmentModel, Integer, CourseGroupAppointmentModelImpl, Integer>
        implements CourseGroupAppointmentModelManager {
    private CourseGroupAppointmentModelManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public static CourseGroupAppointmentModelManager create(SessionFactory sessionFactory) {
        return new CourseGroupAppointmentModelManagerImpl(sessionFactory);
    }

    @Override
    public CourseGroupAppointmentModel createEntity() {
        return new CourseGroupAppointmentModelImpl();
    }

    @Override
    protected Class getAnnotatedClass() {
        return CourseGroupAppointmentModelImpl.class;
    }

    @Override
    protected void updateDatabaseFields(CourseGroupAppointmentModelImpl entityOld, CourseGroupAppointmentModelImpl entityNew) {
        entityOld.setIdField(entityNew.getIdField());
        entityOld.setCourseGroupField(entityNew.getCourseGroupField());
        entityOld.setStartDateField(entityNew.getStartDateField());
        entityOld.setEndDateField(entityNew.getEndDateField());
    }
}
