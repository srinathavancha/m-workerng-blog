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

import java.util.List;

import com.srinathavan.mwbng.core.models.entities.Blog;
import com.srinathavan.mwbng.core.models.entities.BlogEntry;
import com.srinathavan.mwbng.service.util.BlogEntryList;
import com.srinathavan.mwbng.service.util.BlogList;

/**
 * @author Avancha
 *
 */
public interface BlogRepo {
	/**
	 * 
	 * @return
	 */
	public BlogList findAllBlogs();

	/**
	 * 
	 * @param blogId
	 * @return
	 */
	public BlogEntryList findAllBlogEntries(Long blogId);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Blog findBlog(Long id);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Blog deleteBlog(Long id);

	/**
	 * 
	 * @param Id
	 * @param data
	 * @return
	 */
	public Blog updateBlog(Long Id, Blog data);

	/**
	 * 
	 * @param blogId
	 *            the id of the blog to add this BlogEntry to
	 * @param data
	 *            the BlogEntry containing the data to be used for ...
	 * @return the created BlogEntry with generated id
	 * @throws com.srinathavan.mwbng.service.exceptions.BlogNotFoundException
	 */
	public BlogEntry createBlogEntry(Long blogId, BlogEntry data);

	/**
	 * @param title
	 * @return
	 */
	public Blog findBlogByTitle(String title);

	/**
	 * @param data
	 * @return
	 */
	public Blog createBlog(Blog data);

	/**
	 * @param accountId 
	 * @return
	 */
	public List<Blog> findBlogsByAccount(Long accountId);

}
