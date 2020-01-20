package com.threadEgs.outstandingExample;

public class Demo {


    public class Metrics {
        private long count;
        private double average;
        private long max;

        public synchronized void addSample(long sample) {
            average = (average * count + sample) / (++count);
            max = Math.max(max, sample);
        }

        public synchronized void reset() {
            count = 0;
            max = Integer.MIN_VALUE;
            average = 0.0;
        }

        public long getCount() {
            return count;
        }

        public long getMax() {
            return max;
        }

        public double getAverage() {
            return average;
        }
    }

}
