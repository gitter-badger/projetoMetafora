package br.gov.rn.saogoncalo.localizacao

import br.gov.rn.saogoncalo.pessoa.Reside

class Bairro {
	
	String bairro
	Municipio municipio
	
	static hasMany = [reside:Reside]
	
	static constraints = {
		bairro blank:false, nullable:false
	}
	
	static mapping = {
		table name: "bairro", schema:"cadastro_unico_localizacao"
		version false
		id generator: 'sequence', params:[sequence:'cadastro_unico_localizacao.bairro_id_seq']
		}
}
