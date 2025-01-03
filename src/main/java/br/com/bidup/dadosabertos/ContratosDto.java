package br.com.bidup.dadosabertos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class ContratosDto {

    @JsonProperty("idCompra")
    private String numeroControlePncp;

    @JsonProperty("anoCompraPncp")
    private Long anoCompraPncp;

    @JsonProperty("sequencialCompraPncp")
    private Integer sequencialCompraPncp;

    private String orgaoEntidadeCnpj;

    private String orgaoSubrogadoCnpj;

    private Long codigoOrgao;

    private String orgaoEntidadeRazaoSocial;

    private String orgaoSubrogadoRazaoSocial;

    private String orgaoEntidadeEsferaId;

    private String orgaoSubrogadoEsferaId;

    private String orgaoEntidadePoderId;

    private String orgaoSubrogadoPoderId;

    private String unidadeOrgaoCodigoUnidade;

    private String unidadeSubrogadaCodigoUnidade;

    private String unidadeOrgaoNomeUnidade;

    private String unidadeSubrogadaNomeUnidade;

    private String unidadeOrgaoUfSigla;

    private String unidadeSubrogadaUfSigla;

    private String unidadeOrgaoMunicipioNome;

    private String unidade_subrogada_municipio_nome;

    private Long unidadeOrgaoCodigoIbge;

    private Long unidadeSubrogadaCodigoIbge;

    private Long numeroCompra;

    private Long modalidadeIdPncp;

    private Long codigoModalidade;

    private String modalidadeNome;

    private boolean srp;

    private Long modoDisputaIdPncp;

    private Long codigoModoDisputa;

    private Long amparoLegalCodigoPncp;

    private String amparoLegalNome; // 250 caracteres

    private String amparoLegalDescricao; // campo tipo text

    private String informacaoComplementar; // campo tipo text

    private String processo;

    private String objetoCompra; // campo tipo text

    private boolean existeResultado;

    private Long orcamentoSigilosoCodigo;

    private String orcamentoSigilosoDescricao;

    private Long situacaoCompraIdPncp;

    private String situacaoCompraNomePncp;

    private Long tipoInstrumentoConvocatorioCodigoPncp;

    private String tipoInstrumentoConvocatorioNome;

    private String modoDisputaNomePncp;

    private BigDecimal valorTotalEstimado; // tipo numeric

    private BigDecimal valorTotalHomologado; // tipo numeric

    private LocalDateTime dataInclusaoPncp;

    private LocalDateTime dataAualizacaoPncp;

    private LocalDateTime dataPublicacaoPncp;

    private LocalDateTime dataAberturaPropostaPncp;

    private LocalDateTime dataEncerramentoPropostaPncp;
}
