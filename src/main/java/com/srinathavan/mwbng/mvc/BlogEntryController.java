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

import java.security.Provider.Service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srinathavan.mwbng.entities.BlogEntry;
import com.srinathavan.mwbng.service.BlogEntryService;

/**
 * @author Avancha
 *
 */
@Controller
@RequestMapping("/rest/blog-entries")
public class BlogEntryController {

	private BlogEntryService blogEntryService;

	/**
	 * @param blogEntryService
	 */
	public BlogEntryController(BlogEntryService blogEntryService) {
		super();
		this.blogEntryService = blogEntryService;
	}

	/**
	 * Test for simple get request
	 * 
	 * @return
	 */
	@RequestMapping("/test")
	public @ResponseBody ResponseEntity<Object> test() {
		BlogEntry blogEntry = new BlogEntry();
		blogEntry.setTitle("I am an entry");
		return new ResponseEntity<Object>(blogEntry, HttpStatus.OK);
	}

	/**
	 * Test for simple post request
	 * 
	 * @param blogEntry
	 * @return
	 */
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<Object> test(@RequestBody BlogEntry blogEntry) {
		return new ResponseEntity<Object>(blogEntry, HttpStatus.OK);
	}

		/**
	 * Method to blog entry data by its id
	 * 
	 * @param blogEntryId
	 * @return
	 */
	@RequestMapping(value = "/{blogEntryId}")
	public @ResponseBody ResponseEntity<Object> getBlogEntryById(@PathVariable Long blogEntryId) {
		BlogEntry blogEntry = blogEntryService.findBlogEntry(blogEntryId);
		if (null != blogEntry) {
			return new ResponseEntity<Object>(blogEntry, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/{blogEntryId}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteBlogEntry(@PathVariable Long blogEntryId) {
		BlogEntry blogEntry = blogEntryService.deleteBlogEntry(blogEntryId);
		if (null != blogEntry) {
			return new ResponseEntity<Object>(blogEntry, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/{blogEntryId}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateBlogEntry(@PathVariable Long blogEntryId,
			@RequestBody BlogEntry requestBlogEntry) {
		BlogEntry responseBlogEntry = blogEntryService.updateBlogEntry(blogEntryId, requestBlogEntry);
		if (null != responseBlogEntry) {
			return new ResponseEntity<Object>(responseBlogEntry, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}

}
