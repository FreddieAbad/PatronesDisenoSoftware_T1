package com.mycompany.p2t1.modelo;

public class ActivoFijoBuilder{
    private ActivoFijo activoFijo;
    public ActivoFijoBuilder(String codigo, String nombres, double precio) {
        activoFijo=new ActivoFijo(codigo, nombres, precio);
    }
    public ActivoFijoBuilder addMarca(String marca) {
        this.activoFijo.setMarca(marca);
        return this;
    }
    public ActivoFijoBuilder addProveedor(String proveedor) {
        this.activoFijo.setMarca(proveedor);
        return this;
    }
    public ActivoFijoBuilder addNumeroExistentes(int numeroExistentes) {
        this.activoFijo.setNumeroExistentes(numeroExistentes);
        return this;
    }
    public ActivoFijoBuilder addVidaUtilAnios(int vidaUtilAnios) {
        this.activoFijo.setVidaUtilAnios(vidaUtilAnios);
        return this;
    }
    public ActivoFijoBuilder addUbicacion(String ubicacion) {
        this.activoFijo.setUbicacion(ubicacion);
        return this;
    }
    public ActivoFijo build() {
        System.out.println(">> "+ this.activoFijo.toString());
        return this.activoFijo;
    }
}
