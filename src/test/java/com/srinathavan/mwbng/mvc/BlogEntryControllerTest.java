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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.srinathavan.mwbng.rest.mvc.BlogEntryController;

/**
 * @author Avancha
 *
 */
public class BlogEntryControllerTest {
	/**
	 * Now we need instance of mockmvc
	 */
	@InjectMocks
	private MockMvc mockMvc;
	
	private BlogEntryController blogEntryController;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

		mockMvc = MockMvcBuilders.standaloneSetup(blogEntryController).build();
	}

	@Test
	public void test() throws Exception {
//		for get request
		mockMvc.perform(get("/test")).andDo(print());
//		for post request
		mockMvc.perform(post("/test")
				.content("{\"title\":\"sending or receiving title\"}")
				.contentType(MediaType.APPLICATION_JSON)
				)
		.andDo(print());
	}

}
