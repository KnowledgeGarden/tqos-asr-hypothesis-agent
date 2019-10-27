/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.os.asr.hyp.agent;

/**
 * @author jackpark
 *
 */
public class Main {
	private HypothesisAgentEnvironment environment;
	/**
	 * 
	 */
	public Main() {
		environment = new HypothesisAgentEnvironment();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main();
	}

}
