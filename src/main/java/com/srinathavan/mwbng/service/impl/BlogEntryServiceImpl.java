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

import com.srinathavan.mwbng.core.models.entities.BlogEntry;
import com.srinathavan.mwbng.core.repositories.BlogEntryRepo;
import com.srinathavan.mwbng.service.BlogEntryService;

/**
 * @author Avancha
 *
 */
@Service
@Transactional
public class BlogEntryServiceImpl implements BlogEntryService {

	@Autowired
	private BlogEntryRepo blogEntryRepo;

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.BlogEntryService#findBlogEntry(java.lang.Long)
	 */
	@Override
	public BlogEntry findBlogEntry(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.BlogEntryService#deleteBlogEntry(java.lang.Long)
	 */
	@Override
	public BlogEntry deleteBlogEntry(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.BlogEntryService#updateBlogEntry(java.lang.Long, com.srinathavan.mwbng.core.models.entities.BlogEntry)
	 */
	@Override
	public BlogEntry updateBlogEntry(Long id, BlogEntry data) {
		// TODO Auto-generated method stub
		return null;
	}

}
