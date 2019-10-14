/**
 * 
 */
package org.topicquests.os.asr.hyp.agent;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.topicquests.es.api.IClient;
import org.topicquests.ks.kafka.KafkaConsumer;
import org.topicquests.ks.kafka.KafkaProducer;
import org.topicquests.os.asr.api.IDocumentProvider;
import org.topicquests.os.asr.hyp.agent.api.IConstants;
import org.topicquests.os.asr.hyp.agent.api.IHypothesisAgent;
import org.topicquests.support.ResultPojo;
import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 *
 */
public class HypothesisAgent implements IHypothesisAgent {
	private HypothesisAgentEnvironment environment;
	private IDocumentProvider documentProvider;
	private KafkaConsumer kConsumer;
	private KafkaProducer kProducer;
	private IClient esClient;
	
	/**
	 * 
	 */
	public HypothesisAgent(HypothesisAgentEnvironment env) {
		environment = env;
		documentProvider = environment.getDocProvider();
		kConsumer = new KafkaConsumer(env, IConstants.KAFKA_CONSUMER_CLIENT_NAME+Long.toString(System.currentTimeMillis()), this);
		kProducer = new KafkaProducer(env, IConstants.KAFKA_PRODUCER_CLIENT_NAME+Long.toString(System.currentTimeMillis()));
		esClient = environment.getElasticSearchProvider().getProvider();
	}

	/**
	 * See that this is an hypothesis annotation JSONObject.
	 * If so, process it.
	 */
	@Override
	public boolean acceptRecord(ConsumerRecord record) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IResult bootstrap() {
		IResult result = new ResultPojo();
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public void beginWatching() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopWatching() {
		// TODO Auto-generated method stub

	}

}
