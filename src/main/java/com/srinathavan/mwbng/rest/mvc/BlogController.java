/**
 *  
 *   *  
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */
package com.srinathavan.mwbng.rest.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srinathavan.mwbng.core.models.entities.Blog;
import com.srinathavan.mwbng.core.models.entities.BlogEntry;
import com.srinathavan.mwbng.rest.exceptions.NotFoundException;
import com.srinathavan.mwbng.service.BlogService;
import com.srinathavan.mwbng.service.exceptions.BlogNotFoundException;
import com.srinathavan.mwbng.service.util.BlogEntryList;
import com.srinathavan.mwbng.service.util.BlogList;

/**
 * @author Avancha
 *
 */
@Controller
@RequestMapping("/rest/blog")
public class BlogController {

	private BlogService blogService;

	/**
	 * @param blogService
	 */
	@Autowired
	public BlogController(BlogService blogService) {
		super();
		this.blogService = blogService;
	}

	/**
	 * Test for simple get request to fetch all blogs
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Object> findAllBlogs() {
		BlogList responseData = blogService.findAllBlogs();
		return new ResponseEntity<Object>(responseData, HttpStatus.OK);
	}

	/**
	 * Method to blog entry data by its id
	 * 
	 * @param blogId
	 * @return
	 */
	@RequestMapping(value = "/{blogId}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Object> getBlog(@PathVariable Long blogId) {
		Blog blog = blogService.findBlog(blogId);
		if (null != blog) {
			return new ResponseEntity<Object>(blog, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}

	/**
	 * Create blog entry by using blogId
	 * 
	 * @param blogId
	 * @param data
	 * @return
	 */
	@RequestMapping(value = "/{blogId}/blog-entries", method = RequestMethod.POST)
	public ResponseEntity<Object> createBlogEntries(@PathVariable Long blogId, @RequestBody BlogEntry data) {
		try {
			BlogEntry responseData = blogService.createBlogEntry(blogId, data);
			return new ResponseEntity<Object>(responseData, HttpStatus.OK);
		} catch (BlogNotFoundException exception) {
			throw new NotFoundException(exception);
		}
	}

	/**
	 * Method to find all blog entries using blogId
	 * 
	 * @param blogId
	 * @return
	 */
	@RequestMapping(value = "/{blogId}/blog-entries", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Object> findAllBlogEntries(@PathVariable Long blogId) {
		try {
			BlogEntryList responseData = blogService.findAllBlogEntries(blogId);
			return new ResponseEntity<Object>(responseData, HttpStatus.OK);
		} catch (BlogNotFoundException exception) {
			throw new NotFoundException(exception);
		}
	}

	@RequestMapping(value = "/{blogId}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateBlog(@PathVariable Long blogId, @RequestBody Blog requestBlog) {
		Blog responseBlog = blogService.updateBlog(blogId, requestBlog);
		if (null != responseBlog) {
			return new ResponseEntity<Object>(responseBlog, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/{blogId}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteBlog(@PathVariable Long blogId) {
		Blog blog = blogService.deleteBlog(blogId);
		if (null != blog) {
			return new ResponseEntity<Object>(blog, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}

}
