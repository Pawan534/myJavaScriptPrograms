package com.threadEgs.outstandingExample;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThroughPutTest {
    private static final String INPUT_FILE = "./resources/war_and_peace.txt";
    private static final int NUMBER_OF_THREADS=5;

    public static void main(String[] args) throws Exception {
        String text = new String(Files.readAllBytes(Paths.get(INPUT_FILE)));
        startServer(text);
    }

    public static void startServer(String text) throws Exception{
        HttpServer server =  HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/search", new WordCountHandler(text));
        server.createContext("/operation", new MathOperations(text));
        Executor executor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        server.setExecutor(executor);
        server.start();
    }

    private static class WordCountHandler implements HttpHandler{
        String text;

        public WordCountHandler(String text) {
            this.text = text;
        }

        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            String query = httpExchange.getRequestURI().getQuery();
            String [] keyValue= query.split("=");
            String action= keyValue[0];
            String word = keyValue[1];
            if (!action.equals("word")) {
                httpExchange.sendResponseHeaders(400, 0);
                return;
            }

            long count = countWord(word);

            byte[] response = Long.toString(count).getBytes();
            httpExchange.sendResponseHeaders(200, response.length);
            OutputStream outputStream = httpExchange.getResponseBody();
            outputStream.write(response);
            outputStream.close();
        }

        private long countWord(String word) {
            long count = 0;
            int index = 0;
            while (index >= 0) {
                index = text.indexOf(word, index);

                if (index >= 0) {
                    count++;
                    index++;
                }
            }
            return count;
        }
    }

    private static class MathOperations implements HttpHandler{
        String text;

        public MathOperations(String text) {
            this.text = text;
        }

        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            String query = httpExchange.getRequestURI().getQuery();
            String [] keyValue= query.split("=");
            String word= keyValue[0];
            String num1, num2;
            String[] values;
            if(keyValue[1].contains(",")){
                values = keyValue[1].split(",");
                num1 = values[0];
                num2 = values[1];
            }else{
                num1 = keyValue[1];
                num2 = "null";
            }

            if (!(word.equals("sum") || word.equals("substract") || word.equals("multiply") || word.equals("divide") || word.contains("pow")||word.contains("fact"))) {
                httpExchange.sendResponseHeaders(400, 0);
                OutputStream outputStream = httpExchange.getResponseBody();
                outputStream.write("Please enter proper format as sum=n1,n2 or substract=n1,n2, multiply=n1,n2, divide=n1,n2".getBytes());
                outputStream.close();
                return;
            }

            String count = calculations(num1, word, num2);

            byte[] response = count.getBytes();
            httpExchange.sendResponseHeaders(200, response.length);
            OutputStream outputStream = httpExchange.getResponseBody();
            outputStream.write(response);
            outputStream.close();
        }

        private String calculations(String num1, String op, String num2) {
            double res = 0.0;

            int n1 = Integer.parseInt(num1);
            int n2 = num2.equals("null")? 0 :Integer.parseInt(num2);
            switch (op){
                case "sum":
                    res=n1+n2;
                    return String.valueOf(res);
                case "substract":
                    res=n1-n2;
                    return String.valueOf(res);
                case "multiply":
                    res=n1*n2;
                    return String.valueOf(res);
                case "divide":
                    try{
                        res=(double) n1/n2;
                        return String.valueOf(res);
                    }catch (ArithmeticException e){
                        return "cannot / by zero, other than 0";
                    }
                case "fact":
                    return String.valueOf(fact(Double.parseDouble(num1)));
                case "pow":
                    BigInteger results = powerOFNumbers(new BigInteger(num1), new BigInteger(num2));
                    return String.valueOf(results);
                    default:
                        return "Enter valid data";
            }
        }

        public double fact(double num){
            double res=1;
            for(int i=1;i<=num;i++){
                res=res*i;
            }
            return res;
        }

        public BigInteger powerOFNumbers(BigInteger base, BigInteger power){
            BigInteger result = BigInteger.ONE;
            for(BigInteger i = BigInteger.ZERO;
                i.compareTo(power) !=0;
                i = i.add(BigInteger.ONE)) {
                result = result.multiply(base);
            }
            return result;
        }
    }

}
