(ns resume-timeline.test.mergesort
  (:use clojure.test
        ring.mock.request  
        resume-timeline.mergesort))

(deftest test-sort
  (is (= [1 2 3 4] (merge-sort [4 2 1 3])))
  (is (= [1] (merge-sort [1])))
  (is (= [1 2 3 4] (merge-sort [1 2 3 4]))))
