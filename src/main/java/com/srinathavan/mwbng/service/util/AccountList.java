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

import com.srinathavan.mwbng.core.models.entities.Account;

/**
 * @author Avancha
 *
 */
public class AccountList {

	private List<Account> accountList = new ArrayList<Account>();

	/**
	 * @param allAccounts
	 */
	public AccountList(List<Account> allAccounts) {
		accountList.addAll(allAccounts);
	}

	/**
	 * @return the accountList
	 */
	public List<Account> getAccountList() {
		return accountList;
	}

	/**
	 * @param accountList the accountList to set
	 */
	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	

}
