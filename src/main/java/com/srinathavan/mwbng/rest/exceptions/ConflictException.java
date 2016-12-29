/**
 *  
 *   *  
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */
package com.srinathavan.mwbng.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Avancha
 *
 */
@ResponseStatus(value=HttpStatus.CONFLICT)
public class ConflictException extends RuntimeException {

	/**
	 * 
	 */
	public ConflictException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public ConflictException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
