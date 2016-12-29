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

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.AccountRepo#findAccount(java.lang.Long)
	 */
	@Override
	public Account findAccount(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.AccountRepo#createAccount(com.srinathavan.mwbng.core.models.entities.Account)
	 */
	@Override
	public Account createAccount(Account data) {
		// TODO Auto-generated method stub
		return null;
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

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.AccountRepo#createBlog(java.lang.Long, com.srinathavan.mwbng.core.models.entities.Blog)
	 */
	@Override
	public Blog createBlog(Long accountId, Blog data) {
		// TODO Auto-generated method stub
		return null;
	}

}
