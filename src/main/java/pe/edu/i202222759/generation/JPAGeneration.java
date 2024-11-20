package pe.edu.i202222759.generation;

import jakarta.persistence.Persistence;

public class JPAGeneration {

    public static void main(String[] args) {
        //regenerar schema - esquema de base de datos
        //Va a ejecutar todos los scripts
        Persistence.generateSchema("world",null);

    }

}
