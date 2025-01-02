package br.com.bidup.dadosabertos;

import java.util.HashMap;
import java.util.Map;

public class ConsultaPNCPRequestBuilder {

    private final Map<String, String> params = new HashMap<>();

    private ConsultaPNCPRequestBuilder paginate(int pagina) {
        params.put("pagina", String.valueOf(pagina));
        return this;
    }

    private ConsultaPNCPRequestBuilder tamanhoPagina(int tamanhoPagina) {
        params.put("tamanhoPagina", String.valueOf(tamanhoPagina));
        return this;
    }

    public ConsultaPNCPRequestBuilder dataPublicacaoPncpInicial(String dataInicial) {
        params.put("dataPublicacaoPncpInicial", dataInicial);
        return this;
    }

    public ConsultaPNCPRequestBuilder dataPublicacaoPncpFinal(String dataFinal) {
        params.put("dataPublicacaoPncpFinal", dataFinal);
        return this;
    }

    public ConsultaPNCPRequestBuilder codigoModalidade(int codigoModalidade) {
        params.put("codigoModalidade", String.valueOf(codigoModalidade));
        return this;
    }

    public Map<String, String> build() {
        return params;
    }
}
