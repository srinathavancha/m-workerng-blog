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
import com.srinathavan.mwbng.service.exceptions.AccountDoesNotExistException;
import com.srinathavan.mwbng.service.exceptions.AccountExistsException;
import com.srinathavan.mwbng.service.exceptions.BlogExistsException;
import com.srinathavan.mwbng.service.util.AccountList;
import com.srinathavan.mwbng.service.util.BlogList;

/**
 * @author Avancha
 *
 */
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepo accountRepo;
	
	@Autowired
	private BlogRepo blogRepo;

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.AccountService#findAllAccounts()
	 */
	@Override
	public AccountList findAllAccounts() {
		return new AccountList(accountRepo.findAllAccounts());
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.AccountService#findAccount(java.lang.Long)
	 */
	@Override
	public Account findAccount(Long id) {
		return accountRepo.findAccount(id);
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.AccountService#findAccountByName(java.lang.String)
	 */
	@Override
	public Account findByAccountName(String name) {
		return accountRepo.findAccountByName(name);
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.AccountService#createAccount(com.srinathavan.mwbng.core.models.entities.Account)
	 */
	@Override
	public Account createAccount(Account data) {
		Account account = accountRepo.findAccountByName(data.getName());
		if(null != account){
			throw new AccountExistsException();
		}
		return accountRepo.createAccount(data);
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.AccountService#createBlog(java.lang.Long, com.srinathavan.mwbng.core.models.entities.Blog)
	 */
	@Override
	public Blog createBlog(Long accountId, Blog data) {
		Blog blog = blogRepo.findBlogByTitle(data.getTitle());
		if(null != blog){
			throw new BlogExistsException();
		}
		Account account = accountRepo.findAccount(accountId);
		if(null == account){
			throw new AccountDoesNotExistException();	
		}
		Blog createdBlog = blogRepo.createBlog(data);
		createdBlog.setOwner(account);
		return createdBlog;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.AccountService#findBlogsByAccount(java.lang.Long)
	 */
	@Override
	public BlogList findBlogsByAccount(Long accountId) {
		Account account = accountRepo.findAccount(accountId);
		if(null == account){
			throw new AccountDoesNotExistException();
		}
		return new BlogList(blogRepo.findBlogsByAccount(accountId));
	}
	
	

}
