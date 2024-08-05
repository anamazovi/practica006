package es.cic.curso;

public class MiClase {
    private final MiDependencia dependencia;

    public MiClase(MiDependencia dependencia) {
        this.dependencia = dependencia;
    }

    public String miMetodo() {
        return dependencia.metodo();
    }
}
