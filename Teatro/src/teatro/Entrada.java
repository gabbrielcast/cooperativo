package teatro;

import java.time.LocalDate;

enum TipoEntrada {
    PATIO_BUTACAS, PALCO, PISO
}

public class Entrada {

    private double precioBase = 30;
    private final String obra;
    private final LocalDate fecha;
    private final String asiento;
    private final TipoEntrada butaca;

    public Entrada(String obra, String asiento, TipoEntrada butaca) {
        this.obra = obra;
        this.asiento = asiento;
        this.butaca = butaca;
        fecha = LocalDate.now();
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getObra() {
        return obra;
    }

    public String getAsiento() {
        return asiento;
    }

    public TipoEntrada getButaca() {
        return butaca;
    }

    public double precio() {
        switch (butaca) {

            case PALCO:
                precioBase += ((precioBase * 8) / 100);
                break;
            case PATIO_BUTACAS:
                precioBase += ((precioBase * 12) / 100);
                break;
        }
        return precioBase;
    }

    public double precio(double descuento) {
        precioBase -= (precioBase * descuento / 100);
        return precioBase;
    }

    public double precio(boolean traductor) {
        if (traductor == true) {
            precioBase = precioBase + (precioBase * 7 / 100);
        }
        return precioBase;
    }
}
