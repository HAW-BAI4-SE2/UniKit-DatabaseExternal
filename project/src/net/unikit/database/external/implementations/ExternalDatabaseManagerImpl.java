package net.unikit.database.external.implementations;

import net.unikit.database.interfaces.DatabaseConfiguration;
import net.unikit.database.external.interfaces.ExternalDatabaseManager;
import net.unikit.database.external.interfaces.managers.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

final class ExternalDatabaseManagerImpl implements ExternalDatabaseManager {
    private final DatabaseConfiguration databaseConfiguration;
    private SessionFactory sessionFactory;
    private FieldOfStudyModelManager fieldOfStudyManager;
    private CourseModelManager courseManager;
    private CourseToFieldOfStudyModelManager courseToFieldOfStudyManager;
    private DidacticUnitModelManager didacticUnitManager;
    private AppointmentModelManager appointmentManager;
    private CourseGroupModelManager courseGroupManager;
    private CourseLectureModelManager courseLectureManager;
    private StudentModelManager studentManager;
    private CompletedCourseModelManager completedCourseManager;

    private void validate() throws NullPointerException {
        checkNotNull(databaseConfiguration, "value of 'databaseConfiguration' is null!");
        checkArgument(databaseConfiguration.getDialect().equals("org.hibernate.dialect.MySQLDialect"),
                "no support for dialect '" + databaseConfiguration.getDialect() + "'!");
        checkArgument(databaseConfiguration.getDriverClass().equals("com.mysql.jdbc.Driver"),
                "no support for driver class '" + databaseConfiguration.getDriverClass() + "'!");
    }

    private void init() {
        String connectionUrl = "jdbc:mysql://" + databaseConfiguration.getHostname() + ":" +
                databaseConfiguration.getPort() + "/" + databaseConfiguration.getSchema();

        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.dialect", databaseConfiguration.getDialect());
        configuration.setProperty("hibernate.connection.driver_class", databaseConfiguration.getDriverClass());
        configuration.setProperty("hibernate.connection.url", connectionUrl);
        configuration.setProperty("hibernate.connection.username", databaseConfiguration.getUsername());
        configuration.setProperty("hibernate.connection.password", databaseConfiguration.getPassword());
        configuration.setProperty("hibernate.enable_lazy_load_no_trans", "true");

        configuration.addAnnotatedClass(FieldOfStudyModelImpl.class);
        configuration.addAnnotatedClass(CourseModelImpl.class);
        configuration.addAnnotatedClass(CourseToFieldOfStudyModelImpl.class);
        configuration.addAnnotatedClass(DidacticUnitModelImpl.class);
        configuration.addAnnotatedClass(AppointmentModelImpl.class);
        configuration.addAnnotatedClass(CourseGroupModelImpl.class);
        configuration.addAnnotatedClass(CourseLectureModelImpl.class);
        configuration.addAnnotatedClass(StudentModelImpl.class);
        configuration.addAnnotatedClass(CompletedCourseModelImpl.class);

        sessionFactory = configuration.buildSessionFactory();

        fieldOfStudyManager = FieldOfStudyModelManagerImpl.create(sessionFactory);
        courseManager = CourseModelManagerImpl.create(sessionFactory);
        courseToFieldOfStudyManager = CourseToFieldOfStudyModelManagerImpl.create(sessionFactory);
        didacticUnitManager = DidacticUnitModelManagerImpl.create(sessionFactory);
        appointmentManager = AppointmentModelManagerImpl.create(sessionFactory);
        courseGroupManager = CourseGroupModelManagerImpl.create(sessionFactory);
        courseLectureManager = CourseLectureModelManagerImpl.create(sessionFactory);
        studentManager = StudentModelManagerImpl.create(sessionFactory);
        completedCourseManager = CompletedCourseModelManagerImpl.create(sessionFactory);
    }

    private ExternalDatabaseManagerImpl(DatabaseConfiguration databaseConfiguration) throws NullPointerException {
        this.databaseConfiguration = databaseConfiguration;
        this.sessionFactory = null;
        this.fieldOfStudyManager = null;
        this.courseManager = null;
        this.courseToFieldOfStudyManager = null;
        this.didacticUnitManager = null;
        this.appointmentManager = null;
        this.courseGroupManager = null;
        this.courseLectureManager = null;
        this.studentManager = null;
        this.completedCourseManager = null;
        validate();
        init();
    }

    public static ExternalDatabaseManager create(DatabaseConfiguration databaseConfiguration) throws NullPointerException {
        return new ExternalDatabaseManagerImpl(databaseConfiguration);
    }

    @Override
    public AppointmentModelManager getAppointmentModelManager() {
        return appointmentManager;
    }

    @Override
    public CourseGroupModelManager getCourseGroupModelManager() {
        return courseGroupManager;
    }

    @Override
    public CourseLectureModelManager getCourseLectureModelManager() {
        return courseLectureManager;
    }

    @Override
    public CourseModelManager getCourseModelManager() {
        return courseManager;
    }

    @Override
    public DidacticUnitModelManager getDidacticUnitModelManager() {
        return didacticUnitManager;
    }

    @Override
    public FieldOfStudyModelManager getFieldOfStudyModelManager() {
        return fieldOfStudyManager;
    }

    @Override
    public StudentModelManager getStudentModelManager() {
        return studentManager;
    }
}
