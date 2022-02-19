import java.util.ArrayList;
import java.util.List;

public class GoogleDrive {



    private EstadoPrograma estadoPrograma;
    private List<EstadoPrograma> memento = new ArrayList<EstadoPrograma>();

    public EstadoPrograma getProgram() {
        return this.estadoPrograma;
    }

    public void setProgram(EstadoPrograma estadoPrograma) {
        this.estadoPrograma = estadoPrograma;
        this.memento.add(this.estadoPrograma);
    }

    public void restoreProgram(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Program not found");
        }
        this.estadoPrograma = this.memento.get(indice);
    }

    public List<EstadoPrograma> getAllPrograms() {
        return this.memento;
    }
}
