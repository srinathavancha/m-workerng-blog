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

import com.srinathavan.mwbng.core.models.entities.Blog;

/**
 * @author Avancha
 *
 */
public class BlogList {

	private List<Blog> blogs = new ArrayList<Blog>();

	/**
	 * @param findBlogsByAccount
	 */
	public BlogList(List<Blog> blogList) {
		blogs.addAll(blogList);
	}

	/**
	 * @return the blogs
	 */
	public List<Blog> getBlogs() {
		return blogs;
	}

	/**
	 * @param blogs the blogs to set
	 */
	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}


}
