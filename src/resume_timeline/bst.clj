(ns resume-timeline.bst)

(defstruct bintree :left :right :key :color :parent)

(defn in-tree?
  "Returns true if the element is in the struct"
  [needle haystack]
  (loop [node haystack]
    (cond
     (nil? node) :false
     (== needle (:key node)) :true
     :else (cond
            (> needle (:key node)) (recur (:right node))
            (< needle (:key node)) (recur (:left node))))))

(defn is-balanced? [tree])

