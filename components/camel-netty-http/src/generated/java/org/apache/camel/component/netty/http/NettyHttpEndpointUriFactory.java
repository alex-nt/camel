/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty.http;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class NettyHttpEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":protocol://host:port/path";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(86);
        props.add("allowSerializedHeaders");
        props.add("backlog");
        props.add("bossCount");
        props.add("bossGroup");
        props.add("bridgeEndpoint");
        props.add("bridgeErrorHandler");
        props.add("channelGroup");
        props.add("chunkedMaxContentLength");
        props.add("clientInitializerFactory");
        props.add("compression");
        props.add("configuration");
        props.add("connectTimeout");
        props.add("cookieHandler");
        props.add("decoders");
        props.add("disableStreamCache");
        props.add("disconnect");
        props.add("disconnectOnNoReply");
        props.add("enabledProtocols");
        props.add("encoders");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("headerFilterStrategy");
        props.add("host");
        props.add("hostnameVerification");
        props.add("httpMethodRestrict");
        props.add("keepAlive");
        props.add("keyStoreFile");
        props.add("keyStoreFormat");
        props.add("keyStoreResource");
        props.add("lazyChannelCreation");
        props.add("lazyStartProducer");
        props.add("logWarnOnBadRequest");
        props.add("mapHeaders");
        props.add("matchOnUriPrefix");
        props.add("maxHeaderSize");
        props.add("muteException");
        props.add("nativeTransport");
        props.add("needClientAuth");
        props.add("nettyHttpBinding");
        props.add("nettyServerBootstrapFactory");
        props.add("nettySharedHttpServer");
        props.add("noReplyLogLevel");
        props.add("okStatusCodeRange");
        props.add("options");
        props.add("passphrase");
        props.add("path");
        props.add("port");
        props.add("producerPoolBlockWhenExhausted");
        props.add("producerPoolEnabled");
        props.add("producerPoolMaxIdle");
        props.add("producerPoolMaxTotal");
        props.add("producerPoolMaxWait");
        props.add("producerPoolMinEvictableIdle");
        props.add("producerPoolMinIdle");
        props.add("protocol");
        props.add("receiveBufferSize");
        props.add("receiveBufferSizePredictor");
        props.add("requestTimeout");
        props.add("reuseAddress");
        props.add("reuseChannel");
        props.add("securityConfiguration");
        props.add("securityOptions");
        props.add("securityProvider");
        props.add("send503whenSuspended");
        props.add("sendBufferSize");
        props.add("serverClosedChannelExceptionCaughtLogLevel");
        props.add("serverExceptionCaughtLogLevel");
        props.add("serverInitializerFactory");
        props.add("ssl");
        props.add("sslClientCertHeaders");
        props.add("sslContextParameters");
        props.add("sslHandler");
        props.add("sync");
        props.add("synchronous");
        props.add("tcpNoDelay");
        props.add("throwExceptionOnFailure");
        props.add("traceEnabled");
        props.add("transferException");
        props.add("transferExchange");
        props.add("trustStoreFile");
        props.add("trustStoreResource");
        props.add("urlDecodeHeaders");
        props.add("useRelativePath");
        props.add("usingExecutorService");
        props.add("workerCount");
        props.add("workerGroup");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(1);
        secretProps.add("passphrase");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(2);
        prefixes.add("option.");
        prefixes.add("securityConfiguration.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "netty-http".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "protocol", null, true, copy);
        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, false, copy);
        uri = buildPathParameter(syntax, uri, "path", null, false, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return true;
    }
}

