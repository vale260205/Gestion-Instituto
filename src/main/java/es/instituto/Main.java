package es.instituto;


import es.instituto.modelo.Alumno;
import es.instituto.modelo.Matricula;
import org.hibernate.Session;

public class Main {
    static void main() {
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        Alumno alumno3 = session.find(Alumno.class, 3);

        IO.println(alumno3);

        for(Matricula m : alumno3.getListadoMatriculas()) {
            IO.println(m);
        }

        } finally {
            HibernateUtil.cerrar();
        }
    }
}
