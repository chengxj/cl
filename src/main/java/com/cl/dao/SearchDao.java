package com.cl.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cl.entity.Relic;

@Repository
@Transactional(value = "transactionManager", noRollbackFor = { NoResultException.class })
public class SearchDao {

	@PersistenceContext(unitName = "entityManagerFactory")
	private EntityManager entityManager;
	
	public List<Relic> searchRelics(int page, int start, int limit, String filter) {
		String hql = "From Relic";
		return entityManager.createQuery(hql, Relic.class)
				.setFirstResult(start)
				.setMaxResults(limit)
				.getResultList();
	}
	
	public Relic getRelic(long id) {
		String hql = "From Relic where objId = :objId";
		return entityManager.createQuery(hql, Relic.class)
				.setParameter("objId", id)
				.getSingleResult();
	}

}
