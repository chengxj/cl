package com.cl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cl.entity.ServiceConfig;
import com.cl.entity.common.User;

@Repository
@Transactional(value = "transactionManager", noRollbackFor = { NoResultException.class })
public class SearchDao {

	@PersistenceContext(unitName = "entityManagerFactory")
	private EntityManager entityManager;

	private static int pageSize = 10;
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public User getUserByUid(String userid) {
		 String hql = "from User where userid = :userid";
		 return entityManager.createQuery(hql, User.class)
				 .setParameter("userid", userid)
				 .getSingleResult();
	}

	/**
	 * 
	 * @param searchTerm
	 * @return
	 */
	public int getSearchActivitiesCount(String searchTerm) {
		try {
			String hql;
			if (searchTerm == null || searchTerm.isEmpty()) {
				hql = "select count(*) from Activities";
			} else {
				hql = "select count(*) From Activities where title like '%" + searchTerm + "%'";
			}
			return entityManager.createQuery(hql, Long.class)
					.getSingleResult().intValue();
		} catch (NoResultException e) {
			return 0;
		}
	}
	
	/**
	 * 
	 * @param request
	 * @return
	 */
	public List<ServiceConfig> getApis() {
		return entityManager.createQuery("From ServiceConfig", ServiceConfig.class)
				.setFirstResult(0)
				.getResultList();
	}
	
	public ServiceConfig getApiById(long uuid) {
		return entityManager.createQuery("From ServiceConfig where id = :uuid", ServiceConfig.class)
				.setParameter("uuid", uuid)
				.getSingleResult();
	}

}
