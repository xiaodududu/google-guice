/**
 * Copyright (C) 2006 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.inject;

import java.lang.reflect.Member;

/**
 * Context of the current injection.
 *
 * @author crazybob@google.com (Bob Lee)
 */
public interface Context {

  /**
   * Gets the {@link Container}.
   */
  Container getContainer();

  /**
   * Gets the field, method or constructor which is being injected. Returns
   * {@code null} if the object isn't being directly injected (i.e. it's
   * a preloaded singleton, returned from {@link Factory#get()}, etc.
   */
  Member getMember();

  /**
   * Gets the binding key for the object currently being retrieved.
   */
  Key<?> getKey();
}