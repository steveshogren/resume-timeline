(ns resume-timeline.test.bsttest
  (:use clojure.test
        ring.mock.request  
        resume-timeline.bst))

(declare make-balanced-tree mN)

(deftest test-tree-making
  (is (= :false (in-tree? 9 (make-balanced-tree))))
  (is (= :false (in-tree? 9 nil)))
  (is (= :true (in-tree? 7 (make-balanced-tree)))))

(defn mN
  ([val color] (mN val color nil nil))
  ([val color left] (mN val color left nil))
  ([val color left right]
     (struct-map bintree :left left :right right :key val :color color))) 

(defn make-balanced-tree []
  (mN 8 :black
      (mN 3 :red
          (mN 1 :black)
          (mN 6 :black
              (mN 4 :red)
              (mN 7 :red)))
      (mN 10 :red
          nil
          (mN 14 :black
              (mN 13 :red)))))
