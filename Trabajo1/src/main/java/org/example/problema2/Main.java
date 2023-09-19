package org.example.problema2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Activo Fijo con parametros: " +new ActivoFijoBuilder("01","Mesa",25.23)
                .addUbicacion("RRHH")
                .addNumeroExistentes(50)
                .addMarca("Vitefama")
                .addProveedor("Vite")
                .addVidaUtilAnios(10)
                .build().toString()
        );

        System.out.println("Activo Fijo con parametros: " + new ActivoFijoBuilder("02","Silla",10.23)
                .addUbicacion("TI")
                .addNumeroExistentes(100)
                .addMarca("Colineal")
                .addProveedor("Colineal")
                .build().toString()
        );

        System.out.println("Activo Fijo basico: " + new ActivoFijoBuilder("03","Catre",100.99)
                .build().toString()
        );


    }
}
