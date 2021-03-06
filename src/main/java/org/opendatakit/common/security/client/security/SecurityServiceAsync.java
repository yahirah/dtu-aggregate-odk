/*
 * Copyright (C) 2011 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.opendatakit.common.security.client.security;

import com.google.gwt.user.client.rpc.AsyncCallback;
import org.opendatakit.common.security.client.CredentialsInfo;
import org.opendatakit.common.security.client.RealmSecurityInfo;
import org.opendatakit.common.security.client.UserSecurityInfo;

import java.util.ArrayList;
import java.util.List;

public interface SecurityServiceAsync {

	void getUserInfo(AsyncCallback<UserSecurityInfo> callback);

	void getRealmInfo(String xsrfString,
			AsyncCallback<RealmSecurityInfo> callback);

	void changePasswords(List<CredentialsInfo> users, AsyncCallback<Integer> successes);

	void assignUsersToForm(List<String> usernames, String formId, AsyncCallback<Void> callback);

	void getUserAssignedToForm(String formId, AsyncCallback<ArrayList<UserSecurityInfo>> callback);

	void removeUsersFromForm(List<String> usernames, String formId, AsyncCallback<Integer> callback);
}
