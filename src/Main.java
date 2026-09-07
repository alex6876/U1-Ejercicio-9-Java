public class Main {
    public static void main(String[] args) {
        PlanHosting planHosting = new PlanHosting("netero.com", 15, 5);
        planHosting.mostrarDetalles();
        planHosting.subirArchivos(5.5);
        planHosting.subirArchivos(2.5);
        planHosting.subirArchivos(5.8);
        planHosting.mostrarDetalles();
    }
}