package br.com.bidup.dadosabertos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Contratos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String idCompra;

    private String numeroControlePncp;

    private Long anoCompraPncp;

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
