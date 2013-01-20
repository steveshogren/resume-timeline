(ns resume-timeline.bst)

(declare make-node !parent-color)

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

(defn needs-rotation?
  [node] :false)

(defn insert
  ([k n]
     (loop [key k node n]
       (cond
        (nil? node) :false 
        (> key (:key node)) (cond
                             (nil? (:right node)) (assoc node :right (make-node key (!parent-color node)))
                             :else :false)
        (< key (:key node)) (cond
                             (nil? (:left node)) (assoc node :left (make-node key (!parent-color node)))
                             :else :false))))
  ([key] (make-node key :black)))

(defn !parent-color [parent]
  (cond
   (= :red (:color parent)) :black
   :else :red))

(defn make-node
  ([key color] (make-node key color nil nil))
  ([key color left] (make-node key color left nil))
  ([key color left right]
     (struct-map bintree :left left :right right :key key :color color))) 

