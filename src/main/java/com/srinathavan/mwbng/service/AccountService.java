/**
 *  
 *   *  
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */
package com.srinathavan.mwbng.service;

import com.srinathavan.mwbng.core.models.entities.Account;
import com.srinathavan.mwbng.core.models.entities.Blog;
import com.srinathavan.mwbng.service.util.AccountList;
import com.srinathavan.mwbng.service.util.BlogList;

/**
 * @author Avancha
 *
 */
public interface AccountService {
	/**
	 * 
	 * @return
	 */
	public AccountList findAllAccounts();
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Account findAccount(Long id);
	
	/**
	 * 
	 * @return
	 */
	public Account findByAccountName(String name);

	/**
	 * 
	 * @param data
	 * @return
	 */
	public Account createAccount(Account data);

	/**
	 * 
	 * @param accountId
	 * @param data
	 * @return
	 */
	public Blog createBlog(Long accountId, Blog data);
	
	/**
	 * 
	 * @param accountId
	 * @return
	 */
	public BlogList findBlogsByAccount(Long accountId);
}
