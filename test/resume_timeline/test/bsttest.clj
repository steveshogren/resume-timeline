(ns resume-timeline.test.bsttest
  (:use clojure.test
        ring.mock.request  
        resume-timeline.bst))

(declare makeTestTree makeNode)

(deftest test-tree-making
  (is (= :false (in-tree? 9 (makeTestTree))))
  (is (= :false (in-tree? 9 nil)))
  (is (= :true (in-tree? 7 (makeTestTree)))))

(defn mN
  ([val] (mN val nil nil))
  ([val left] (mN val left nil))
  ([val left right]
     (struct-map bintree :left left :right right :key val))) 

(defn makeTestTree []
  (mN 8
      (mN 3
          (mN 1)
          (mN 6
              (mN 4)
              (mN 7)))
      (mN 10
          nil
          (mN 14
              (mN 13)))))
