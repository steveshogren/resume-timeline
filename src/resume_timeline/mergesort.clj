(ns resume-timeline.mergesort
  (:use clojure.contrib.math
        clojure.test))

(declare merge-sort merge-lists)

;;  Mergesort(A [1, n])
;;    Merge (Mergesort(A[1,[n/2]]), Mergesort(A[[n/2]+1,n]))

(defn merge-sort
  [list]
  (cond
   (== (count list) 1) list
   :else (merge-lists
          (map merge-sort
               (split-at (floor (/ (count list) 2)) list)))))

(defn merge-lists
  [[orig-left-list orig-right-list]]
  (loop [lefts orig-left-list
         rights orig-right-list
         return []]
    (cond
     (empty? lefts) (concat return rights)
     (empty? rights) (concat return lefts)
     :else (let [left (first lefts)
                 right (first rights)]
             (cond (< left right)  (recur (rest lefts)
                                          rights
                                          (conj return left))
                   :else  (recur lefts
                                 (rest rights)
                                 (conj return right)))))))

