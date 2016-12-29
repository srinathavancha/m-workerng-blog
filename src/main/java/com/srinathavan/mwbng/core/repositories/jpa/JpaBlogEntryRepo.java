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

import com.srinathavan.mwbng.core.models.entities.BlogEntry;
import com.srinathavan.mwbng.core.repositories.BlogEntryRepo;

/**
 * @author Avancha
 *
 */
@Repository
public class JpaBlogEntryRepo implements BlogEntryRepo {

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.BlogEntryRepo#findBlogEntry(java.lang.Long)
	 */
	@Override
	public BlogEntry findBlogEntry(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.BlogEntryRepo#deleteBlogEntry(java.lang.Long)
	 */
	@Override
	public BlogEntry deleteBlogEntry(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.BlogEntryRepo#updateBlogEntry(java.lang.Long, com.srinathavan.mwbng.core.models.entities.BlogEntry)
	 */
	@Override
	public BlogEntry updateBlogEntry(Long id, BlogEntry data) {
		// TODO Auto-generated method stub
		return null;
	}

}
