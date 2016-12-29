/**
 *  
 *   *  
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */
package com.srinathavan.mwbng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.srinathavan.mwbng.core.models.entities.Account;
import com.srinathavan.mwbng.core.models.entities.Blog;
import com.srinathavan.mwbng.core.repositories.AccountRepo;
import com.srinathavan.mwbng.core.repositories.BlogRepo;
import com.srinathavan.mwbng.service.AccountService;

/**
 * @author Avancha
 *
 */
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepo AccountRepo;
	
	@Autowired
	private BlogRepo blogRepo;

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.AccountService#findAccount(java.lang.Long)
	 */
	@Override
	public Account findAccount(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.AccountService#createAccount(com.srinathavan.mwbng.core.models.entities.Account)
	 */
	@Override
	public Account createAccount(Account data) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.AccountService#updateAccount(java.lang.Long, com.srinathavan.mwbng.core.models.entities.Account)
	 */
	@Override
	public Account updateAccount(Long id, Account data) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.AccountService#deleteAccount(java.lang.Long)
	 */
	@Override
	public Account deleteAccount(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.AccountService#createBlog(java.lang.Long, com.srinathavan.mwbng.core.models.entities.Blog)
	 */
	@Override
	public Blog createBlog(Long accountId, Blog data) {
		// TODO Auto-generated method stub
		return null;
	}

}
