package com.banquito.core.cuentastrx.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CuentaRQ implements Serializable {
    private String codigoProducto;
    private String codigoCliente;
    private String codigoAgencia;
    private String estado;
}
