package es.instituto.modelo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(nullable = false)
    private int edad;

    private Double nota;

    @Transient
    private List<Matricula> listadoMatriculas;

    //@Transient
    //private LocalDate fecha_nac; //Atributo que no se guarda

    protected Alumno() {}

    public Alumno(String nombre, int edad, Double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.listadoMatriculas = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nomb) {
        this.nombre = nomb;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public List<Matricula> getListadoMatriculas() {
        return listadoMatriculas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota=" + nota +
                '}';
    }
}
