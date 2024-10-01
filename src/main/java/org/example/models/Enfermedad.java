package org.example.models;

public class Enfermedad {
        private String nombre;
        private String descripcion;
        private String sintomas;
        private String tratamiento;
        private String causa;
        private String tipo;
        private String gravedad;
        private String periodoIncubacion;
        private boolean esContagiosa;
        private String fechaDiagnostico;

    public Enfermedad() {
    }

    public Enfermedad(String nombre, String descripcion, String sintomas, String tratamiento, String causa, String tipo, String gravedad, String periodoIncubacion, boolean esContagiosa, String fechaDiagnostico) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.sintomas = sintomas;
        this.tratamiento = tratamiento;
        this.causa = causa;
        this.tipo = tipo;
        this.gravedad = gravedad;
        this.periodoIncubacion = periodoIncubacion;
        this.esContagiosa = esContagiosa;
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public String getPeriodoIncubacion() {
        return periodoIncubacion;
    }

    public void setPeriodoIncubacion(String periodoIncubacion) {
        this.periodoIncubacion = periodoIncubacion;
    }

    public boolean isEsContagiosa() {
        return esContagiosa;
    }

    public void setEsContagiosa(boolean esContagiosa) {
        this.esContagiosa = esContagiosa;
    }

    public String getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(String fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", sintomas='" + sintomas + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", causa='" + causa + '\'' +
                ", tipo='" + tipo + '\'' +
                ", gravedad='" + gravedad + '\'' +
                ", periodoIncubacion='" + periodoIncubacion + '\'' +
                ", esContagiosa=" + esContagiosa +
                ", fechaDiagnostico='" + fechaDiagnostico + '\'' +
                '}';
    }
}
