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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Avancha
 *
 */
@Controller
public class WebIndexController {

	@RequestMapping(value = {"/", "/index", "/app"}, method = RequestMethod.GET)
	public String index() {
		/*return "view";*/
		return "redirect:/app/index.html";
	}
	
	/*@RequestMapping(value = {"/staticResource"}, method = RequestMethod.GET)
	public String staticResource() {
		return "redirect:/app/index.html";
	}*/
}
