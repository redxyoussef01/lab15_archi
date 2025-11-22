package com.example.banque_service.entities;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


public class TransactionRequest {
    private Long compteId;
    private double montant;
    private Date date;
    private TypeTransaction type;
	public Long getCompteId() {
		return compteId;
	}
	public void setCompteId(Long compteId) {
		this.compteId = compteId;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public TypeTransaction getType() {
		return type;
	}
	public void setType(TypeTransaction type) {
		this.type = type;
	}
    
    
}