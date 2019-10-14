/**
 * 
 */
package org.topicquests.os.asr.hyp.agent;

import org.topicquests.asr.general.GeneralDatabaseEnvironment;
import org.topicquests.asr.general.document.api.IDocumentClient;
import org.topicquests.es.ProviderEnvironment;
import org.topicquests.os.asr.DocumentProvider;
import org.topicquests.os.asr.api.IDocumentProvider;
import org.topicquests.os.asr.hyp.agent.api.IHypothesisAgent;
import org.topicquests.support.RootEnvironment;

/**
 * @author jackpark
 *
 */
public class HypothesisAgentEnvironment extends RootEnvironment {
	private ProviderEnvironment esProvider;  // Elasticsearch provider
	private GeneralDatabaseEnvironment generalEnvironment;
	private IDocumentClient documentDatabase;

	private IDocumentProvider documentProvider;
	private IHypothesisAgent agent;
	/**
	 */
	public HypothesisAgentEnvironment() {
		super("agent-props.xml", "logger.properties");
		esProvider = new ProviderEnvironment();
		String schemaName = getStringProperty("DatabaseSchema");
		generalEnvironment = new GeneralDatabaseEnvironment(schemaName);
		documentDatabase = generalEnvironment.getDocumentClient();
		documentProvider = new DocumentProvider(this);
		agent = new HypothesisAgent(this);
	}

	public IHypothesisAgent getAgent() {
		return agent;
	}
	
	public IDocumentProvider getDocProvider() {
		return documentProvider;
	}
	
	public IDocumentClient getDocumentDatabase () {
		return documentDatabase;
	}

	/**
	 * Return the ElasticSearch Environment
	 * @return
	 */
	public ProviderEnvironment getElasticSearchProvider() {
		return esProvider;
	}
		@Override
	public void shutDown() {
		System.out.println("HypothesisAgentEnvironment.shutDown");
		agent.stopWatching();
	}

}
