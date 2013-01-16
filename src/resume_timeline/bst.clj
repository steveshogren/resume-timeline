(ns resume-timeline.bst)

(declare make-node)

(defstruct bintree :left :right :key :val :color :parent)

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

#_(defn insert
  ([key node]
     (loop [key node parent]
       (cond
        (nil? node) ()
        (> key (:key node)) (recur (:right node))
        (< key (:key node)) (recur (:left node))))
     (make-node key :black))
  ([key] (make-node key :black)))

(defn make-node
  ([key color] (make-node key color nil nil))
  ([key color left] (make-node key color left nil))
  ([key color left right]
     (struct-map bintree :left left :right right :key key :color color))) 

