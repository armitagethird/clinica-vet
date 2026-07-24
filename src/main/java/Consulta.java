import java.time.LocalDate;

public class Consulta {
    private String pet;
    private String tutor;
    private LocalDate data;
    private String motivo;
    private String veterinario;
    private String observacoes;
    private boolean retorno;

    public boolean dataValida(){
        return data != null && !data.isBefore(LocalDate.now());
    }
}

