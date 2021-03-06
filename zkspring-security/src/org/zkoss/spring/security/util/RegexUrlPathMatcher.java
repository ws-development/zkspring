package org.zkoss.spring.security.util;

import java.util.regex.Pattern;

/**
 * @author Luke Taylor
 * Copied from Spring Security 3.0.7 RELEASE 
 */
public class RegexUrlPathMatcher implements UrlMatcher {
    private boolean requiresLowerCaseUrl = false;

    public Object compile(String path) {
        return Pattern.compile(path);
    }

    public void setRequiresLowerCaseUrl(boolean requiresLowerCaseUrl) {
        this.requiresLowerCaseUrl = requiresLowerCaseUrl;
    }

    public boolean pathMatchesUrl(Object compiledPath, String url) {
        Pattern pattern = (Pattern)compiledPath;

        return pattern.matcher(url).matches();
    }

    public String getUniversalMatchPattern() {
        return "/.*";
    }

    public boolean requiresLowerCaseUrl() {
        return requiresLowerCaseUrl;
    }
}
