/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.collector.naming.service;

import org.skywalking.apm.collector.core.module.Service;
import org.skywalking.apm.collector.server.ServerHandler;

/**
 * 命名处理器注册服务接口
 *
 * @author peng-yongsheng
 */
public interface NamingHandlerRegisterService extends Service {

    /**
     * 注册 Server 请求处理器
     *
     * @param namingHandler Server 请求处理器
     */
    void register(ServerHandler namingHandler);
}
