package com.banquito.core.cuentastrx.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class CuentaRS implements Serializable {

    private String codigo;
    private String codigoProducto;
    private String codigoCliente;
    private String codigoAgencia;
    private String numeroCuenta;
    private Date fechaCreacion;
    private BigDecimal saldoDisponible;
    private BigDecimal saldoContable;
    private Date fechaUltimaActualizacion;
    
}
