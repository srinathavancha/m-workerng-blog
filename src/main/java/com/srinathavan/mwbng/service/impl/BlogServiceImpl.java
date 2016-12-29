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

import com.srinathavan.mwbng.core.models.entities.Blog;
import com.srinathavan.mwbng.core.models.entities.BlogEntry;
import com.srinathavan.mwbng.core.repositories.BlogEntryRepo;
import com.srinathavan.mwbng.core.repositories.BlogRepo;
import com.srinathavan.mwbng.service.BlogService;
import com.srinathavan.mwbng.service.util.BlogEntryList;
import com.srinathavan.mwbng.service.util.BlogList;

/**
 * @author Avancha
 *
 */
@Service
@Transactional
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepo blogRepo;
	
	@Autowired
	private BlogEntryRepo blogEntryRepo;
	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.BlogService#findAllBlogs()
	 */
	@Override
	public BlogList findAllBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.BlogService#findAllBlogEntries(java.lang.Long)
	 */
	@Override
	public BlogEntryList findAllBlogEntries(Long blogId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.BlogService#findBlog(java.lang.Long)
	 */
	@Override
	public Blog findBlog(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.BlogService#deleteBlog(java.lang.Long)
	 */
	@Override
	public Blog deleteBlog(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.BlogService#updateBlog(java.lang.Long, com.srinathavan.mwbng.core.models.entities.Blog)
	 */
	@Override
	public Blog updateBlog(Long Id, Blog data) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.service.BlogService#createBlogEntry(java.lang.Long, com.srinathavan.mwbng.core.models.entities.BlogEntry)
	 */
	@Override
	public BlogEntry createBlogEntry(Long blogId, BlogEntry data) {
		// TODO Auto-generated method stub
		return null;
	}

}
