package com.applitools.eyes;

import com.applitools.ICheckSettings;

import java.net.URISyntaxException;

public interface IEyes {
    void setLogHandler(LogHandler logHandler);

    void setServerUrl(String serverUrl) throws URISyntaxException;

    void setProxy(AbstractProxySettings abstractProxySettings);

    Logger getLogger();

    void check(ICheckSettings checkSettings);
    void check(String testName, ICheckSettings checkSettings);

    TestResults close();
    TestResults close(boolean throwException);
    TestResults abortIfNotClosed();

    boolean getIsOpen();

    boolean getIsDisabled();

    String getApiKey();

    void setApiKey(String apiKey);
}
