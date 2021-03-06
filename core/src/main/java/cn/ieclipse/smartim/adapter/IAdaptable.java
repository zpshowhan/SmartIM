/*
 * Copyright 2014-2017 ieclipse.cn.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ieclipse.smartim.adapter;

/**
 * 类/接口描述
 * 
 * @author Jamling
 * @date 2017年8月26日
 *      
 */
public interface IAdaptable {
    /**
     * Returns an object which is an instance of the given class associated with
     * this object. Returns <code>null</code> if no such object can be found.
     *
     * @param adapter
     *            the adapter class to look up
     * @return a object of the given class, or <code>null</code> if this object
     *         does not have an adapter for the given class
     */
    public <T> T getAdapter(Class<T> adapter);
}
