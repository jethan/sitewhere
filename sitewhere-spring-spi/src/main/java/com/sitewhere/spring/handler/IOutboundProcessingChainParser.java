package com.sitewhere.spring.handler;

/**
 * Enumerates elements used by outbound processing chain parser.
 * 
 * @author Derek
 */
public interface IOutboundProcessingChainParser {

    /**
     * Expected child elements.
     * 
     * @author Derek
     */
    public static enum Elements {

	/** Reference to custom inbound event processor */
	OutboundEventProcessor("outbound-event-processor"),

	/** Tests location values against zones */
	ZoneTestEventProcessor("zone-test-event-processor"),

	/** Sends outbound events to an MQTT topic */
	MqttEventProcessor("mqtt-event-processor"),

	/** Sends outbound events to a RabbitMQ exchange */
	RabbitMqEventProcessor("rabbit-mq-event-processor"),

	/** Sends outbound events over Hazelcast topics */
	HazelcastEventProcessor("hazelcast-event-processor"),

	/** Indexes outbound events in Apache Solr */
	SolrEventProcessor("solr-event-processor"),

	/** Sends outbound events to an Azure EventHub */
	AzureEventHubEventProcessor("azure-eventhub-event-processor"),

	/** Sends outbound events to an Amazon SQS queue */
	AmazonSqsEventProcessor("amazon-sqs-event-processor"),

	/** Sends outbound events to InitialState.com */
	InitialStateEventProcessor("initial-state-event-processor"),

	/** Sends outbound events to dweet.io */
	DweetIoEventProcessor("dweet-io-event-processor"),

	/** DEPRECATED: Use 'command-delivery-event-processor' */
	ProvisioningEventProcessor("provisioning-event-processor"),

	/**
	 * Outbound event processor that delivers commands via communication
	 * subsystem
	 */
	CommandDeliveryEventProcessor("command-delivery-event-processor"),

	/**
	 * Outbound event processor that delivers event to external WSO2 CEP
	 * instance
	 */
	Wso2CepEventProcessor("wso2-cep-event-processor"),

	/**
	 * Outbound event processor that uses Siddhi for complex event
	 * processing
	 */
	SiddhiEventProcessor("siddhi-event-processor"),

	/** Outbound event processor that delegates to a Groovy script */
	GroovyEventProcessor("groovy-event-processor");

	/** Event code */
	private String localName;

	private Elements(String localName) {
	    this.localName = localName;
	}

	public static Elements getByLocalName(String localName) {
	    for (Elements value : Elements.values()) {
		if (value.getLocalName().equals(localName)) {
		    return value;
		}
	    }
	    return null;
	}

	public String getLocalName() {
	    return localName;
	}

	public void setLocalName(String localName) {
	    this.localName = localName;
	}
    }

    /**
     * Expected filter elements.
     * 
     * @author Derek
     */
    public static enum Filters {

	/** Include or exclude events for a site */
	SiteFilter("site-filter"),

	/** Include or exclude events for a specification */
	SpecificationFilter("specification-filter"),

	/** Include or exclude events based on running a script */
	GroovyFilter("groovy-filter");

	/** Event code */
	private String localName;

	private Filters(String localName) {
	    this.localName = localName;
	}

	public static Filters getByLocalName(String localName) {
	    for (Filters value : Filters.values()) {
		if (value.getLocalName().equals(localName)) {
		    return value;
		}
	    }
	    return null;
	}

	public String getLocalName() {
	    return localName;
	}

	public void setLocalName(String localName) {
	    this.localName = localName;
	}
    }

    /**
     * Expected multicaster elements.
     * 
     * @author Derek
     */
    public static enum Multicasters {

	/** Multicasts to all devices with a given specification */
	AllWithSpecificationMulticaster("all-with-specification-multicaster");

	/** Event code */
	private String localName;

	private Multicasters(String localName) {
	    this.localName = localName;
	}

	public static Multicasters getByLocalName(String localName) {
	    for (Multicasters value : Multicasters.values()) {
		if (value.getLocalName().equals(localName)) {
		    return value;
		}
	    }
	    return null;
	}

	public String getLocalName() {
	    return localName;
	}

	public void setLocalName(String localName) {
	    this.localName = localName;
	}
    }

    /**
     * Expected multicaster elements.
     * 
     * @author Derek
     */
    public static enum RouteBuilders {

	/** Uses Groovy script to build routes */
	GroovyRouteBuilder("groovy-route-builder");

	/** Event code */
	private String localName;

	private RouteBuilders(String localName) {
	    this.localName = localName;
	}

	public static RouteBuilders getByLocalName(String localName) {
	    for (RouteBuilders value : RouteBuilders.values()) {
		if (value.getLocalName().equals(localName)) {
		    return value;
		}
	    }
	    return null;
	}

	public String getLocalName() {
	    return localName;
	}

	public void setLocalName(String localName) {
	    this.localName = localName;
	}
    }
}