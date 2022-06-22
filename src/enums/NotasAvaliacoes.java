
package enums;

public enum NotasAvaliacoes {
    RU("RUIM"),
    RE("REGULAR"),
    BO("BOM"),
    OT("ÓTIMO"),
    EX("EXCELENTE");
    
    private String descricao;
    
    private NotasAvaliacoes(String descricao) {
        this.descricao = descricao;    
    }
    
    @Override
    public String toString() {
        return descricao;
    }
}
