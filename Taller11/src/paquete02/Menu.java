package paquete02;

public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String np, double vim) {
        nombrePlato = np;
        valorInicialMenu = vim;
    }
    
    public void establecerNombrePlato(String np) {
        nombrePlato = np;
    }

    public abstract void calcularValorMenu();

    public void establecerValorInicialMenu(double vim) {
        valorInicialMenu = vim;
    }
    
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }
    
    public double obtenerValorInicialMenu(){
        return valorInicialMenu;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre del Plato: %s\n"
                + "Valor del Menú: %.2f\n"
                + "ValorInicialMenu: %.2f\n\n", nombrePlato, valorMenu, valorInicialMenu);
        return cadena;
    }
}
