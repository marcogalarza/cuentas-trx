package com.banquito.core.cuentastrx.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class TransaccionCuenta {
    
    private String codigo;
    private String transaccionId;
    private String codigoCuenta;
    private String codigoAgencia;
    private String tipo;
    private BigDecimal valorCredito;
    private BigDecimal valorDebito;
    private BigDecimal saldoInicial;
    private BigDecimal saldoFinal;
    private Date fechaSolicitud;
    private Date fechaEjecucion;
    private String referencia;

    private CuentaCliente cuenta;
    
}
