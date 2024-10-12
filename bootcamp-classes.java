// Classe abstrata para representar conteúdo educacional
public abstract class ConteudoEducacional {
    protected String titulo;
    protected String descricao;
    
    public abstract double calcularXP();
}

public class Curso extends ConteudoEducacional {
    private int cargaHoraria;
    
    @Override
    public double calcularXP() {
        return 10 * cargaHoraria;
    }
}

public class Mentoria extends ConteudoEducacional {
    private LocalDate data;
    
    @Override
    public double calcularXP() {
        return 15;
    }
}

public class Dev {
    private String nome;
    private Set<ConteudoEducacional> conteudosInscritos;
    private Set<ConteudoEducacional> conteudosConcluidos;
    
    public void inscreverBootcamp(Bootcamp bootcamp) {
        // Implementação
    }
    
    public void progredir() {
        // Implementação
    }
    
    public double calcularTotalXP() {
        // Implementação
    }
}

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private Set<Dev> devsInscritos;
    private Set<ConteudoEducacional> conteudos;
}
