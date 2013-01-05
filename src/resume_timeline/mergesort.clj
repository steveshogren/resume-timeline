(ns resume-timeline.mergesort
  (:use clojure.contrib.math
        clojure.test))

(declare merge-sort m-sort merge-l)

;;  Mergesort(A [1, n])
;;    Merge (Mergesort(A[1,[n/2]]), Mergesort(A[[n/2]+1,n]))

(defn merge-sort [list]
  (m-sort list))

(defn m-sort
  [l] (cond
       (== (count l) 1) l
       (== 1 1) (merge-l (map m-sort (split-at (floor (/ (count l) 2)) l)))))

(defn merge-l [[a b]]
  (loop [left right]
    (cond
     (> (first left) (first right)))))

