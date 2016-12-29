/**
 *  
 *   *  
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */
package com.srinathavan.mwbng.core.repositories.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.srinathavan.mwbng.core.models.entities.Account;
import com.srinathavan.mwbng.core.models.entities.Blog;
import com.srinathavan.mwbng.core.repositories.AccountRepo;

/**
 * @author Avancha
 *
 */
@Repository
public class JpaAccountRepo implements AccountRepo {
	
	@PersistenceContext
	private EntityManager em;

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.AccountRepo#findAllAccounts()
	 * Find all Accounts
	 */
	@Override
	public List<Account> findAllAccounts() {
		Query query = em.createQuery("select a from Account a");
		return query.getResultList();
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.AccountRepo#findAccount(java.lang.Long)
	 * Find Account using id
	 */
	@Override
	public Account findAccount(Long id) {
		return em.find(Account.class, id);
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.AccountRepo#findAccountByName()
	 */
	@Override
	public Account findAccountByName(String name) {
		Query query = em.createQuery("select a from Account a where a.name=?");
		query.setParameter(0, name);
		List<Account> accounts = query.getResultList();
		if(accounts.size() == 0) {
			return null;
		}
		return accounts.get(0);
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.AccountRepo#createAccount(com.srinathavan.mwbng.core.models.entities.Account)
	 */
	@Override
	public Account createAccount(Account data) {
		em.persist(data);
		return data;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.AccountRepo#updateAccount(java.lang.Long, com.srinathavan.mwbng.core.models.entities.Account)
	 */
	@Override
	public Account updateAccount(Long id, Account data) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.AccountRepo#deleteAccount(java.lang.Long)
	 */
	@Override
	public Account deleteAccount(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
