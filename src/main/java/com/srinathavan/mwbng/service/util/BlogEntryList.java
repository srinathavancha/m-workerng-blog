/**
 *  
 *   *  
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */
package com.srinathavan.mwbng.service.util;

import java.util.ArrayList;
import java.util.List;

import com.srinathavan.mwbng.core.models.entities.BlogEntry;

/**
 * @author Avancha
 *
 */
public class BlogEntryList {

	private List<BlogEntry> entries = new ArrayList<BlogEntry>();
	private Long blogId;
	
	/**
	 * @return the entries
	 */
	public List<BlogEntry> getEntries() {
		return entries;
	}
	/**
	 * @param entries the entries to set
	 */
	public void setEntries(List<BlogEntry> entries) {
		this.entries = entries;
	}
	/**
	 * @return the blogId
	 */
	public Long getBlogId() {
		return blogId;
	}
	/**
	 * @param blogId the blogId to set
	 */
	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	
}
