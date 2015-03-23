package br.com.sample.service;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.sample.entity.Demanda;


@Repository
@Transactional
public class DemandaService extends BaseService<Long, Demanda> {

	public Demanda buscaPorNome(String nome) {
		try {
			Query query = em.createQuery("select p from Animal p where p.cliente.id = ?");
			query.setParameter(1, nome);
			return (Demanda) query.getSingleResult();
		} catch (Exception e) {
		}
		return null;
	}

}
