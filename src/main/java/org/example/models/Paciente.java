package org.example.models;

public class Paciente {

    private String nombre;
    private String direccion;
    private String telefono;
    private Integer edad;
    private Integer billetera;
    private Boolean esSubsidiado;
    private Integer estrato;
    private String tipoSangre;
    private String medicoFamilia;
    private String empleo;
    private String familiarResponsable;
    private Integer valorSubsidio;
    private Boolean tieneEnfermedadTerminal;
    private Integer cantidadFamiliares;
    private Boolean esIndependiente;

    public Paciente(String nombre, String direccion, String telefono, Integer edad, Integer billetera, Boolean esSubsidiado, Integer estrato, String tipoSangre, String medicoFamilia, String empleo, String familiarResponsable, Integer valorSubsidio, Boolean tieneEnfermedadTerminal, Integer cantidadFamiliares, Boolean esIndependiente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.billetera = billetera;
        this.esSubsidiado = esSubsidiado;
        this.estrato = estrato;
        this.tipoSangre = tipoSangre;
        this.medicoFamilia = medicoFamilia;
        this.empleo = empleo;
        this.familiarResponsable = familiarResponsable;
        this.valorSubsidio = valorSubsidio;
        this.tieneEnfermedadTerminal = tieneEnfermedadTerminal;
        this.cantidadFamiliares = cantidadFamiliares;
        this.esIndependiente = esIndependiente;
    }

    public Paciente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getBilletera() {
        return billetera;
    }

    public void setBilletera(Integer billetera) {
        this.billetera = billetera;
    }

    public Boolean getEsSubsidiado() {
        return esSubsidiado;
    }

    public void setEsSubsidiado(Boolean esSubsidiado) {
        this.esSubsidiado = esSubsidiado;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getMedicoFamilia() {
        return medicoFamilia;
    }

    public void setMedicoFamilia(String medicoFamilia) {
        this.medicoFamilia = medicoFamilia;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    public String getFamiliarResponsable() {
        return familiarResponsable;
    }

    public void setFamiliarResponsable(String familiarResponsable) {
        this.familiarResponsable = familiarResponsable;
    }

    public Integer getValorSubsidio() {
        return valorSubsidio;
    }

    public void setValorSubsidio(Integer valorSubsidio) {
        this.valorSubsidio = valorSubsidio;
    }

    public Boolean getTieneEnfermedadTerminal() {
        return tieneEnfermedadTerminal;
    }

    public void setTieneEnfermedadTerminal(Boolean tieneEnfermedadTerminal) {
        this.tieneEnfermedadTerminal = tieneEnfermedadTerminal;
    }

    public Integer getCantidadFamiliares() {
        return cantidadFamiliares;
    }

    public void setCantidadFamiliares(Integer cantidadFamiliares) {
        this.cantidadFamiliares = cantidadFamiliares;
    }

    public Boolean getEsIndependiente() {
        return esIndependiente;
    }

    public void setEsIndependiente(Boolean esIndependiente) {
        this.esIndependiente = esIndependiente;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", billetera=" + billetera +
                ", esSubsidiado=" + esSubsidiado +
                ", estrato=" + estrato +
                ", tipoSangre='" + tipoSangre + '\'' +
                ", medicoFamilia='" + medicoFamilia + '\'' +
                ", empleo='" + empleo + '\'' +
                ", familiarResponsable='" + familiarResponsable + '\'' +
                ", valorSubsidio=" + valorSubsidio +
                ", tieneEnfermedadTerminal=" + tieneEnfermedadTerminal +
                ", cantidadFamiliares=" + cantidadFamiliares +
                ", esIndependiente=" + esIndependiente +
                '}';
    }
}
