package org.example.models;

public class SignoVital {

    private String tipo; // Ej: frecuencia cardíaca, presión arterial
    private double valor; // Valor medido
    private String unidad; // Unidad de medida (ej: bpm, mmHg)
    private String fechaMedicion; // Fecha en que se tomó la medida
    private String horaMedicion; // Hora de la medición
    private String pacienteId; // Identificación del paciente
    private String observaciones; // Notas adicionales sobre la medición
    private boolean esAnormal; // Indica si el valor está fuera de lo normal
    private String rangoNormal; // Rango normal para el signo vital
    private String personalSalud; // Nombre del profesional que realizó la medición

    public SignoVital(String tipo, double valor, String unidad, String fechaMedicion, String horaMedicion, String pacienteId, String observaciones, boolean esAnormal, String rangoNormal, String personalSalud) {
        this.tipo = tipo;
        this.valor = valor;
        this.unidad = unidad;
        this.fechaMedicion = fechaMedicion;
        this.horaMedicion = horaMedicion;
        this.pacienteId = pacienteId;
        this.observaciones = observaciones;
        this.esAnormal = esAnormal;
        this.rangoNormal = rangoNormal;
        this.personalSalud = personalSalud;
    }

    public SignoVital() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(String fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }

    public String getHoraMedicion() {
        return horaMedicion;
    }

    public void setHoraMedicion(String horaMedicion) {
        this.horaMedicion = horaMedicion;
    }

    public String getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(String pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isEsAnormal() {
        return esAnormal;
    }

    public void setEsAnormal(boolean esAnormal) {
        this.esAnormal = esAnormal;
    }

    public String getRangoNormal() {
        return rangoNormal;
    }

    public void setRangoNormal(String rangoNormal) {
        this.rangoNormal = rangoNormal;
    }

    public String getPersonalSalud() {
        return personalSalud;
    }

    public void setPersonalSalud(String personalSalud) {
        this.personalSalud = personalSalud;
    }

    @Override
    public String toString() {
        return "SignoVital{" +
                "tipo='" + tipo + '\'' +
                ", valor=" + valor +
                ", unidad='" + unidad + '\'' +
                ", fechaMedicion='" + fechaMedicion + '\'' +
                ", horaMedicion='" + horaMedicion + '\'' +
                ", pacienteId='" + pacienteId + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", esAnormal=" + esAnormal +
                ", rangoNormal='" + rangoNormal + '\'' +
                ", personalSalud='" + personalSalud + '\'' +
                '}';
    }
}
