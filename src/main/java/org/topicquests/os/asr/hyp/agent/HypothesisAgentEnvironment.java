/**
 * 
 */
package org.topicquests.os.asr.hyp.agent;

import org.topicquests.support.RootEnvironment;

/**
 * @author jackpark
 *
 */
public class HypothesisAgentEnvironment extends RootEnvironment {

	/**
	 */
	public HypothesisAgentEnvironment() {
		super("agent-props.xml", "logger.properties");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub

	}

}
