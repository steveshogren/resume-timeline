(ns resume-timeline.test.mergesort
  (:use clojure.test
        ring.mock.request  
        resume-timeline.mergesort))

(deftest test-sort
  (is (= [1 2 3 4] (merge-sort [4 2 1 3])))
  (is (= [1 3 3 4 4] (merge-sort [4 4 1 3 3])))
  (is (= [1] (merge-sort [1])))
  (is (= [1 2 3 4 5 6 7 8 9] (merge-sort [9 7 5 3 1 2 8 6 4])))
  (is (= [1 2 3 4] (merge-sort [1 2 3 4]))))

(deftest test-merge
  (is (= [1 2 3 4 5 6] (merge-lists [[1 3 5] [2 4 6]]))))
