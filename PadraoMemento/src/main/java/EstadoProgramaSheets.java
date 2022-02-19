public class EstadoProgramaSheets  implements  EstadoPrograma{

    private EstadoProgramaSheets() {};
    private static EstadoProgramaSheets instance = new EstadoProgramaSheets();
    public static EstadoProgramaSheets getInstance() {
        return instance;
    }

    @Override
    public String getNomePrograma() {
        return null;
    }
}
