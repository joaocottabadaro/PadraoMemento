public class EstadoProgramaSlide  implements  EstadoPrograma{

    private EstadoProgramaSlide() {};
    private static EstadoProgramaSlide instance = new EstadoProgramaSlide();
    public static EstadoProgramaSlide getInstance() {
        return instance;
    }
    @Override
    public String getNomePrograma() {
        return null;
    }
}
