package org.example;
import org.example.models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //hacer dos objetos para las cinco clases, uno lleno y otro vacio

        Scanner input = new Scanner(System.in);

        //Enfermedad:


        Enfermedad enfermedad = new Enfermedad();


        Enfermedad gripe = new Enfermedad(
                "Gripe",
                "Infección viral que afecta las vías respiratorias.",
                "Fiebre, tos, dolor de garganta, congestión nasal.",
                "Descanso, hidratación, medicamentos antivirales si es necesario.",
                "Virus de la gripe.",
                "Viral",
                "Leve a moderada",
                "1 a 4 días",
                true,
                "2024-09-30"
        );

        //Medicamento

        Medicamento medicamento = new Medicamento();

        Medicamento paracetamol = new Medicamento(
                "Paracetamol",
                "Paracetamol",
                "Tableta",
                "500 mg cada 8 horas",
                "Oral",
                "Náuseas, erupciones cutáneas en algunos casos.",
                "Hipersensibilidad al paracetamol, enfermedades hepáticas graves.",
                "2025-12-31",
                "Farmacéutica ABC",
                "F123456"
        );

        //Medico

        Medico medico = new Medico();

        Medico juanPerez = new Medico(
                "Dr. Juan Pérez",
                "Calle Falsa 123",
                "3001234567",
                45,
                15000,
                true,
                3,
                "O+",
                "Cardiología",
                "Sí",
                2,
                5000,
                false,
                4,
                "Lunes a Viernes, 8am a 4pm"
        );

        // Paciente

        Paciente paciente = new Paciente();

        Paciente mariaLopez = new Paciente(
                "María López",
                "Avenida Siempre Viva 456",
                "3109876543",
                30,
                20000,
                true,
                2,
                "A+",
                "Dr. Juan Pérez",
                "Ingeniera de software",
                "Carlos López",
                5000,
                false,
                3,
                true
        );

        //Signo Vital

        SignoVital signoVital = new SignoVital();

        SignoVital presionArterial = new SignoVital(
                "Presión arterial",
                120.0,
                "mmHg",
                "2024-10-01",
                "08:30",
                "P001",
                "Valor normal.",
                false,
                "90-120 mmHg",
                "Dra. Ana Martínez"
        );

        ///////////////////////////////////////////////////////////////////////////////////////////////////


        // Dandole valores al constructor vacio de Enfermedad
        System.out.println("Ingrese el nombre");
        enfermedad.setNombre(input.nextLine());

        System.out.println("Ingrese la descripcion");
        enfermedad.setDescripcion(input.nextLine());

        System.out.println("Ingrese la información de sintomas");
        enfermedad.setSintomas(input.nextLine());

        System.out.println("Ingrese la información de tratamiento");
        enfermedad.setTratamiento(input.nextLine());

        System.out.println("Ingrese la información de causa");
        enfermedad.setCausa(input.nextLine());

        System.out.println("Ingrese la información de tipo");
        enfermedad.setTipo(input.nextLine());

        System.out.println("Ingrese la información de gravedad");
        enfermedad.setGravedad(input.nextLine());

        System.out.println("Ingrese la información de periodo de incubacion");
        enfermedad.setPeriodoIncubacion(input.nextLine());

        System.out.println("Ingrese la información de si es contagiosa (true/false)");
        enfermedad.setEsContagiosa(input.nextBoolean());
        input.nextLine(); // Limpiar el buffer

        System.out.println("Ingrese la información de la fecha de diagnostico");
        enfermedad.setFechaDiagnostico(input.nextLine());

        System.out.println(enfermedad);


        //////////////////////////////////////////////////////////////////////////////////////////////////

        //Llenando constructor de medicamento:
        System.out.println("Ingrese el nombre");
        medicamento.setNombre(input.nextLine());

        System.out.println("Ingrese el principio activo");
        medicamento.setPrincipioActivo(input.nextLine());

        System.out.println("Ingrese la forma farmacéutica (ej: tableta, jarabe, inyección)");
        medicamento.setFormaFarmaceutica(input.nextLine());

        System.out.println("Ingrese la dosis recomendada");
        medicamento.setDosis(input.nextLine());

        System.out.println("Ingrese la vía de administración (ej: oral, intravenosa)");
        medicamento.setViaAdministracion(input.nextLine());

        System.out.println("Ingrese los efectos secundarios");
        medicamento.setEfectosSecundarios(input.nextLine());

        System.out.println("Ingrese las contraindicaciones");
        medicamento.setContraindicaciones(input.nextLine());

        System.out.println("Ingrese la fecha de caducidad");
        medicamento.setFechaCaducidad(input.nextLine());

        System.out.println("Ingrese el fabricante");
        medicamento.setFabricante(input.nextLine());

        System.out.println("Ingrese el código de registro sanitario");
        medicamento.setCodigoRegistroSanitario(input.nextLine());

        // Mostrar los datos ingresados
        System.out.println(medicamento);


        /////////////////////////////////////////////////////////////////////////////////////////////

        //Ingresando datos médico

        System.out.println("Ingrese el nombre");
        medico.setNombre(input.nextLine());

        System.out.println("Ingrese la dirección");
        medico.setDireccion(input.nextLine());

        System.out.println("Ingrese el teléfono");
        medico.setTelefono(input.nextLine());

        System.out.println("Ingrese la edad");
        medico.setEdad(input.nextInt());

        System.out.println("Ingrese el monto en la billetera");
        medico.setBilletera(input.nextInt());

        System.out.println("¿Es afiliado? (true/false)");
        medico.setEsAfiliado(input.nextBoolean());
        input.nextLine();

        System.out.println("Ingrese el estrato");
        medico.setEstrato(input.nextInt());

        input.nextLine();
        System.out.println("Ingrese el tipo de sangre");
        medico.setTipoSangre(input.nextLine());

        System.out.println("Ingrese el área de trabajo");
        medico.setAreaTrabajo(input.nextLine());

        System.out.println("¿Es profesional? (true/false)");
        medico.setEsProfesional(input.nextLine());

        System.out.println("¿Cuántos familiares tiene afiliados?");
        medico.setTieneFamiliaAfiliada(input.nextInt());

        System.out.println("Ingrese el valor de la nómina");
        medico.setValorNomina(input.nextInt());

        System.out.println("¿Es director? (true/false)");
        medico.setEsDirector(input.nextBoolean());

        System.out.println("Ingrese la cantidad de familiares");
        medico.setCantidadFamiliares(input.nextInt());

        input.nextLine();
        System.out.println("Ingrese la jornada de trabajo");
        medico.setJornadaTrabajo(input.nextLine());

        // Mostrar los datos ingresados
        System.out.println("\nInformación del médico:");
        System.out.println(medico);

        ////////////////////////////////////////////////////////////////////////////////////////////
        //Ingresar datos Paciente

        System.out.println("Ingrese el nombre");
        paciente.setNombre(input.nextLine());

        System.out.println("Ingrese la dirección");
        paciente.setDireccion(input.nextLine());

        System.out.println("Ingrese el teléfono");
        paciente.setTelefono(input.nextLine());

        System.out.println("Ingrese la edad");
        paciente.setEdad(input.nextInt());

        System.out.println("Ingrese el monto en la billetera");
        paciente.setBilletera(input.nextInt());

        System.out.println("¿Es subsidiado? (true/false)");
        paciente.setEsSubsidiado(input.nextBoolean());
        input.nextLine();

        System.out.println("Ingrese el estrato");
        paciente.setEstrato(input.nextInt());

        input.nextLine();
        System.out.println("Ingrese el tipo de sangre");
        paciente.setTipoSangre(input.nextLine());

        System.out.println("Ingrese el médico de familia");
        paciente.setMedicoFamilia(input.nextLine());

        System.out.println("Ingrese el empleo");
        paciente.setEmpleo(input.nextLine());

        System.out.println("Ingrese el familiar responsable");
        paciente.setFamiliarResponsable(input.nextLine());

        System.out.println("Ingrese el valor del subsidio");
        paciente.setValorSubsidio(input.nextInt());

        System.out.println("¿Tiene enfermedad terminal? (true/false)");
        paciente.setTieneEnfermedadTerminal(input.nextBoolean());

        System.out.println("Ingrese la cantidad de familiares");
        paciente.setCantidadFamiliares(input.nextInt());

        System.out.println("¿Es independiente? (true/false)");
        paciente.setEsIndependiente(input.nextBoolean());

        // Mostrar los datos ingresados
        System.out.println("\nInformación del paciente:");
        System.out.println(paciente);

        input.nextLine();

        System.out.println("\n");

        ////////////////////////////////////////////////////////////////////////////////

        // Ingresando los datos de Signo Vital

        System.out.println("Ingrese el tipo (ej: frecuencia cardíaca, presión arterial)");
        signoVital.setTipo(input.nextLine());

        System.out.println("Ingrese el valor medido");
        signoVital.setValor(input.nextDouble());

        input.nextLine();
        System.out.println("Ingrese la unidad de medida (ej: bpm, mmHg)");
        signoVital.setUnidad(input.nextLine());

        System.out.println("Ingrese la fecha de medición");
        signoVital.setFechaMedicion(input.nextLine());

        System.out.println("Ingrese la hora de medición");
        signoVital.setHoraMedicion(input.nextLine());

        System.out.println("Ingrese la identificación del paciente");
        signoVital.setPacienteId(input.nextLine());

        System.out.println("Ingrese observaciones adicionales");
        signoVital.setObservaciones(input.nextLine());

        System.out.println("¿Es anormal? (true/false)");
        signoVital.setEsAnormal(input.nextBoolean());

        input.nextLine();
        System.out.println("Ingrese el rango normal para el signo vital");
        signoVital.setRangoNormal(input.nextLine());

        System.out.println("Ingrese el nombre del profesional que realizó la medición");
        signoVital.setPersonalSalud(input.nextLine());

        // Mostrar los datos ingresados
        System.out.println("\nInformación del signo vital:");
        System.out.println(signoVital);







    }
}