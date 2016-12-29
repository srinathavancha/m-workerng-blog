/**
 *  
 *   *  
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */
package com.srinathavan.mwbng.core.repositories;

import com.srinathavan.mwbng.core.models.entities.Account;
import com.srinathavan.mwbng.core.models.entities.Blog;

/**
 * @author Avancha
 *
 */
public interface AccountRepo {
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Account findAccount(Long id);

	/**
	 * 
	 * @param data
	 * @return
	 */
	public Account createAccount(Account data);

	/**
	 * 
	 * @param id
	 * @param data
	 * @return
	 */
	public Account updateAccount(Long id, Account data);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Account deleteAccount(Long id);

	/**
	 * 
	 * @param accountId
	 * @param data
	 * @return
	 */
	public Blog createBlog(Long accountId, Blog data);


}
