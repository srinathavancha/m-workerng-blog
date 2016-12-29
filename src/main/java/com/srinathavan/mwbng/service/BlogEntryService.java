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

import com.srinathavan.mwbng.core.models.entities.BlogEntry;

/**
 * @author Avancha
 *
 */
public interface BlogEntryService {
	/**
	 * 
	 * @param id
	 * @return
	 */
	public BlogEntry findBlogEntry(Long id);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public BlogEntry deleteBlogEntry(Long id);

	/**
	 * 
	 * @param id
	 * @param data
	 * @return
	 */
	public BlogEntry updateBlogEntry(Long id, BlogEntry data);

}
