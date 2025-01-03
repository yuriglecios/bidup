package br.com.bidup.dadosabertos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {

    private List<ContratosDto> resultado;

    private Integer totalRegistros;

    private Integer totalPaginas;

    private Integer paginasRestantes;

    public List<ContratosDto> getResultado() {
        return resultado;
    }

    public void setResultado(List<ContratosDto> resultado) {
        this.resultado = resultado;
    }

    public Integer getTotalRegistros() {
        return totalRegistros;
    }

    public void setTotalRegistros(Integer totalRegistros) {
        this.totalRegistros = totalRegistros;
    }

    public Integer getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(Integer totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public Integer getPaginasRestantes() {
        return paginasRestantes;
    }

    public void setPaginasRestantes(Integer paginasRestantes) {
        this.paginasRestantes = paginasRestantes;
    }

}
