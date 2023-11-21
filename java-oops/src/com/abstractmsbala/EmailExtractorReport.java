package com.abstractmsbala;

import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport{

    public static final Pattern EMAILPATTERN =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    @Override
    public Pattern getPattern() {
        return EMAILPATTERN;
    }

    @Override
    public String getReportName() {
        return "E-mails";
    }

    @Override
    public String cleanup(String input) {
        return input.toLowerCase();
    }
}
