/*
 * Copyright 2018-2019 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *          https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.springframework.cloud.deployer.spi.scheduler;

/**
 * Spring Cloud Scheduler property keys.
 *
 * @author Glenn Renfro
 * @author Ilayaperumal Gopinathan
 */
public class SchedulerPropertyKeys {

	public static final String PREFIX = "spring.cloud.scheduler.";

	/**
	 * Scheduler cron property key prefix.
	 */
	public static final String CRON_PREFIX = PREFIX + "cron.";

	/**
	 * Scheduler cron expression property key.
	 */
	public static final String CRON_EXPRESSION = CRON_PREFIX + "expression";

}
