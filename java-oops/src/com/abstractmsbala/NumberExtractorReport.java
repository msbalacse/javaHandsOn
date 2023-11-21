package com.abstractmsbala;

import java.util.regex.Pattern;

public class NumberExtractorReport extends ExtractorReport{

    private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Phone Numbers";
    }

    @Override
    public String cleanup(String input) {
        return null;
    }


}
