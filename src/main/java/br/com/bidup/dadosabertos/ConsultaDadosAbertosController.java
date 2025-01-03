package br.com.bidup.dadosabertos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dadosabertos")
public class ConsultaDadosAbertosController {

    private final ConsultaDadosAbertosService consultaDadosAbertosService;

    public ConsultaDadosAbertosController(ConsultaDadosAbertosService consultaDadosAbertosService) {
        this.consultaDadosAbertosService = consultaDadosAbertosService;
    }

    @GetMapping("/contratos")
    public List<ContratosDto> consulta(
            @RequestParam(defaultValue = "1") int pagina,
            @RequestParam(defaultValue = "500") int tamanhoPagina,
            @RequestParam(defaultValue = "2024-01-01") String dataInicial,
            @RequestParam(defaultValue = "2024-01-31") String dataFinal,
            @RequestParam(defaultValue = "6") Integer codigoModalidade
    ){
        var params = new ConsultaPNCPRequestBuilder()
                .paginate(pagina)
                .tamanhoPagina(tamanhoPagina)
                .dataPublicacaoPncpInicial(dataInicial)
                .dataPublicacaoPncpFinal(dataFinal)
                .codigoModalidade(codigoModalidade)
                .build();
        return consultaDadosAbertosService.consularContratos(params);
    }
}
