# Functional Algorithms
This is a site to show some basics of algorithms in a functional paradigm.

## Prerequisites

You will need [Leiningen][1] 1.7.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

## Some Analysis

The current merge-sort function benchmarks as follows

Evaluation count : 6 in 6 samples of 1 calls.
             Execution time mean : 12.177477 sec
    Execution time std-deviation : 234.726745 ms
   Execution time lower quantile : 11.777058 sec ( 2.5%)
   Execution time upper quantile : 12.350906 sec (97.5%)


With clojure's default sort method coming in at:

Evaluation count : 6 in 6 samples of 1 calls.
             Execution time mean : 775.097448 ms
    Execution time std-deviation : 4.704786 ms
   Execution time lower quantile : 770.509576 ms ( 2.5%)
   Execution time upper quantile : 780.802904 ms (97.5%)

The default sort method ends up calling through to java's array sort method, which
is apparently better written then mine.


Both benchmarks were sorting a list of a 1,000,000 numbers sized 0-10,000

## Deploying

    git push heroku master

The site can be viewed at:
http://glacial-harbor-6956.herokuapp.com
