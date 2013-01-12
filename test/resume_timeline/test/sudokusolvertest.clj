(ns resume-timeline.test.sudokusolvertest
  (:use clojure.test
        ring.mock.request  
        resume-timeline.sudokusolver))

(deftest test-spilting
  (is (= [[1 2 3] [4 5]] (split-list [1 2 3 4 5])))
  (is (= [[1 2] [3 4]] (split-list [1 2 3 4]))))

