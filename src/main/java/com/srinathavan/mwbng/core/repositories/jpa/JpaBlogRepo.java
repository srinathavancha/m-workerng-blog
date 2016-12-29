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

import com.srinathavan.mwbng.core.models.entities.Blog;
import com.srinathavan.mwbng.core.models.entities.BlogEntry;
import com.srinathavan.mwbng.core.repositories.BlogRepo;
import com.srinathavan.mwbng.service.util.BlogEntryList;
import com.srinathavan.mwbng.service.util.BlogList;

/**
 * @author Avancha
 *
 */
@Repository
public class JpaBlogRepo implements BlogRepo {
	
	@PersistenceContext
	private EntityManager em;

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.BlogRepo#findAllBlogs()
	 */
	@Override
	public BlogList findAllBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.BlogRepo#findAllBlogEntries(java.lang.Long)
	 */
	@Override
	public BlogEntryList findAllBlogEntries(Long blogId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.BlogRepo#findBlog(java.lang.Long)
	 */
	@Override
	public Blog findBlog(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.BlogRepo#deleteBlog(java.lang.Long)
	 */
	@Override
	public Blog deleteBlog(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.BlogRepo#updateBlog(java.lang.Long, com.srinathavan.mwbng.core.models.entities.Blog)
	 */
	@Override
	public Blog updateBlog(Long Id, Blog data) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.BlogRepo#createBlogEntry(java.lang.Long, com.srinathavan.mwbng.core.models.entities.BlogEntry)
	 */
	@Override
	public BlogEntry createBlogEntry(Long blogId, BlogEntry data) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.BlogRepo#findBlogByTitle(java.lang.String)
	 */
	@Override
	public Blog findBlogByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.BlogRepo#createBlog(com.srinathavan.mwbng.core.models.entities.Blog)
	 */
	@Override
	public Blog createBlog(Blog data) {
		em.persist(data);
		return data;
	}

	/* (non-Javadoc)
	 * @see com.srinathavan.mwbng.core.repositories.BlogRepo#findBlogsByAccount(java.lang.Long)
	 */
	@Override
	public List<Blog> findBlogsByAccount(Long accountId) {
		Query query = em.createQuery("Select b from Blog b where b.owner.id=?");
		query.setParameter(0, accountId);
		return query.getResultList();
	}

}
