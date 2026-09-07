public class PlanHosting {
    String nombreDominio;
    int capacidadMaximaGB;
    double espacioOcupadoGB;

    public PlanHosting(String nombreDominio, int capacidadMaximaGB, double espacioOcupadoGB) {
        this.nombreDominio = nombreDominio;
        if (capacidadMaximaGB > 0) {
            this.capacidadMaximaGB = capacidadMaximaGB;
        }else {
            System.out.println("Capacidad maxima de GB no puede ser menor");
            this.capacidadMaximaGB = 1;
        }

        if (espacioOcupadoGB > 0) {
            this.espacioOcupadoGB = espacioOcupadoGB;
        }else{
            System.out.println("Espacio ocupado no puede ser menor");
            this.espacioOcupadoGB = 1;
        }

    }

    public void subirArchivos(double pesoGB){

        if (pesoGB <= 0) {
            System.out.println("Error, el peso tiene que ser mayor a 0");

        } else if (espacioOcupadoGB + pesoGB <= capacidadMaximaGB) {
            espacioOcupadoGB += pesoGB;
            System.out.println("El archivo se subio correctamente");
        }else {
            System.out.println("No se puede subir el archivo");
            System.out.println("Supera la cantidad maxima de "+capacidadMaximaGB);
        }

    }

    public void mostrarDetalles(){
        System.out.println("Nombre dominio: "+nombreDominio);
        System.out.println("Capacidad maxima: "+capacidadMaximaGB);
        System.out.println("Espacio ocupado: "+espacioOcupadoGB);

    }


}
