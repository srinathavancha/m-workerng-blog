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

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srinathavan.mwbng.core.models.entities.Account;
import com.srinathavan.mwbng.core.models.entities.Blog;
import com.srinathavan.mwbng.rest.exceptions.BadRequestException;
import com.srinathavan.mwbng.rest.exceptions.ConflictException;
import com.srinathavan.mwbng.service.AccountService;
import com.srinathavan.mwbng.service.exceptions.AccountDoesNotExistException;
import com.srinathavan.mwbng.service.exceptions.AccountExistsException;
import com.srinathavan.mwbng.service.exceptions.BlogExistsException;
import com.srinathavan.mwbng.service.util.AccountList;
import com.srinathavan.mwbng.service.util.BlogList;

/**
 * @author Avancha
 *
 */
@Controller
@RequestMapping("/rest/account")
public class AccountController {

	private AccountService accountService;

	@ModelAttribute("account")
	public Account constructAccount(){
		return new Account();
	}
	
	/**
	 * @param accountService
	 */
	@Autowired
	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Object> findAllAccounts() {
		AccountList accountList = accountService.findAllAccounts();
		Map<String, Object> responseData = new HashMap<String, Object>();
		responseData.put("data", accountList);
		responseData.put("status", "success");
		responseData.put("message", "Account list fetched successfully.");
		return new ResponseEntity<Object>(responseData, HttpStatus.OK);
	}
	
	/*@RequestMapping(method = RequestMethod.POST, headers={"Accept=application/json", "Content-Type=application/json"})*/
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Object> createAccount(@RequestBody Account requestAccount) {
		try {
			Account responseAccount = accountService.createAccount(requestAccount);
			return new ResponseEntity<Object>(responseAccount, HttpStatus.OK);
		} catch (AccountExistsException exception) {
			throw new ConflictException(exception);
		}
	}	

	/**
	 * Method to account entry data by its id
	 * 
	 * @param accountId
	 * @return
	 */
	@RequestMapping(value = "/{accountId}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Object> getAccountById(@PathVariable Long accountId) {
		Account account = accountService.findAccount(accountId);
		if (null != account) {
			return new ResponseEntity<Object>(account, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}

/*	@RequestMapping(value = "/{accountId}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateAccount(@PathVariable Long accountId, @RequestBody Account requestAccount) {
		Account responseAccount = accountService.updateAccount(accountId, requestAccount);
		if (null != responseAccount) {
			return new ResponseEntity<Object>(responseAccount, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}*/

/*	@RequestMapping(value = "/{accountId}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteAccount(@PathVariable Long accountId) {
		Account account = accountService.deleteAccount(accountId);
		if (null != account) {
			return new ResponseEntity<Object>(account, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}*/

	@RequestMapping(value = "/{accountId}/blogs", method = RequestMethod.POST)
	public ResponseEntity<Object> createBlog(@PathVariable Long accoundId, @RequestBody Blog data) {
		try {
			Blog responseData = accountService.createBlog(accoundId, data);
			return new ResponseEntity<Object>(responseData, HttpStatus.OK);
		} catch (AccountDoesNotExistException exception) {
			throw new BadRequestException(exception);
		} catch (BlogExistsException exception) {
			throw new ConflictException(exception);
		}
	}

}
