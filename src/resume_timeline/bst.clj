(ns resume-timeline.bst)

(declare make-node !parent-color add-as-child)

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
        (> key (:key node)) (add-as-child node :right key)
        (< key (:key node)) (add-as-child node :left key))))
  ([key] (make-node key :black)))

(defn add-as-child [node side key]
  (cond
   (nil? (side node)) (assoc node
                        side
                        (make-node key (!parent-color node)))
   :else :false))

(defn !parent-color [parent]
  (cond
   (= :red (:color parent)) :black
   :else :red))

(defn make-node
  ([key color] (make-node key color nil nil))
  ([key color left] (make-node key color left nil))
  ([key color left right]
     (struct-map bintree :left left :right right :key key :color color))) 

