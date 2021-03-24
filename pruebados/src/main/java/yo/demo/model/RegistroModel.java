package yo.demo.model;

import com.google.gson.annotations.SerializedName;

public class RegistroModel {
    @SerializedName("operando1")
    private int operando1;
    @SerializedName("operando2")
    private int operando2;
    @SerializedName("resultado")
    private int resultado;
    @SerializedName("nombre")
    private String nombre;

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
