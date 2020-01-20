package com.regularExpression;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-Heading</h2>");
        htmlText.append("<p>This is paragraph of something</p>");
        htmlText.append("<p>This is another paragraph of something</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        String h2Pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        //Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
        int count =0;

        matcher.reset();
        while (matcher.find()){
            count++;
            System.out.println("Occurence " + count + " : " + matcher.start() + " to " + matcher.end());
        }


        String h2groupPattern = "(<h2>(.+?)</h2>)";
        Pattern groupPattern  = Pattern.compile(h2groupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();
        count = 0;
        while (groupMatcher.find()){
            count++;
            System.out.println("Occurence " + groupMatcher.group(1));
        }

        String phone = "(123) 456-7890";
        System.out.println(phone.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

    }

}
