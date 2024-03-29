/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.os.asr.hyp.agent.api;

import org.topicquests.backside.kafka.consumer.api.IMessageConsumerListener;
import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 * <p>There are two modes of operation<br/>
 * <ul><li>Bootstrapping: process existing annotations in ElasticSearch</li>
 * <li>Runtime: watching for Kafka events which signal new annotations</li></ul>
 */
public interface IHypothesisAgent extends IMessageConsumerListener {

	/**
	 * Run the bootstrap process one time
	 * @return
	 */
	IResult bootstrap();
	
	/**
	 * Begin a runtime operation of intercepting specific Kafka events
	 */
	void beginWatching();
	
	/**
	 * Stop the process
	 */
	void stopWatching();
}
