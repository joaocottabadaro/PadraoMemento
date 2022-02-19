public class EstadoProgramaDoc  implements  EstadoPrograma{
    private EstadoProgramaDoc() {};
    private static EstadoProgramaDoc instance = new EstadoProgramaDoc();
    public static EstadoProgramaDoc getInstance() {
        return instance;
    }


    @Override
    public String getNomePrograma() {
        return null;
    }
}
