package org.example.models;

public class Medico {
    private String nombre;
    private String direccion;
    private String telefono;
    private Integer edad;
    private Integer billetera;
    private Boolean esAfiliado;
    private Integer estrato;
    private String tipoSangre;
    private String areaTrabajo;
    private String esProfesional;
    private Integer tieneFamiliaAfiliada;
    private Integer valorNomina;
    private Boolean esDirector;
    private Integer cantidadFamiliares;
    private String jornadaTrabajo;

    public Medico() {
    }

    public Medico(String nombre, String direccion, String telefono, Integer edad, Integer billetera, Boolean esAfiliado, Integer estrato, String tipoSangre, String areaTrabajo, String esProfesional, Integer tieneFamiliaAfiliada, Integer valorNomina, Boolean esDirector, Integer cantidadFamiliares, String jornadaTrabajo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.billetera = billetera;
        this.esAfiliado = esAfiliado;
        this.estrato = estrato;
        this.tipoSangre = tipoSangre;
        this.areaTrabajo = areaTrabajo;
        this.esProfesional = esProfesional;
        this.tieneFamiliaAfiliada = tieneFamiliaAfiliada;
        this.valorNomina = valorNomina;
        this.esDirector = esDirector;
        this.cantidadFamiliares = cantidadFamiliares;
        this.jornadaTrabajo = jornadaTrabajo;
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

    public Boolean getEsAfiliado() {
        return esAfiliado;
    }

    public void setEsAfiliado(Boolean esAfiliado) {
        this.esAfiliado = esAfiliado;
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

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public String getEsProfesional() {
        return esProfesional;
    }

    public void setEsProfesional(String esProfesional) {
        this.esProfesional = esProfesional;
    }

    public Integer getTieneFamiliaAfiliada() {
        return tieneFamiliaAfiliada;
    }

    public void setTieneFamiliaAfiliada(Integer tieneFamiliaAfiliada) {
        this.tieneFamiliaAfiliada = tieneFamiliaAfiliada;
    }

    public Integer getValorNomina() {
        return valorNomina;
    }

    public void setValorNomina(Integer valorNomina) {
        this.valorNomina = valorNomina;
    }

    public Boolean getEsDirector() {
        return esDirector;
    }

    public void setEsDirector(Boolean esDirector) {
        this.esDirector = esDirector;
    }

    public Integer getCantidadFamiliares() {
        return cantidadFamiliares;
    }

    public void setCantidadFamiliares(Integer cantidadFamiliares) {
        this.cantidadFamiliares = cantidadFamiliares;
    }

    public String getJornadaTrabajo() {
        return jornadaTrabajo;
    }

    public void setJornadaTrabajo(String jornadaTrabajo) {
        this.jornadaTrabajo = jornadaTrabajo;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", billetera=" + billetera +
                ", esAfiliado=" + esAfiliado +
                ", estrato=" + estrato +
                ", tipoSangre='" + tipoSangre + '\'' +
                ", areaTrabajo='" + areaTrabajo + '\'' +
                ", esProfesional='" + esProfesional + '\'' +
                ", tieneFamiliaAfiliada=" + tieneFamiliaAfiliada +
                ", valorNomina=" + valorNomina +
                ", esDirector=" + esDirector +
                ", cantidadFamiliares=" + cantidadFamiliares +
                ", jornadaTrabajo='" + jornadaTrabajo + '\'' +
                '}';
    }
}
