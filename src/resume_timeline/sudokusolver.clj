(ns resume-timeline.sudokusolver
  (:use clojure.contrib.math))

(defn split-list [list]
  (split-at (ceil (/ (count list) 2)) list))
