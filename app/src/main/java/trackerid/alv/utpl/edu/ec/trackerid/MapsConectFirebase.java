package trackerid.alv.utpl.edu.ec.trackerid;

public class MapsConectFirebase {
    private double latitud;
    private double longitud;
    private double kmh;

    public MapsConectFirebase() {
    }

    public MapsConectFirebase(double latitud, double longitud, double kmh) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.kmh = kmh;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getKmh() {
        return kmh;
    }

    public void setKmh(double kmh) {
        this.kmh = kmh;
    }
}
