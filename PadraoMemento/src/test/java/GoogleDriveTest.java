import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class GoogleDriveTest {

    @Test
    public  void deveArmazenarProgramas() {
        GoogleDrive googleDrive = new GoogleDrive();
        googleDrive.setProgram(EstadoProgramaDoc.getInstance());
        googleDrive.setProgram(EstadoProgramaSlide.getInstance());
        googleDrive.setProgram(EstadoProgramaSheets.getInstance());
        assertEquals(3, googleDrive.getAllPrograms().size());
    }

    @Test
    public  void deveRetornarProgramaInicial() {
        GoogleDrive googleDrive = new GoogleDrive();
        googleDrive.setProgram(EstadoProgramaDoc.getInstance());
        googleDrive.setProgram(EstadoProgramaSlide.getInstance());
        googleDrive.restoreProgram(0);
        assertEquals(EstadoProgramaDoc.getInstance(), googleDrive.getProgram());
    }

    @Test
    public  void deveRetornarProgramaAnterior() {
        GoogleDrive googleDrive = new GoogleDrive();
        googleDrive.setProgram(EstadoProgramaDoc.getInstance());
        googleDrive.setProgram(EstadoProgramaSlide.getInstance());
        googleDrive.setProgram(EstadoProgramaSheets.getInstance());
        googleDrive.restoreProgram(1);
        assertEquals(EstadoProgramaSlide.getInstance(), googleDrive.getProgram());
    }

    @Test
    public void deveRetornarExcecaoProgramaInvalido() {
        try {
            GoogleDrive googleDrive = new GoogleDrive();
            googleDrive.restoreProgram(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Program not found", e.getMessage());
        }
    }
}
