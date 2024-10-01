package org.example.models;

public class Medicamento {
    private String nombre;
    private String principioActivo;
    private String formaFarmaceutica; // Ej: tableta, jarabe, inyección
    private String dosis; // Dosis recomendada
    private String viaAdministracion; // Ej: oral, intravenosa
    private String efectosSecundarios;
    private String contraindicaciones; // Situaciones en las que no debe ser utilizado
    private String fechaCaducidad; // Fecha de caducidad del medicamento
    private String fabricante; // Nombre de la compañía farmacéutica
    private String codigoRegistroSanitario; // Código que identifica el medicamento

    public Medicamento() {
    }

    public Medicamento(String nombre, String principioActivo, String formaFarmaceutica, String dosis, String viaAdministracion, String efectosSecundarios, String contraindicaciones, String fechaCaducidad, String fabricante, String codigoRegistroSanitario) {
        this.nombre = nombre;
        this.principioActivo = principioActivo;
        this.formaFarmaceutica = formaFarmaceutica;
        this.dosis = dosis;
        this.viaAdministracion = viaAdministracion;
        this.efectosSecundarios = efectosSecundarios;
        this.contraindicaciones = contraindicaciones;
        this.fechaCaducidad = fechaCaducidad;
        this.fabricante = fabricante;
        this.codigoRegistroSanitario = codigoRegistroSanitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getViaAdministracion() {
        return viaAdministracion;
    }

    public void setViaAdministracion(String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }

    public String getEfectosSecundarios() {
        return efectosSecundarios;
    }

    public void setEfectosSecundarios(String efectosSecundarios) {
        this.efectosSecundarios = efectosSecundarios;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCodigoRegistroSanitario() {
        return codigoRegistroSanitario;
    }

    public void setCodigoRegistroSanitario(String codigoRegistroSanitario) {
        this.codigoRegistroSanitario = codigoRegistroSanitario;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", principioActivo='" + principioActivo + '\'' +
                ", formaFarmaceutica='" + formaFarmaceutica + '\'' +
                ", dosis='" + dosis + '\'' +
                ", viaAdministracion='" + viaAdministracion + '\'' +
                ", efectosSecundarios='" + efectosSecundarios + '\'' +
                ", contraindicaciones='" + contraindicaciones + '\'' +
                ", fechaCaducidad='" + fechaCaducidad + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", codigoRegistroSanitario='" + codigoRegistroSanitario + '\'' +
                '}';
    }
}
