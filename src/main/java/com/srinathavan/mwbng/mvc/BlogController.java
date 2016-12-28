/**
 *  
 *   *  
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */
package com.srinathavan.mwbng.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srinathavan.mwbng.entities.Blog;
import com.srinathavan.mwbng.service.BlogService;

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
	public BlogController(BlogService blogService) {
		super();
		this.blogService = blogService;
	}

	/**
	 * Test for simple get request
	 * 
	 * @return
	 */
	@RequestMapping("/test")
	public @ResponseBody ResponseEntity<Object> test() {
		Blog blog = new Blog();
		blog.setTitle("I am an blog");
		return new ResponseEntity<Object>(blog, HttpStatus.OK);
	}

	/**
	 * Test for simple post request
	 * 
	 * @param blog
	 * @return
	 */
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<Object> test(@RequestBody Blog blog) {
		return new ResponseEntity<Object>(blog, HttpStatus.OK);
	}

	/**
	 * Method to blog entry data by its id
	 * 
	 * @param blogId
	 * @return
	 */
	@RequestMapping(value = "/{blogId}")
	public @ResponseBody ResponseEntity<Object> getBlogById(@PathVariable Long blogId) {
		Blog blog = blogService.findBlog(blogId);
		if (null != blog) {
			return new ResponseEntity<Object>(blog, HttpStatus.OK);
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

	@RequestMapping(value = "/{blogId}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateBlog(@PathVariable Long blogId, @RequestBody Blog requestBlog) {
		Blog responseBlog = blogService.updateBlog(blogId, requestBlog);
		if (null != responseBlog) {
			return new ResponseEntity<Object>(responseBlog, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}

}
