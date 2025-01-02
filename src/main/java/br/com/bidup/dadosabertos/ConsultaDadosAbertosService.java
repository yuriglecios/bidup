package br.com.bidup.dadosabertos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Map;

@Service
public class ConsultaDadosAbertosService {

    private static final String URLBASE = "https://dadosabertos.compras.gov.br/modulo-contratacoes/1_consultarContratacoes_PNCP_14133";

    private final RestTemplateConfig restTemplateConfig;

    @Autowired
    public ConsultaDadosAbertosService(RestTemplateConfig restTemplateConfig) {
        this.restTemplateConfig = restTemplateConfig;
    }

    public List<Contratos> consularContratos(Map<String, String> params) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URLBASE);
        params.forEach(builder::queryParam);
        String url = builder.toUriString();
        Contratos[] contratos = restTemplateConfig.restTemplate().getForObject(url, Contratos[].class);
        return List.of(contratos);
    }
}